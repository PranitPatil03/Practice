package com.company.LinkedList.Singly_Linked_List.Questions.Detect_loop;

import java.util.LinkedList;

class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}


public class Naive {
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);

        System.out.println(isLoop(head));
    }

    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }


    static boolean isLoop(Node head){
        Node temp=new Node(1);
        Node curr=head;
        while (curr!=null){
            if (curr.next==null){
                return false;
            }
            if (curr.next==temp){
                return true;
            }
            Node curr_next=curr.next;
            curr.next=temp;
            curr=curr_next;
        }
        return false;
    }
}
