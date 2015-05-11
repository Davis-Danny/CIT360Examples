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
        // create an ArrayList variable
        ArrayList arrayListOne;
        
        // create an ArrayList object
        arrayListOne = new ArrayList();
        
        // create in one line
        ArrayList arrayListTwo = new ArrayList();
        
        // new arraylist of specific type of elements. example: string
        ArrayList<String> names = new ArrayList<String>();
        
        // add elements
        names.add("John Smith");
        names.add("Aaron Schwarze");
        names.add("Scott Noble");
        
        // element placed at point 2 instead of the bottom of the list
        names.add(2, "Mark Ball"); 
        
        // retrieve values with get()
        for(int i=0; i<names.size(); i++)
        {
        System.out.println(names.get(i));
        }
        System.out.println();
        
        // replace a value
        names.set(0, "Joseph Smith");
        
        // remove a value
        names.remove(3);
        // remove a range of items ex: (0, 3)
        
        System.out.println(names);
        
        // retrieve values with get()
        for(int i=0; i<names.size(); i++)
        {
        System.out.println(names.get(i));
        }
        System.out.println();
        
        // enhance 'for' to use an iterator with arraylist
        for(String i : names)
        {
            System.out.println(i);
        }
        System.out.println();
        
        // creates iterator
        Iterator indivItems = names.iterator();
        // when hasNext is called it returns true or false
        while(indivItems.hasNext())
        {
            // retrieves arraylist with next items
            System.out.println(indivItems.next());
        }
        
        // create arraylist without stating values
        ArrayList nameCopy = new ArrayList();
        ArrayList nameBackup = new ArrayList();
        
        // addAll adds everrything from one array to another
        nameCopy.addAll(names);
        System.out.println(nameCopy);
        
        // add a variable to an arraylist (line 95)
        String paulYoung = "Paul Young";
        names.add(paulYoung);
        
        // verify that a particular item is here
        if(names.contains(paulYoung))
        {
            System.out.println("Paul is here");
        }
        
        // delete everything in the arraylist
        names.clear();
        
        // is it empty?
        if (names.isEmpty())
        {
            System.out.println("The ArrayList is empty");
        }
        Object[] moreNames = new Object[4];
        
        // to array converts the ArrayList into an array of objects
        moreNames = nameCopy.toArray();
        
        // toString converts items in the array into a String
        System.out.println(Arrays.toString(moreNames));
        
    }
}