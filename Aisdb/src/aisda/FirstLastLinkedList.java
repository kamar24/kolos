/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aisda;

/**
 *
 * @author cp24
 */
public class FirstLastLinkedList {
    private ListElem first;  // Referencja do pierwszego elementu listy
    private ListElem last;   // Referencja do ostatniego elementu listy

    public FirstLastLinkedList() { // Konstruktor
        first = null;    // Lista nie ma jeszcze elementĂłw
        last = null;
    }

    public boolean isEmpty(){ // Zwraca true, jeĹĽeli lista jest pusta
        return (first == null);
    }

    public void insertFirst(int value) { // Wstawienie na poczatek listy
        ListElem newElem = new ListElem(value);
        if (isEmpty()) {
            last = newElem;
        }
        newElem.next = first;
        first = newElem;
    }

    public void insertLast(int value) { // Wstawienie na koniec listy
        ListElem newElem = new ListElem(value);
        if (isEmpty()) {
            first = newElem;
        } else {
            last.next = newElem;
        }
        last = newElem;
    }

    public ListElem deleteFirst() { // UsuniÄ™cie pierwszego elementu listy
        if (isEmpty()) {
            return null;
        }
        ListElem temp = first;
        if (first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;
    }

// -------------------------------------------------------------
    public void print() {
        System.out.print("Lista (poczÄ…tek-->koniec): ");
        ListElem current = first;   // Zaczynamy na poczÄ…tku listy
        while (current != null) // DopĂłki nie koniec listy...
        {
            System.out.print(current.toString() + " ");
            current = current.next;  // ...przechodzimy do nastÄ™pnego elementu.
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FirstLastLinkedList theList = new FirstLastLinkedList();

        theList.insertFirst(22);       // wstawiamy na poczÄ…tek
        theList.insertFirst(44);
        theList.insertFirst(66);

        theList.insertLast(11);        // wstawiamy na koniec
        theList.insertLast(33);
        theList.insertLast(55);

        theList.print();         // wypisujemy zawartoĹ›Ä‡ listy

        theList.deleteFirst();         // usuwamy pierwsze dwa elementy
        theList.deleteFirst();

        theList.print();         // wypisujemy ponownie

    }
}

    
