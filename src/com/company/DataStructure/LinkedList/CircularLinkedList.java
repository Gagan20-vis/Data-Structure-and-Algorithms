package com.company.DataStructure.LinkedList;
public class CircularLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;
    private static class Node<T> {
        private final T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public void InsertTail(T data) {
        Node<T> newNode = new Node<>(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.tail.next = this.head;
        this.size++;
    }

    public void InsertFront(T data){
        Node<T> newNode = new Node<>(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = this.head;
            head = newNode;
        }
        this.tail.next = this.head;

        this.size++;
    }

    public void delete(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (index == 0) {
            this.head = this.head.next;
            this.tail.next = this.head;
        } else {
            Node<T> current = this.head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            if (index == this.size - 1) {
                this.tail = current;
                this.tail.next = this.head;
            }
        }
        this.size--;
    }

    public T get(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        Node<T> current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int size() {
        return this.size;
    }

    public void print(){
        Node<T> curr = head;
        int x = 0;
        while(x!=size){
            System.out.print(curr.data+" ");
            curr = curr.next;
            x++;
        }
    }
}
