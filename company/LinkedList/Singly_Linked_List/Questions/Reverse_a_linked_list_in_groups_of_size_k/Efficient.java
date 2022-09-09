package com.company.LinkedList.Singly_Linked_List.Questions.Reverse_a_linked_list_in_groups_of_size_k;


class NodeList{
    int data;
    NodeList next;
    NodeList(int x){
        data=x;
        next=null;
    }
}

public class Efficient {
    public static void main(String[] args) {
        NodeList head=new NodeList(10);
        head.next=new NodeList(20);
        head.next.next=new NodeList(30);
        head.next.next.next=new NodeList(40);
        head.next.next.next.next=new NodeList(50);
        head.next.next.next.next.next=new NodeList(60);

        printlist1(head);
        head=reverseK(head, 3);
        printlist1(head);
    }

    public static void printlist1(NodeList head){
        NodeList curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }


    static NodeList reverseK(NodeList head,int k){
        NodeList curr=head,prevFirst=null;
        boolean isFirstPass=true;
        while(curr!=null){
            NodeList first=curr,prev=null;
            int count=0;
            while(curr!=null&&count<k){
                NodeList next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
                count++;
            }
            if(isFirstPass){
                head=prev;
                isFirstPass=false;
            }
            else{
                prevFirst.next=prev;
            }
            prevFirst=first;
        }
        return head;
    }
}
