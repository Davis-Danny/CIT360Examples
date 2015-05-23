/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rob
 */
package pkg360.examples;
public class Message {
   public static void main(String[] args)
   {
   private Long id;
   private String text;
   private Message nextMessage;
   private Message() {}
   public Message(String text) {
      this.text = text;
   }
   public Long getId() {
      return id;
   }
   private void setId(Long id) {
      this.id = id;
   }
   public String getText() {
      return text;
   }
   public void setText(String text) {
      this.text = text;
   }
   public Message getNextMessage() {
      return nextMessage;
   }
   public void setNextMessage(Message nextMessage) {
      this.nextMessage = nextMessage;
   }
}

