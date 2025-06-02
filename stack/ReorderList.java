package stack;

import java.util.Stack;

// You are given the head of a singly linked-list. The list can be represented as:

// L0 → L1 → … → Ln - 1 → Ln
// Reorder the list to be on the following form:

// L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
// You may not modify the values in the list's nodes. Only nodes themselves may be changed.

// Example 1:


// Input: head = [1,2,3,4]
// Output: [1,4,2,3]
// Example 2:


// Input: head = [1,2,3,4,5]
// Output: [1,5,2,4,3]

class ListNode {
    int data;
    ListNode next;

    ListNode(int data){
        this.data = data;
        this.next = null;
    }
}

public class ReorderList {
    public static void reorderList(ListNode head) {
        if(head == null || head.next == null) return;

        Stack <ListNode> stack = new Stack<>();

        ListNode current = head;

        while(current != null) {
            stack.push(current);
            current = current.next;
        }
        current = head;
        int n = stack.size();

        for(int i = 0 ; i < n; i++) {
            ListNode tail = stack.pop();
            ListNode next = current.next;

            current.next = tail;
            tail.next = next;
            current = next;
        }
        current.next = null;
    }
}
