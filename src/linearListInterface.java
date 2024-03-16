/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */


/**
 *
 * @author TOSHIBA
 */
public interface linearListInterface {
    
    public boolean isEmpty();

    public int size();

    public music get(int index);

    public void remove(int index);

    public void add(int index, music theElement);

    public void add(music element);

    public String printList();
}
