package com.company.DataStructure.LinkedList;

class DoublyLinkedList<T> {
    private Node<T> head;

    private static class Node<T> {
        private final T data;
        private Node<T> next;
        private Node<T> prev;

        Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void InsertFirst(T data) {
        Node<T> curr = new Node<>(data);

        curr.next = head;
        curr.prev = null;
        if (head.prev != null)
            head.prev = curr;
        head = curr;
    }

    public void InsertLast(T data) {
        Node<T> curr = new Node<>(data);
        if (head == null)
            head = curr;
        else {
            Node<T> temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = curr;
            curr.prev = temp;
        }
    }

    public boolean DeleteFirst() {
        if (head == null)
            return false;
        else {
            Node<T> curr = head;
            curr = curr.next;
            head = curr;
            return true;
        }
    }

    public boolean DeleteLast() {
        if (head == null)
            return false;
        else {
            Node<T> curr = head;
            while (curr.next.next != null)
                curr = curr.next;
            curr.next = null;
            return true;
        }
    }
    public void print() {
        Node<T> curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
