/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aisdb;

import java.util.ArrayList;

public class ArrayListList {
    private ArrayList<Object> oList;
    public ArrayListList(){
        oList=new ArrayList<Object>();
    }
    public boolean addLast(Object elem){
        return oList.add(elem);
    }
    public Object removeLast(){
        int lastIndex=oList.size()-1 ;
        return oList.remove(lastIndex);
    }
    public Object get(int index){
        return oList.get(index);
    }
    public Object find(Object elem){
        return oList.indexOf(elem);
    }
    public int size(){
        return oList.size();
    }
    public Object remove(int index){
        return oList.remove(index);
    }
    public void print(){
        for(int i=0;i<oList.size();i++){
            System.out.println(oList.get(i));
        }
    }
    public static void main(String[] args){
        ArrayListList theList= new ArrayListList();
        theList.addLast("Elem1");
        theList.addLast("Elem2");
        theList.addLast("Elem3");
        theList.addLast("Elem4");
        
        theList.print();
        System.out.println();
        theList.remove(1);
        theList.remove(1);
        theList.print();
        System.out.println();
        theList.addLast("Elem5");
        theList.addLast("Elem6");
        theList.print();
        
        
        
    }
}
