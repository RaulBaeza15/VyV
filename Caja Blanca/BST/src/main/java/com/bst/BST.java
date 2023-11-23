package com.bst;

import com.exceptions.BetweenLevelException;
import com.exceptions.DepthException;

import java.util.*;

public class BST<T extends Comparable<T>> extends AbstractBST<T> {


    private Node<T> root;
    private final int MAX_DEPTH = 50;

    /**
     * Constructor sin parámetros, inicializa la raíz a nulo
     */
    public BST() {
        this.root = null;
    }

    /**
     * Constructor con parámetro
     * @param content Crea un árbol con un nodo cuyo contenido será content
     */
    public BST(T content) {
        this.root = new Node<T>(content);
    }

    @Override
    public int size() {
        return this.toList().size();
    }


    @Override
    public int depth() {
        return depth(this.root);
    }

    private int depth(Node<T> a) {
        if (a == null)
            return 0;
        else {
            return Math.max(1 + depth(a.getLeftChild()), 1 + depth(a.getRightChild()));
        }
    }


    @Override
    public void insert(T content, boolean recursive) throws DepthException {
        Node<T> nodo = null;
        if (this.root == null) {
            nodo = new Node<>(content);
            this.root = nodo;
        } else {
            if (recursive) {
                this.insertRecursive(content, this.getRoot(), depth());
            } else {
                this.insertIterative(content, this.getRoot());
            }
        }
    }

    private void insertRecursive(T content, Node<T> a, int altura) throws DepthException {
        if (content.compareTo(a.getContent()) > 0) {
            if (a.getRightChild() == null) {
                if (altura == this.MAX_DEPTH) {
                    throw new DepthException("Intentas insertar en la altura " + (altura + 1) + ", la máxima permitida es " + this.MAX_DEPTH);
                } else {
                    a.setRightChild(new Node<>(content));
                }
            } else {
                insertRecursive(content, a.getRightChild(), altura);
            }
        } else if (content.compareTo(a.getContent()) < 0) {
            if (a.getLeftChild() == null) {
                if (altura == this.MAX_DEPTH) {
                    throw new DepthException("Intentas insertar en la altura " + (altura + 1) + ", la máxima permitida es " + this.MAX_DEPTH);
                } else {
                    a.setLeftChild(new Node<>(content));
                }
            } else {
                insertRecursive(content, a.getLeftChild(), altura);
            }

        } else {
            throw new IllegalArgumentException("El elemento " + content + " ya está en el árbol");
        }
    }

    private void insertIterative(T content, Node<T> a) throws DepthException {
        Node<T> nuevoNodo = new Node<T>(content);
        if (root == null) {
            root = nuevoNodo;
        } else {
            int altura = 1;
            Node<T> aux = root;
            while (aux != null) {
                if (aux.getRightChild() == null && aux.getLeftChild() == null) {
                    if (altura == this.MAX_DEPTH) {
                        throw new DepthException("Intentas insertar en la altura " + (altura + 1) + ", la máxima permitida es " + this.MAX_DEPTH);
                    }
                    if (content.compareTo(aux.getContent()) > 0) {
                        aux.setRightChild(nuevoNodo);
                        aux = null;
                    } else if (content.compareTo(aux.getContent()) < 0) {
                        aux.setLeftChild(nuevoNodo);
                        aux = null;
                    } else {
                        throw new IllegalArgumentException("El elemento " + content + " ya está en el árbol");
                    }
                } else if (content.compareTo(aux.getContent()) > 0 && aux.getRightChild() == null) {
                    aux.setRightChild(nuevoNodo);
                    aux = null;
                } else if (content.compareTo(aux.getContent()) < 0 && aux.getLeftChild() == null) {
                    aux.setLeftChild(nuevoNodo);
                    aux = null;
                } else if (content.compareTo(aux.getContent()) == 0) {
                    throw new IllegalArgumentException("El elemento " + content + " ya está en el árbol");
                } else {
                    if (content.compareTo(aux.getContent()) > 0) {
                        aux = aux.getRightChild();
                        altura++;
                    } else if (content.compareTo(aux.getContent()) < 0) {
                        aux = aux.getLeftChild();
                        altura++;
                    } else {
                        throw new IllegalArgumentException("El elemento " + content + " ya está en el árbol");
                    }
                }

            }

        }
    }

