/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit360.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class collections {
    public static void main(String[] args)
    {
        ArrayList arrayListOne;     // create an ArrayList variable
        
        arrayListOne = new ArrayList();     // create an ArrayList object
        
        ArrayList arrayListTwo = new ArrayList();      // create in one line
        
        ArrayList<String> names = new ArrayList<String>();  // new arraylist of specific type of elements. example: string
        
        names.add("John Smith");    // add elements
        names.add("Aaron Schwarze");
        names.add("Scott Noble");
        
        names.add(2, "Mark Ball"); // element placed at point 2 instead of the bottom of the list
        
        for(int i=0; i<names.size(); i++)   // retrieve values with get()
        {
        System.out.println(names.get(i));  // print value on specific index
        }
        System.out.println();
        
        names.set(0, "Joseph Smith");   // replace a value
        
        names.remove(3);    // remove a value
            // remove a range of items ex: (0, 3)
        
        System.out.println(names);
        
        for(int i=0; i<names.size(); i++)   // retrieve values with get()
        {
        System.out.println(names.get(i));
        }
        System.out.println();
        
        for(String i : names)   // enhance 'for' to use an iterator with arraylist
        {
            System.out.println(i);
        }
        System.out.println();
        
        Iterator indivItems = names.iterator();     // creates iterator
        
        while(indivItems.hasNext())// when hasNext is called it returns true or false
        {
            
            System.out.println(indivItems.next());  // retrieves arraylist with next items
        }
        
        ArrayList nameCopy = new ArrayList();   // create arraylist without stating values
        ArrayList nameBackup = new ArrayList();
        
        nameCopy.addAll(names);     // addAll adds everrything from one array to another
        System.out.println(nameCopy);
        
        String paulYoung = "Paul Young";    // add a variable to an arraylist (line 95)
        names.add(paulYoung);
        
        if(names.contains(paulYoung))   // verify that a particular item is here
        {
            System.out.println("Paul is here");
        }
        
        names.clear();  // delete everything in the arraylist
        
        if (names.isEmpty())// is it empty?
        {
            System.out.println("The ArrayList is empty");
        }
        Object[] moreNames = new Object[4];
        
        moreNames = nameCopy.toArray();     // to array converts the ArrayList into an array of objects
        
        System.out.println(Arrays.toString(moreNames));     // toString converts items in the array into a String
        
    }
}