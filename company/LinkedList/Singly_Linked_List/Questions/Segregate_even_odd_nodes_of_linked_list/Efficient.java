package com.company.LinkedList.Singly_Linked_List.Questions.Segregate_even_odd_nodes_of_linked_list;

class Node{
    int data;
   Node next;
    Node(int x){
        data=x;
        next=null;
    }
}

public class Efficient {
    public static void main(String[] args) {
       Node head=new Node(10);
        head.next=new Node(30);
        head.next.next=new Node(50);
        head.next.next.next=new Node(20);
        head.next.next.next.next=new Node(40);
        head.next.next.next.next.next=new Node(60);
        printlist(head);
        head=evenandodd(head);
        printlist(head);
    }
    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
    static Node evenandodd(Node head){
        Node eS=null,eE=null,oS=null,oE=null;
        for (Node curr = head; curr!=null ; curr=curr.next) {
            int x= curr.data;
            if (x%2==0){
                if(eS==null){
                 eS=curr;
                 eE=eS;
                }
                else {
                    eE.next=curr;
                    eE=eE.next;
                }
            }
            else {
                if(oS==null){
                    oS=curr;
                    oE=oS;
                }
                else {
                    oE.next=curr;
                    oE=oE.next;
                }
            }
        }
        if (oS==null || eS==null){
            return head;
        }
        eE.next=oS;
        oE.next=null;
        return eS;
    }
}
