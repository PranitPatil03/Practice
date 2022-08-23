package com.company.LinkedList.Singly_Linked_List.Questions.Palindrome_Linked_List;

class Node {
    int val;
    Node next;
    Node() {}
    Node(int val) { this.val = val; }
    Node(int val, Node next) { this.val = val; this.next = next; }
}

public class Efficient {
    public static void main(String[] args) {

    }
    static boolean isPalindrome(Node head){

        if(head==null) return true;
        Node slow=head; Node fast=head;

        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node revsere=reverseList(slow.next);

        Node curr=head;
        while (revsere!=null){
            if (revsere.val!=curr.val){
                revsere = revsere.next;
                curr=curr.next;
                return false;
            }
        }
        return true;
    }

    static Node reverseList(Node head){
        if(head==null||head.next==null)return head;
        Node rest_head=reverseList(head.next);
        Node rest_tail=head.next;
        rest_tail.next=head;
        head.next=null;
        return rest_head;
    }

}
