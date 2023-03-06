package com.company.DataStructure.LinkedList;
public class SinglyLinkedList<T> {
    private Node<T> head;
    static class Node<T>
    {
        private final T data;
        private Node<T> next;
        Node(T data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public void InsertFront(T data)
    {
        Node<T> curr = new Node<>(data);
        curr.next = head;
        head = curr;
    }
    public void InsertTail(T data)
    {
        Node<T> curr = new Node<>(data);
        if(head == null)
        {
            head = curr;
        }
        else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = curr;
        }
    }
    public boolean DeleteFirst()
    {
        if(head != null)
        {
            Node<T> curr = head;
            curr = curr.next;
            head = curr;
            return true;
        }
        else return false;
    }
    public boolean DeleteLast()
    {
        if(head == null)
            return false;
        else
        {
            Node<T> curr = head;
            while(curr.next.next != null){
                curr = curr.next;
            }
            curr.next = null;
            return true;
        }
    }
    public void print()
    {
        Node<T> curr = head;
        while(curr != null)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
