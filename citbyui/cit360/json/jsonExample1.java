package citbyui.cit360.json;

import java.util.Date;

import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONUtilities;
import org.quickconnectfamily.json.tests.TestObject;

public class jsonExample1 {

	public static void main(String args[]) {
		TestObject anObject = new TestObject("Hello there.", 7, new Date(
				1067899));
		try {
			String jsonString = JSONUtilities.stringify(anObject);
			System.out.println(jsonString);
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
}
