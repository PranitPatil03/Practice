package com.company.LinkedList.Singly_Linked_List.Questions.Reverse_a_linked_list_in_groups_of_size_k;

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
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        head.next.next.next.next.next=new Node(60);

        printlist(head);
        head=reversebyk(head, 3);
        printlist(head);
    }
    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }

    static Node reversebyk(Node head,int k){
        Node curr=head;
        Node prev=null,next=null;

        int count=0;
        while(curr!=null && count<k){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if (next!=null){
            Node rest_head=reversebyk(next,k);
            head.next=rest_head;
        }
        return prev;
    }
}
