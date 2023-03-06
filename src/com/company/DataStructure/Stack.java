package com.company.DataStructure;

public class Stack<T> {
    private final T[] stack;
    private final int size;
    int top;
    public Stack(int s)
    {
        this.size = s;
        stack = (T[]) new Object[s];
        top = -1;
    }
    public boolean isFull()
    {
        return top == size - 1;
    }
    public boolean isempty()
    {
        return top == -1;
    }
    public void push(T data)
    {
        if (isFull())
            System.out.println("Stack Overflow");
        else
            stack[++top] = data;
    }
    public void pop()
    {
        if(isempty())
            System.out.println("Stack is Empty");
        else
            top--;
    }
    public T peek()
    {
        return stack[top];
    }
    public void print()
    {
        for(int i=0;i<=top;i++)
        {
            System.out.print(stack[i]+" ");
        }
    }
}
