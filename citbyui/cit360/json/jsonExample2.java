package citbyui.cit360.json;

import java.text.ParseException;
import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.tests.TestObject;

public class jsonExample2 {
	@SuppressWarnings("unused")
	public static void main(String args[]) throws InterruptedException {
		try {
			String jsonString = "\"theString\":\"Hello there. :)\""
					+ ",\"theInt\":\"7\",\"theDate\":\"Wed Dec 31 17:17:47 MST 1969\"}";
			TestObject anObject = TestObject.buildFromJson(jsonString);
		} catch (JSONException | ParseException e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
	}
	
}
