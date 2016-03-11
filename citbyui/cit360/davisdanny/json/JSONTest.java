package citbyui.cit360.davisdanny.json;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONInputStream;
import org.quickconnectfamily.json.JSONOutputStream;
import org.quickconnectfamily.json.JSONUtilities;
import org.quickconnectfamily.json.ParseException;

public class JSONTest {

	public static void main(String[] args) {
		toStringAndBack();
		toFileAndBack();
		
	}

	public static void toStringAndBack() {
		TestBean testObject = new TestBean("stringTest", 1);
		try {
			
			//convert testObject to a JSON string
			String jsonString = JSONUtilities.stringify(testObject);
			
			//take that string and convert it to a hashmap
			HashMap<?, ?> aMap = (HashMap<?, ?>)JSONUtilities.parse(jsonString);
			
			//create a new testBean with the values from the hashmap
			TestBean newBean = new TestBean(aMap);
			
			//print out the original string and the values from the new testBean
			System.out.println("original: "+jsonString);
			printBean(newBean);
			
			
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public static void toFileAndBack(){
		File file = new File("test.json");
		fromFile(file);
	}
	
	public static void toFile(File file){
		TestBean testObject = new TestBean("fileTest", 2);
		try {
			FileOutputStream fileStream = new FileOutputStream(file);
			JSONOutputStream jsonOut = new JSONOutputStream(fileStream);
			jsonOut.writeObject(testObject);
			jsonOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void fromFile(File file){
		HashMap<?, ?> map;
		TestBean newBean = null;
		try {
			FileInputStream fileStream = new FileInputStream(file);
			JSONInputStream jsonIn = new JSONInputStream(fileStream);
			map = (HashMap<?, ?>) jsonIn.readObject();
			jsonIn.close();
			newBean = new TestBean(map);
			printBean(newBean);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void printBean(TestBean bean){
		System.out.println("Bean name: "+bean.getName());
		System.out.println("ID: "+bean.getId());
	}
	
}
