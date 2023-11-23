package com.bst;

import com.exceptions.BetweenLevelException;
import com.exceptions.DepthException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public abstract class AbstractBST<T extends Comparable<T>> implements IBinaryTree<T> {
	/**
	 * Method to get the size of the tree.
	 * 
	 * @return Returns number of nodes in the tree.
	 */
	public abstract int size();

	/**
	 * Method to get the depth of the tree.
	 * 
	 * @return Returns maximum depth of the tree.
	 */
	public abstract int depth();


	/**
	 * Inserta un elemento en el árbol
	 * @param content New Content to insert in the tree.
	 * @param recursive true if method is recursive, false otherwise
	 * @throws DepthException si intentamos insertar un elemento a una profundidad mayor que la permitida
	 */
	public abstract void insert(T content, boolean recursive) throws DepthException;

	/**
	 * Method to find a piece of content. If the method not find the piece return null
	 *
	 * @param content Generic content to find, must implement the .equals()
	 *                function.
	 */
	public abstract Node<T> search(T content);

	/**
	 * Get the root node of the tree.
	 * 
	 * @return Get the root node of the tree.
	 */
	public abstract Node<T> getRoot();

	/**
	 * Turn this tree into a list. The transformation is width-wise.
	 *
	 * @return List with the contents of the tree.
	 */

	public abstract ArrayList<T> toList();


	/**
	 *
	 * @param a nivel desde
	 * @param b nivel hasta
	 * @return una lista con todos los elementos que hay entre los niveles a y b, ambos incluidos
	 * @throws BetweenLevelException
	 *   El nivel a debe ser mayor que b, en caso contraio lanzará una BetweenLevelException.
	 * 	 Ninguno de los dos niveles debe ser mayor que la profundidad máxima del árbol, en caso contrario lanzará una BetweenLevelException.
	 * 	 Ninguno de los dos niveles puede ser cero o menor que cero, en caso contrario lanzará BetweenLevelException
	 */
	public abstract List<T> printBetweenLevel(int a, int b) throws BetweenLevelException, DepthException;

	/**
	 * Initialize a new tree from the subtree defined by node.
	 *
	 * @param node Root node of the new tree
	 * @return The new tree with the contents of the tree.
	 */
	public abstract BST<T> getSubTree(Node<T> node) throws DepthException;

	/**
	 * Turn this tree into an iterator. The transformation is width-wise.
	 * @return un iterador de los elementos del árbol después de hacer un recorrido en anchura del mismo .
	 */

	public abstract Iterator<T> iterator();

}