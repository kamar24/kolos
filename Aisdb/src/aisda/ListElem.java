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
public class ListElem {

    public int iData;              // Dana w elemencie listy (liczba calkowita)
    public ListElem next;          // Referencja do nastÄ™pnego elementu listy

    public ListElem(int iData) // konstruktor
    {
        this.iData = iData;   // Inicjalizacja danych
        next = null; //Pole next ma na poczatku wartosc null
    }

    @Override
    public String toString() {
        return Integer.toString(iData);
    }
}