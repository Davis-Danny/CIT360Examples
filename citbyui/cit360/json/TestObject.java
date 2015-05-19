package citbyui.cit360.json;

import java.io.Serializable;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONUtilities;


@SuppressWarnings("serial")
public class TestObject implements Serializable {
	private String theString;
	private int theInt;
	private Date theDate;
	
	public TestObject(String aString, int anInt, Date aDate) {
		theString = aString;
		theInt = anInt;
		theDate = aDate;
	}
	
	public TestObject(HashMap aMapRepresentation){
		this.theString = (String)aMapRepresentation.get("theString");
		//dates are stored as timestamp strings.
		String stampString = (String)aMapRepresentation.get("theDate");
		Timestamp aStamp = Timestamp.valueOf(stampString);
		this.theDate = aStamp;
		//numbers are stored as longs or doubles.
		Long asLong = (Long)aMapRepresentation.get("theInt");
		this.theInt = asLong.intValue();
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestObject other = (TestObject) obj;
		if (theDate == null) {
			if (other.theDate != null)
				return false;
		} else if (!theDate.equals(other.theDate))
			return false;
		if (theInt != other.theInt)
			return false;
		if (theString == null) {
			if (other.theString != null)
				return false;
		} else if (!theString.equals(other.theString))
			return false;
		return true;
	}
	
	public static TestObject buildFromJson(String jsonString) throws ParseException, JSONException{
		HashMap aMap = (HashMap) JSONUtilities.parse(jsonString);
		String aString = (String) aMap.get("theString");
		int anInt = Integer.parseInt((String) aMap.get("theInt"));
		String aDateString = (String) aMap.get("theDate");
		SimpleDateFormat aFormatter = new SimpleDateFormat(
				"EEE MMM d HH:mm:ss z yyyy");
		Date aDate = aFormatter.parse(aDateString);
		TestObject anObject = new TestObject(aString, anInt, aDate);
		return anObject;
	}

}
