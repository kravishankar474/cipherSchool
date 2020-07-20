package com.company;

import javax.print.attribute.standard.NumberOfDocuments;
import java.math.BigInteger;
import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;

    }

    void printl(Node head){
        while(head!=null){
            System.out.print(head.data);
            head = head.next;
        }
    }

    Node insertAtHead(Node head, int data){
        if (head==null){
            return   new Node(data);
        }
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
        return  head;
    }

    Node insertAtEnd(Node head, int data){

        if(head==null){
            return new Node(data);
        }
        Node temp = new Node(data);
        while(head.next!=null){
            head = head.next;
        }
        head.next= temp;
        return  head;
    }
    void insertAtNPosition(Node head, int data, int pos){
        Node temp = new Node(data);
        for(int i=1; i<pos-1; i++){
            head = head.next;
        }
        temp.next = head.next;
        head.next = temp;

    }

    Node deleteAtfirst(Node head){
        Node temp = head.next;
       // head.next = null;
        return temp;

    }
    void deleteAtLast(Node head){
        int count = 0;
        while (head.next!=null){
            count++;
        }
        for(int i=1; i<count; i++){
            head = head.next;
        }
        head.next = null;
    }
}

public class Main {


    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        Node head = new Node(1);
        head = head.insertAtHead(head, 0);//we have to update the main head function.
        head.printl(head);
        System.out.println();
        head.insertAtEnd(head, 2);
        head.printl(head);
        System.out.println();
        head.insertAtNPosition(head, 4, 3);
        head.printl(head);
        System.out.println();
        head.insertAtNPosition(head, 5, 2);
        head.printl(head);
        System.out.println();
        head = head.deleteAtfirst(head);
        head.printl(head);
        System.out.println();
        head.deleteAtLast(head);
        head.printl(head);


    }
}
