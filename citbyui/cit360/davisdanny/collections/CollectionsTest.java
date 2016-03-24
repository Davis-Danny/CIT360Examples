package citbyui.cit360.davisdanny.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeMap;

public class CollectionsTest {

	public static void main(String[] args) {
		// listTest();
		// mapTest();
		// iteratorTest();
		setTest();
		// treeTest();
	}

	public static void listTest() {

		ArrayList<String> testList = new ArrayList<String>();

		testList.add("Lists are pretty simple.");
		testList.add("They keep all of the elements you put in.");
		testList.add("Each element has a number associated with it, its' index.");

		for (String item : testList) {
			System.out.println(item);
		}

	}

	public static void mapTest() {
		HashMap<String, String> testMap = new HashMap<String, String>();
		testMap.put("First", "Maps are a little different.");
		testMap.put("Second", "Rather than an index, every value has a key.");
		testMap.put("Third", "You enter the key with the value, then use that key to retrieve it.");

		Iterator<?> iterator = testMap.entrySet().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public static void iteratorTest() {

		ArrayList<Integer> myList = new ArrayList<Integer>();

		// fill myList with numbers 1-10
		for (int i = 1; i <= 10; i++) {
			myList.add(i);
		}

		Iterator<Integer> myIterator = myList.iterator();
		while (myIterator.hasNext()) {
			int item = myIterator.next();

			// remove any any numbers not divisible by three
			if (item % 3 != 0) {
				myIterator.remove();
			}
		}

		// print all remaining items
		for (int item : myList) {
			System.out.println(item);
		}

	}

	public static void setTest() {
		Random rng = new Random();
		HashSet<Integer> testSet = new HashSet<Integer>();

		// fill testSet with ten random numbers
		for (int i = 1; i <= 10; i++) {
			int rand = rng.nextInt(10);
			if (testSet.add(rand)) {
				System.out.println("added " + rand);
			} else {
				System.out.println("failed to add " + rand);
			}
		}

		Iterator<Integer> iterator = testSet.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public static void treeTest() {
		Random rng = new Random();
		TreeMap<Integer, String> testTree = new TreeMap<Integer, String>();

		testTree.put(2,"Their values are stored and accessed with keys.");
		testTree.put(4,"They sort their entries by their keys.");
		testTree.put(1,"Trees are maps, similar to HashMap.");
		testTree.put(3,"Unlike HashMaps, Trees guarantee an order.");

		Iterator<?> iterator = testTree.entrySet().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}