    @Override
    public Node<T> search(T content) {
        Node<T> aux = this.root;
        boolean enc = false;
        while (aux != null && !enc) {
            if (content.compareTo(aux.getContent()) == 0) {
                enc = true;
            } else if (content.compareTo(aux.getContent()) > 0) {
                aux = aux.getRightChild();
            } else {
                aux = aux.getLeftChild();
            }
        }
        return aux;
    }

    @Override
    public Node<T> getRoot() {
        return root;
    }

    @Override
    public ArrayList<T> toList() {
        ArrayList<T> lista = new ArrayList<T>();
        inOrden(this.getRoot(), lista);
        return lista;
    }

    private void inOrden(Node<T> a, ArrayList<T> lista) {
        if (a != null) {
            inOrden(a.getLeftChild(), lista);
            lista.add(a.getContent());
            inOrden(a.getRightChild(), lista);
        }
    }


   @Override
    public List<T> printBetweenLevel(int a, int b) throws BetweenLevelException, DepthException {
        if (a == 0 || b == 0) {
            throw new BetweenLevelException("Nivel desde o hasta es igual a cero");
        }
        if (a < 0 || b < 0) {
            throw new BetweenLevelException("Nivel desde o hasta es menor que cero");
        }
        if (a > b) {
            throw new BetweenLevelException("Nivel desde debe ser menor o igual que nivel hasta");
        }
        if (a > this.depth() || b > this.depth()) {
            throw new BetweenLevelException("Nivel desde o hasta es mayor que la profundidad del árbol");
        }
        ArrayList<T> lista = new ArrayList<T>();
        Node<T> leftNode = this.getRoot().getLeftChild();
        Node<T> rightNode = this.getRoot().getRightChild();
        lista.add(this.getRoot().getContent());

        if (leftNode != null) {
            BST<T> left = this.getSubTree(leftNode);
            lista.addAll(left.toList());
        }

        if (rightNode != null) {
            BST<T> right = this.getSubTree(rightNode);
            lista.addAll(right.toList());
        }

        return lista;
    }

    @Override
    public BST<T> getSubTree(Node<T> node) throws DepthException {
        if (node == null) {
            throw new IllegalArgumentException("El nodo no puede ser null");
        }

        if (this.search(node.getContent()) == null) {
            throw new IllegalArgumentException("El nodo debe pertenecer al árbol");
        }

        BST<T> newTree = new BST<T>(node.getContent());
        Node<T> leftNode = node.getLeftChild();
        Node<T> rightNode = node.getRightChild();
        if (leftNode != null) {
            newTree.insertRecursive(leftNode.getContent(), newTree.getRoot(), newTree.depth());
        }
        if (rightNode != null) {
            newTree.insertRecursive(rightNode.getContent(), newTree.getRoot(), newTree.depth());
        }
        return newTree;
    }

    @Override
    public Iterator<T> iterator() {
        ArrayList<T> it = new ArrayList<>();
        Queue<T> queue = new ArrayDeque<T>();
        Node<T> aux = this.root;
        queue.add(aux.getContent());
        while(!queue.isEmpty()){
            T t = queue.poll();
            it.add(t);
            Node<T> node = this.search(t);
            if(node.getLeftChild()!=null){
                queue.add(node.getLeftChild().getContent());
            }
            if(node.getRightChild()!=null){
                queue.add(node.getRightChild().getContent());
            }
        }
        Iterator iterator = it.iterator();
        return iterator;
    }
}
