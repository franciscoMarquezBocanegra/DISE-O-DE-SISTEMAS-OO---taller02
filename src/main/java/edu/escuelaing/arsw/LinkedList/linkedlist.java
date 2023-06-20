package edu.escuelaing.arsw.LinkedList;

public class linkedlist {
    private Node head;
    private int size;

    public linkedlist() {
        size = 0;
    }

    public void agregar(double elemento) {
        if (head != null) {
            Node actual = head;
            while (actual.next != null) {
                actual = actual.next;
            }

            actual.next = new Node(elemento);
            actual.next.head = actual;
        } else {
            head = new Node(elemento);
            head.head = null;
        }
        size++;
    }

    public void eliminar() {
        if (head != null) {
            Node actual = head;
            while (actual.next != null) {
                actual = actual.next;
            }
            actual = null;
        }
        size--;
    }

    public Node get(int index) {
        if (index < size) {
            int count = 0;
            Node aux = head;

            while (aux != null) {
                if (count == index) {
                    return aux;
                }
                aux = aux.next;
                count++;
            }
        }
        return null;
    }

    public int getSize() {
        return size;
    }

}