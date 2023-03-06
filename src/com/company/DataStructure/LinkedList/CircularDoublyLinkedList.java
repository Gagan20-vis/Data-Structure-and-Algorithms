package com.company.DataStructure.LinkedList;

import java.util.NoSuchElementException;

public class CircularDoublyLinkedList<T> {
    private Node<T> head;
    private int size;
    private static class Node<T>{
        T data;
        private Node<T> next;
        private Node<T> prev;

        public Node(T data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public CircularDoublyLinkedList(){
        head = null;
        size = 0;
    }

    public void InsertFirst(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            head.prev = head;
            head.next = head;
        } else {
            Node<T> tail = head.prev;
            newNode.next = head;
            head.prev = newNode;
            newNode.prev = tail;
            tail.next = newNode;
            head = newNode;
        }

        size++;
    }
    public void InsertTail(T data){
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            head.prev = head;
            head.next = head;
        } else {
            Node<T> tail = head.prev;
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
        }
        size++;
    }

    public boolean DeleteFront() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        } else if (size == 1) {
            T data = head.data;
            head = null;
            size--;
            return true;
        } else {
            Node<T> tail = head.prev;
            T data = head.data;
            head = head.next;
            head.prev = tail;
            tail.next = head;
            size--;
            return true;
        }
    }

    public boolean deleteFromTail() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        } else if (size == 1) {
            T data = head.data;
            head = null;
            size--;
            return true;
        } else {
            Node<T> tail = head.prev;
            T data = tail.data;
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
            size--;
            return true;
        }
    }

    public int size() {
        return size;
    }

    public void print() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node<T> current = head;
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != head);
            System.out.println();
        }
    }
}
