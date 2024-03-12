package com.learning.core.day7;

class Node {
    float data;
    Node next;

    public Node(float data) {
        this.data = data;
        this.next = null;
    }
}

public class D07P02
{
    private Node top;

    public D07P02() 
    {
        this.top = null;
    }

    public void push(float value) 
    {
        Node newNode = new Node(value);
        if (top == null) 
        {
            top = newNode;
        } 
        else 
        {
            newNode.next = top;
            top = newNode;
        }
    }

    public float pop() 
    {
        if (isEmpty()) 
        {
            System.out.println("Stack is empty. Cannot pop element.");
            return 0.0f;
        }
        float poppedElement = top.data;
        top = top.next;
        return poppedElement;
    }

    public boolean isEmpty() 
    {
        return (top == null);
    }

    public float peek() 
    {
        if (isEmpty()) 
        {
            System.out.println("Stack is empty. Cannot peek element.");
            return 0.0f;
        }
        return top.data;
    }

    public void display() 
    {
        if (isEmpty()) 
        {
            System.out.println("Stack is empty.");
        }
        else
        {
        	Node temp = top;
        	while (temp != null) 
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        
        System.out.println();
    }

    public static void main(String[] args) 
    {
        D07P02 stack = new D07P02();

        stack.push(10.0f);
        stack.push(20.0f);
        stack.push(30.0f);
        stack.push(40.0f);
        
        System.out.print("element of stack are : ");
        stack.display();         

        stack.pop();
        stack.pop();

        System.out.print("after popping twice : ");
        stack.display(); 
    }
}

