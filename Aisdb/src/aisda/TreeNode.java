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

//Klasa definiuje wezel drzewa poszukiowan binarnych
public class TreeNode {

    public int iData;         // Element danych
    public TreeNode parent;       // Rodzic wÄ™zĹ‚a
    public TreeNode left;         // Lewy potomek wÄ™zĹ‚a
    public TreeNode right;        // Prawy lewy potomek wÄ™zĹ‚a

    public TreeNode() {
        iData = 0;
        parent = null;
        left = null;
        right = null;
    }

    @Override
    public String toString() {
        return "{" + iData + "}";
    }
}

