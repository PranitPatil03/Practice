package com.company.LinkedList.Singly_Linked_List.Questions.Palindrome_Linked_List;

import java.util.HashSet;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Naive {
    public static void main(String[] args) {

    }

    static boolean isPalindrome(ListNode head){
        Stack<Integer> stack=new Stack<>();
        for (ListNode curr = head; curr!=null ; curr=curr.next) {
            stack.push(curr.val);
        }

        for (ListNode curr = head; curr !=null ; curr=curr.next) {
            if(stack.pop()!=curr.val){
                return false;
            }
        }
        return true;
    }
}
