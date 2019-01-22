/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aisda;


import aisda.ListElem;
import java.util.Random;

public class SortedLinkedList {

    private ListElem first;  // Referencja do pierwszego elementu listy

    public SortedLinkedList() { // Konstruktor
        first = null;    // Lista nie ma jeszcze elementĂłw
    }

    public boolean isEmpty() { // Zwraca true, jeĹĽeli lista jest pusta
        return (first == null);
    }

    public void insertFirst(int value) {
        ListElem newElem = new ListElem(value);
        newElem.next = first;       // newElem --> dotychczasowy pierwszy element
        first = newElem;            // first --> newElem
    }

    public void insert(int value) { // Wstawianie z zachowaniem porzÄ…dku
        ListElem newElem = new ListElem(value);
        ListElem previous = null;
        ListElem current = first;            // rozpoczynamy od poczÄ…tku listy

        // dopĂłki nie koniec listy i elementy sa mniejsze niz value
        while (current != null && newElem.iData > current.iData) {
            previous = current;
            current = current.next;   // Przechodzimy do nastÄ™pnego elementu
        }

        if (previous == null) {
            first = newElem;   // Znalazl na poczatku listy
        } else {
            previous.next = newElem; /// nie na poczÄ…tku...
        }
        newElem.next = current;
    }
    // -------------------------------------------------------------

    public ListElem find(int elem) { // Wyszukiwanie elementu
        if (isEmpty()) {
            return null;
        }

        ListElem current = first;  // Rozpoczynamy od pierwszego elementu
        while (current.iData != elem) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }
// -------------------------------------------------------------

    public ListElem deleteFirst() { // UsuniÄ™cie pierwszego elementu listy
        if (isEmpty()) {
            return null;
        }
        ListElem temp = first;
        first = first.next;
        return temp;
    }

    public ListElem delete(int elem) { // usuwanie elementu z listy
        if (isEmpty()) {
            return null;
        }

        ListElem current = first;
        ListElem previous = null;

        while (current.iData != elem) {
            if (current.next == null) {
                return null; //Nie znalazl elementu
            } else {
                previous = current;     // Przechodzimy do nastÄ™pnego elementu
                current = current.next;
            }
        }
        // Usuwamy znaleziony element
        if (previous == null) { // jeĹĽeli jest to pierwszy element...
            first = first.next; // ...zmieniamy pole first
        } else { // jeĹĽeli nie jest to pierwszy
            previous.next = current.next;   // Usuwamy aktualny element przez jego pominiecie
        }
        return current; //Zwracamy usuniety element
    }
// -------------------------------------------------------------

    public void print() {
        System.out.print("Lista (poczÄ…tek-->koniec): ");
        ListElem current = first;   // Zaczynamy na poczÄ…tku listy
        while (current != null) { // DopĂłki nie koniec listy...
            System.out.print(current.toString() + " ");
            current = current.next;  // ...przechodzimy do nastÄ™pnego elementu.
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Tworzymy listÄ™
        SortedLinkedList theSortedList = new SortedLinkedList();

        Random rand = new Random();
        for (int j = 0; j < 4; j++) { // wypeĹ‚niamy jÄ… elementami losowymi
            int number = rand.nextInt(100);
            theSortedList.insert(number);
        }

        //Wypisujemy liste
        System.out.println(theSortedList.find(0));
        theSortedList.print();
    }
}

