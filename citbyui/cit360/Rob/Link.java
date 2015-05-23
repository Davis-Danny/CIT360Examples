

package pkg360.examples;

import java.util.LinkedList;
public class Link {
    
    // Set to public so getters & setters aren't needed
    
    public String bookName;
    public int millionsSold;
    
    // Reference to next link made in the LinkList
    // Holds the reference to the Link that was created before it
    // Set to null until it is connected to other links
    
    public Link next;
    
    public Link(String bookName, int millionsSold){
        
        this.bookName = bookName;
        this.millionsSold = millionsSold;
        
    }
    
    public void display(){
        
        System.out.println(bookName + ": " + millionsSold + ",000,000");
        
    }
    
    public String toString(){
        
        return bookName;
        
    }
        
    public static void main(String[] args){
            
        LinkedList theLinkedList = new LinkedList();
        
        // Insert Link and add a reference to the book Link added just prior
        // to the fiels next
        
        theLinkedList.add("Don Quixote");
        theLinkedList.add("A Tale of Two Cities");
        theLinkedList.add("The Lord of the Rings");
        theLinkedList.add("Harry Potter and the Sorcerer's Stone");
        
//        theLinkedList.display();
        
        System.out.println("Value of first in LinkedList " + theLinkedList.get(0) + "/n");
        
        // Removes the last Link entered
        
        theLinkedList.removeFirst();
        
//        theLinkedList.display();
        
        String searchingbook = "The Lord of the Rings";
        if (theLinkedList.contains(searchingbook))
        {System.out.println(searchingbook + " was found.");
        }
        else {System.out.println(searchingbook + " was not found.");}
        
        theLinkedList.remove("A Tale of Two Cities");
        
        System.out.println("/nA Tale of Two Cities Removed/n");
        
        System.out.println(theLinkedList);
        
    }
}