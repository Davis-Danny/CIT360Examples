package citbyui.cit360.davisdanny.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class CollectionsTest {

	public static void main(String[] args) {
		//listTest();
		mapTest();
	}
	
	public static void listTest(){
		
		ArrayList<String> testList = new ArrayList<String>();
		
		testList.add("Lists are pretty simple.");
		testList.add("They keep all of the elements you put in.");
		testList.add("Each element has a number associated with it, its' index."); 
		
		Iterator<String> iterator = testList.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
	}
	
	public static void mapTest(){
		HashMap<String,String> testMap = new HashMap<String, String>();
		testMap.put("First", "Maps are a little different.");
		testMap.put("Second", "Rather than an index, every value has a key.");
		testMap.put("Third", "You enter the key with the value, then use that key to retrieve it.");
		testMap.put("never", "This should not be shown");
		
		Iterator<?> iterator = testMap.entrySet().iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
	public static void iteratorTest(){
		
	}

	
}
