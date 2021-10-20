/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasadt1358;

/**
 *
 * @author estra
 */
public class DoubleLinkedList {

    public int getSize() {
        return size;
    }

    private class NodoDoble<T> {

        T data;
        NodoDoble next;
        NodoDoble prev;

        public NodoDoble() {
        }

        public NodoDoble(T data, NodoDoble next, NodoDoble prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    private NodoDoble head;
    private NodoDoble tail;
    private int size;

    public DoubleLinkedList() {
    }

    public boolean isEmptry() {
        return this.head == null;
    }

    public void append(Object valor) {
        if (this.tail == null) {
            this.tail = new NodoDoble(valor, null, null);
            this.head = this.tail;
        } else {
            this.tail.next = new NodoDoble(valor, null, this.tail);
            this.tail = this.tail.next;
        }
        this.size++;
    }

    public void transversal() {
        NodoDoble currNode = this.head;
        while (currNode != null) {
            System.out.println(currNode.data + "--->");
            currNode = currNode.next;
        }
        System.out.println("");

    }

    public void removeFromHead(Object valor) {
        NodoDoble currNode = this.head;
        while (currNode.data != valor || currNode != null) {

        }
    }

}
