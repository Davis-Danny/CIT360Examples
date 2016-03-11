package citbyui.cit360.davisdanny.json;

import java.util.HashMap;

import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONUtilities;
import org.quickconnectfamily.json.ParseException;

public class JSONTest {

	public static void main(String[] args) {
		showString();
	}

	public static void showString() {
		TestBean testObject = new TestBean("Test", 1);
		try {
			
			//convert testObject to a JSON string
			String jsonString = JSONUtilities.stringify(testObject);
			
			//take that string and convert it to a hashmap
			HashMap<?, ?> aMap = (HashMap<?, ?>)JSONUtilities.parse(jsonString);
			
			//create a new testBean with the values from the hashmap
			TestBean testBean = new TestBean(aMap);
			
			//print out the original string and the values from the new testBean
			System.out.println("original: "+jsonString);
			System.out.println("New:");
			System.out.println("name: "+testBean.getName());
			System.out.println("ID: "+testBean.getId());
			
			
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
