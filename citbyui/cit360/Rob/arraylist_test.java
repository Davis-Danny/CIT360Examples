/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg360.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Scanner;

public class arraylist_test {
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
        
        // input new name
        Scanner inputReader = new Scanner(System.in);
        
        // add elements
        //  GOOD
        names.add("John Smith");
        names.add("Aaron Schwarze");
        names.add("Scott Noble");
        
        // element placed at point 2 instead of the bottom of the list
        //   GOOD
        names.add(2, "Mark Ball"); 
        
        // retrieve values with get()
        for(int i=0; i<names.size(); i++)
        {
        System.out.println(names.get(i));
        }
        System.out.println();
        
        // replace a value
        //   GOOD
        names.set(0, "Joseph Smith");
        
        // remove a value
        //   GOOD
        names.remove(3);
        // remove a range of items ex: (0, 3)
        
        System.out.println(names);
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
        System.out.println("--   nameCopy");
        
        // add a variable to an arraylist (line 95)
        String paulYoung = "Paul Young";
        names.add(paulYoung);
        
        // verify that a particular item is here
        if(names.contains(paulYoung))
        {
            System.out.println("Paul is here");
        }
        
        // insert a new name
        System.out.print("Insert a new name here: ");
        String newName = inputReader.nextLine();
        if (newName.trim().isEmpty()){
            System.out.println("No name.\n"); // if it's lift blank            
        }
        else {
        System.out.println(newName + "'s name was put in the list.\n"); // if there was an input
        names.add(newName);
        }
        
        if(names.containsAll(nameCopy))
        {
            System.out.println("everything in nameCopy is in names\n");
        }
        
        // delete everything in the arraylist
//        names.clear();
        
        // is it empty?
        if (names.isEmpty())
        {
            System.out.println("The ArrayList is empty");
        }
        else System.out.println("The ArrayList is not empty");
        Object[] moreNames = new Object[4];
        
        // to array converts the ArrayList into an array of objects
        moreNames = nameCopy.toArray();        
        System.out.println(Arrays.toString(moreNames));
        
        // print list and count of values
        System.out.println(names);
        int count_names = names.size();
        System.out.println("Count of names: " + count_names);
        
        // print line #
        
        System.out.println(names.get(3));
        
        
        
        
    }
}