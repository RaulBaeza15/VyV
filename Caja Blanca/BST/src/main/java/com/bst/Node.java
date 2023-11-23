
package com.bst;

public class Node<T> implements Cloneable {
	private T content;
	private Node<T> leftChild;
	private Node<T> rightChild;
	private final int LIM_INF = -2500;
	private final int LIM_SUP = 2500;



	/**
	 * Constructor for child nodes.
	 * @param content Content for node creation, can only be an alphanumeric string.
	 */
	public Node(T content) {

		if (content == null) {
			throw new IllegalArgumentException("El contenido no puede ser nulo");
		}

		if (!(content instanceof Integer)) {
			throw new IllegalArgumentException("Error, el árbol solo puede contener números enteros");
		}
		int dato = (Integer) content;
		if ( dato < LIM_INF || dato > LIM_SUP) {
			throw new IllegalArgumentException("El dato que intentas insertar está fuera del rango permitido");
		}

		this.content = content;
		this.leftChild=null;
		this.rightChild=null;
	}



	/**
	 * Get the content of the node.
	 * 
	 * @return Content of generic type.
	 */
	public T getContent() {
		return content;
	}

	/**
	 * Get the left child of the node, null if it does not exist.
	 * 
	 * @return Left child of the node.
	 */
	public Node<T> getLeftChild() {
		return this.leftChild;
	}

	/**
	 * Get the right child of the node, null if it does not exist.
	 * 
	 * @return Right child of the node.
	 */
	public Node<T> getRightChild() {
		return this.rightChild;
	}

	/**
	 * Modify the contents of the node.
	 * @param content
	 */
	public void setContent(T content) {
		this.content = content;
	}


	/**
	 * Link or unlink a left child.
	 * 
	 * @param node Node to be left child.
	 */
	public void setLeftChild(Node<T> node) {
		this.leftChild = node;
	}

	/**
	 * Link or unlink a right child.
	 * 
	 * @param node Node to be right child.
	 */
	public void setRightChild(Node<T> node) {
		this.rightChild = node;
	}

	/**
	 * @param node Node for comparison.
	 * @return Return true if this node equals the node passed.
	 */
	public boolean equals(Node<T> node) {
		return this.content.equals(node.getContent());
	}

	/**
	 * Return A string representation of the node and links.
	 * 
	 * @return String representation of node and links.
	 */
	@Override
	public String toString() {
		String base = this.content.toString() + " ";
		Node<T> left = this.getLeftChild();
		Node<T> right = this.getRightChild();

		if (left != null) {
			base += "Left: " + left.getContent().toString() + " ";
		}
		if (right != null) {
			base += "Right: " + right.getContent().toString() + " ";
		}

		return base;
	}
}