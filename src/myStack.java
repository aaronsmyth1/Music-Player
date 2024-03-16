
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TOSHIBA
 */
public class myStack implements stackInterface{

    private ArrayList<music> theStack;
    
    public myStack(){
        theStack = new ArrayList<music>();
    }
    
    public int size(){
        return theStack.size();
    }
    
    public boolean isEmpty(){
        return theStack.isEmpty();
    }
    
    public boolean isFull(){
        return false;
    }
    
    public Object pop(){
        if(!(theStack.isEmpty())){
            return theStack.remove(0);
        }else{
            return null;
        }
    }
    
    public void push(Object newItem){
          theStack.add(0, (music)newItem) ; 
    }
        
    public String displayStack(){
        String result = new String();
        for(int i = 0;i<theStack.size();i++){
            result = theStack.toString();
           // result.concat(theStack.get(i) + ", ");
        }
        return result;
    }
    
    public Object frontElement(){
        if(!(theStack.isEmpty())){
            return theStack.get(0);
        }else{
            return null;
        }
    }
     
    
    
}
