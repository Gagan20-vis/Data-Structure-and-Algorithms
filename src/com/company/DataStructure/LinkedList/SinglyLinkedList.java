package com.company.DataStructure.LinkedList;
public class SinglyLinkedList {
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public void InsertFirst(int data)
    {
        Node curr = new Node(data);
        curr.next = head;
        head = curr;
    }
    public void InsertLast(int data)
    {
        Node curr = new Node(data);
        if(head == null)
        {
            head = curr;
        }
        else {
            Node temp = head;
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
            Node curr = head;
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
            Node curr = head;
            while(curr.next.next != null){
                curr = curr.next;
            }
            curr.next = null;
            return true;
        }
    }
    public void print()
    {
        Node curr = head;
        while(curr != null)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
    public  int peek() {
        return head.data;
    }
}
