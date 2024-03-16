/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author TOSHIBA
 */
public interface stackInterface {
    
   public boolean isEmpty();
   
   public boolean isFull();
           
   public void push(Object newItem);
   
   public Object pop();
   
   public int size();

   public String displayStack();
   
   public Object frontElement();
    
}
