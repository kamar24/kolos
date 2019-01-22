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
public class LinkedListQueue {
    private LinkedList<Integer> intQueue;

    public LinkedListQueue() {
        intQueue= new LinkedList<Integer>();
    }
    
    public void insert (int elem){
        intQueue.addLast(new Integer (elem));
    }
    public int remove(){
        int firstelem=intQueue.getFirst().intValue();
        intQueue.removeFirst();
        return firstelem;
    }
    public int peek(){
        return intQueue.peekFirst().intValue();
    }
    public boolean isEmpty(){
        return intQueue.isEmpty();
    }
    public int size(){
        return intQueue.size();
    }

    public static void main(String[] args){
        LinkedListQueue theQueue = new LinkedListQueue(); 
        theQueue.insert(1);
        theQueue.insert(5);
        theQueue.insert(4);
        theQueue.remove();
        theQueue.remove();
        theQueue.insert(70);
        theQueue.insert(13);
        while(!theQueue.isEmpty()){
            System.out.println(theQueue.remove());
        }
        
        
        
        
        
        
    }

}

