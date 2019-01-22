/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aisdb;

import java.util.ArrayList;

/**
 *
 * @author cp24
 */
public class ArrayListQueue {
    private ArrayList<Integer> intQueue; 

    public ArrayListQueue() {
       intQueue = new ArrayList<Integer>();
    }
    public void insert (int elem){
        intQueue.add(new Integer(elem));
    }
    public int remove(){
        int firstelem= intQueue.get(0).intValue();
        intQueue.remove(0);
        return firstelem;
    }
    public int peek(){
        return intQueue.get(0).intValue();
    }
    public boolean isEmpty(){
        return intQueue.isEmpty();
    }
    public int size(){
        return intQueue.size();
    }
    public static void main(String[] args){
        ArrayListQueue theQueue=new ArrayListQueue();
        theQueue.insert(1);
        theQueue.insert(2);
        theQueue.insert(30);
        theQueue.remove();
        theQueue.remove();
        theQueue.insert(10);
        theQueue.insert(5);
        while(!theQueue.isEmpty()){
            
            System.out.println(theQueue.remove());

    }
    }



}
