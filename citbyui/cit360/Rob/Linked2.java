/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg360.examples;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author Rob
 */
public class Linked2 {
    public static void main(String[] args){
        
        LinkedList linkedListOne = new LinkedList();            //List open to all data types
        
        LinkedList<String> names = new LinkedList<String>();    //List specific only to strings
        
        names.add("Aaron Adams");
        names.add("Bob Boston");
        names.addLast("Carol Collins");     //Add it to the end of the list
        names.addFirst("George Gardner");     //Add it to the beginning
        System.out.println(names);
        names.add(0, "Ethan Evans");       //Insert it into line 0
        names.set(2, "Fred Frankinstein");        //Replace line 2 with this value
        System.out.println(names);
        names.remove(4);                    //Remove value of line 4
        names.remove("George Gardner");       //Remove value from the list
                
        /* This for loop lists the full content of the "names" list
        by printing the first line, re-running the loop for each following
        line that has a value */
        for(String name : names){       //determine conditions and list to loop through.
            System.out.println(name);   //assign operations for the loop
        }
        
        System.out.println("\nFirst Index: " + names.get(0));       //Print value at line 0
        System.out.println("\nLast Index: " + names.getLast());     //Print value at last line
        
        LinkedList<String> nameCopy = new LinkedList<String>(names);    //Duplicate list.  Here, creating 'nameCopy' from contents of 'names'
        
        System.out.println("\nnameCopy: " + nameCopy);  //prints it all
        
        if(names.contains("Ethan Evans")){         //verifies if a particular value exists in the list
            System.out.println("\nEthans Here");     
        }
        
        if(names.containsAll(nameCopy)){            //Verifies if this list has all the contents of the other list
            System.out.println("\nCollections the Same");
        }
        
        System.out.println("\nBob index at: " + names.indexOf("Bob Boston"));     //where is this specific item at?
        System.out.println("\nList Empty: " + names.isEmpty());                 //Is this list empty?  Yes/No
        System.out.println("\nHow many: " + names.size());                      //How big is the list?
        System.out.println("\nLook without Error: " + names.peek());            //Look at an element without an error if there isn't a value
        System.out.println("\nRemove First Element: " + nameCopy.poll());       //View and remove the first element
        System.out.println("\nRemove Last Element: " + nameCopy.pollLast());    //View and remove the last element
        
        nameCopy.push("Ethan Evans");  //Put an element at the beginning of the list
        nameCopy.pop();                 //Removes the element at the beginning.  Just like RemoveFirst
        
        for(String name : nameCopy){    //Similar to first loop, only a different list to loop
            System.out.println(name);
        }
        Object[] nameArray = new Object[4];     //Object named 'nameArray' with only 4 contents
        nameArray = names.toArray();            //Converting content of 'nameArray' object to an Array
        
        System.out.println("\nSystem.out.println(Arrays.toString(nameArray))");
        System.out.println(Arrays.toString(nameArray));     //Print values of 'nameArray' in forms of strings
        
        names.clear();      //Remove all values of the list
        
        System.out.println(names);
        System.out.println(nameCopy);
    }
}
