/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aisdb;

import java.util.LinkedList;

/**
 *
 * @author cp24
 */
public class LinkedListList {
    private LinkedList<Object> oList;
    public LinkedListList(){
        oList= new LinkedList<Object>();
    }
    public boolean isEmpty(){
        return oList.isEmpty();
    }
    public void insertFirst(Object elem){
        oList.addFirst(elem);
    }
    public void insertLast(Object elem){
        oList.addLast(elem);
    }
    public Object deleteFirst(){
       return oList.removeFirst();
    }
    public Object deleteLast(){
        return oList.removeLast();
    }
    public Object getFirst(){
        return oList.getFirst();
    }
    public Object getLast(){
        return oList.getLast();
    }
    public int size(){
        return oList.size();
    }
    public Object find(Object elem){
        return oList.indexOf(elem);
    }
    public void print(){
        for(int i=0;i<oList.size();i++)
        {
            System.out.println(oList.get(i));
        }
    }
    public static void main(String[] args){
        LinkedListList theList= new LinkedListList();
    theList.insertFirst("C");
    theList.insertFirst("B");
    theList.insertFirst("A");
    theList.print();
    System.out.println();
    theList.insertLast("D");
    theList.insertLast("E");
    theList.print();
    System.out.println();
    theList.deleteFirst();
    theList.deleteLast();
    theList.print();
    System.out.println();
    
    System.out.println(theList.find("B"));
    System.out.println(theList.find("g"));
    
    
    }
}
