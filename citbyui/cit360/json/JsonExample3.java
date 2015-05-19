package citbyui.cit360.json;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;

import org.quickconnectfamily.json.JSONOutputStream;
import org.quickconnectfamily.json.tests.TestObject;

public class JsonExample3 {

	public static void main(String[] args) {
		File aFile = new File("test.json");
		try {
			FileOutputStream aFileStream = new FileOutputStream(aFile);
			JSONOutputStream jsonOut = new JSONOutputStream(aFileStream);
			jsonOut.writeObject(new TestObject("Hello there.", 7, new Date(1067899)));
			jsonOut.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
