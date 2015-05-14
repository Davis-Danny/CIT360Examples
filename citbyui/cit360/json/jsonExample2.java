package citbyui.cit360.json;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONUtilities;
import org.quickconnectfamily.json.tests.TestObject;

public class jsonExample2 {
	public static void main(String args[]) {
		try {
			String jsonString = "{\"theString\":\"Hello there.\",\"theInt\":\"7\",\"theDate\":\"Wed Dec 31 17:17:47 MST 1969\"}";
			HashMap aMap = (HashMap) JSONUtilities.parse(jsonString);
			String aString = (String) aMap.get("theString");
			int anInt = Integer.parseInt((String) aMap.get("theInt"));
			String aDateString = (String) aMap.get("theDate");
			SimpleDateFormat aFormatter = new SimpleDateFormat(
					"EEE MMM d HH:mm:ss z yyyy");
			Date aDate = aFormatter.parse(aDateString);
			TestObject anObject = new TestObject(aString, anInt, aDate);
		} catch (JSONException | ParseException e) {
			e.printStackTrace();
		}
	}
}
