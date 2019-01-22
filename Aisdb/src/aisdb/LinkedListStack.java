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
public class LinkedListStack {
    private  LinkedList<Integer> intStack;
    
    public LinkedListStack(){
        intStack = new LinkedList<>();
    }
    
    public void insert(int elem){
        intStack.push(new Integer (elem));
    }
    public int remove(){
        return intStack.remove().intValue();
    }
    public int peek(){
        return intStack.peek().intValue();
    }
    public boolean isEmpty(){
        return intStack.isEmpty();
    }
    public static  void main(String[] args){
        LinkedListStack theStack = new  LinkedListStack(); 
        
        theStack.insert(5);
        theStack.insert(19);
        theStack.insert(23);
        
        theStack.remove();
        theStack.remove();
        theStack.insert(100);
        theStack.insert(10);
        
        while(!theStack.isEmpty()){
            int value=theStack.remove();
            System.out.println(value);
        }
        
    
    }
    
}
