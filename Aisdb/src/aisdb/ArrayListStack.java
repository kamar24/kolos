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
public class ArrayListStack {
    private final ArrayList<Integer> intStack;
    
    public ArrayListStack(){
        intStack=new ArrayList<>();
        
    }
    public void insert(int elem){
        intStack.add(elem);
    }
    public int remove(){
       int topelem=intStack.get(intStack.size()-1);
       intStack.remove(intStack.size()-1);
       return topelem;
       
    }
    public int peek(){
        return intStack.get(intStack.size()-1);
    }
    public boolean isEmpty(){
        return intStack.isEmpty();
    }
     public static void main(String[] args) {
        ArrayListStack theStack=new ArrayListStack();
        theStack.insert(5);
        theStack.insert(7);
        theStack.insert(10);
    
        theStack.remove();
        theStack.remove();
        theStack.insert(1);
        theStack.insert(3);
        while(!theStack.isEmpty()){
            int value=theStack.remove();
            System.out.println(value);
            
        }
        
    }
}
