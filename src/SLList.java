/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author TOSHIBA
 */
public class SLList implements linearListInterface{
    
    private Node head;
    private int iSize;
    private Node curNode;
    private Node prevNode;

    public SLList() {
        head = null;
        iSize = 0;
        curNode = null;
        prevNode = null;
    }

    public boolean isEmpty() {
        if (iSize == 0) {
            return true;
        } else {
            return false;
        }

    }

    public int size() {
        return iSize;
    }

    // assume the index is in the correct range
    public void add(int iIndex, music item) {
        // special case of adding at the head of the list ( on the first position)
        if (iIndex == 1) {
            Node newNode = new Node(item, head);
            head = newNode;
        } else {
            setCurrent(iIndex);
            Node newNode = new Node(item, curNode);
            prevNode.setNext(newNode);
        }
        // as a new one was added the size counter must be increased by 1
        iSize = iSize + 1;
    }

    //add an elemenst at the end of the list (on the last position)
    public void add(music element) {
        Node newNode = new Node(element, null);
        if (head == null) {
            head = newNode;
        } else {
            setCurrent(iSize);
            curNode.setNext(newNode);
        }
        iSize = iSize + 1;
    }

    public music get(int iIndex) {
        setCurrent(iIndex);
        return curNode.getElement();
    }

    public void remove(int iIndex) {
        // special case for removing the head of the list / first node.
        if (iIndex == 1) {
            head = head.getNext();
        } else {
            // find the previous and current nodes
            setCurrent(iIndex);
            prevNode.setNext(curNode.getNext());
        }
        // as one node was removed the size counter must be decreased by 1
        iSize = iSize - 1;
    }

    private void setCurrent(int index) {
        // sets curNode to the node at position specified by index
        // sets prevNode to the node previous to curNode
        int iCount;
        prevNode = null;
        curNode = head;
        for (iCount = 1; iCount < index; iCount++) {
            prevNode = curNode;
            curNode = curNode.getNext();
        }
    }

    // printlist() method prints out the content of the list                                  
    public String printList() {
        StringBuilder result = new StringBuilder();
        Node aNode = head;
        while (aNode != null) {
            result.append(aNode.toString()).append("\n");
            System.out.println(aNode.toString());
            aNode = aNode.getNext();
        }
        return result.toString();
    }
}

