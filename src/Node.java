/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author TOSHIBA
 */
public class Node {
    
    private music element;
    private Node next;

    public Node(music inElement, Node inNode) {
        this.element = inElement;
        this.next = inNode;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node inNode) {
        this.next = inNode;
    }

    public music getElement() {
        return element;
    }

    public void setElement(music inElement) {
        this.element = inElement;
    }

    public String toString() {
        return element.toString();
    }

}
