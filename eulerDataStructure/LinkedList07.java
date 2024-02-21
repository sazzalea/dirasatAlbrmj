package org.zaza.eulerDataStructure;
import java.io.IOException;
//import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;

public class LinkedList07 {

	    static class SinglyLinkedListNode {
	        public int data;
	        public SinglyLinkedListNode next;

	        public SinglyLinkedListNode(int nodeData) {
	            this.data = nodeData;
	            this.next = null;
	        }
	    }

	    static class SinglyLinkedList {
	        public SinglyLinkedListNode head;
	        public SinglyLinkedListNode tail;

	        public SinglyLinkedList() {
	            this.head = null;
	            this.tail = null;
	        }

	        public void insertNode(int nodeData) {
	            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

	            if (this.head == null) {
	                this.head = node;
	            } else {
	                this.tail.next = node;
	            }

	            this.tail = node;
	        }
	    }

	    public static void printSinglyLinkedList(SinglyLinkedListNode node) throws IOException {
	        while (node != null) {
	           System.out.print((node.data) + " ");
	           node = node.next;
	        }
	    }

	        public static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
	        // Write your code here
//	        	SinglyLinkedListNode node = new SinglyLinkedListNode(llist);
	        	if (head == null || head.next == null) {
	        		return head;
	        	}
	        	SinglyLinkedListNode tmp = reverse(head.next);
//	        	System.out.println(tmp.data);
	        	head.next.next = head;
	        	head.next = null;
	        	return tmp;
	        }

	        public static SinglyLinkedListNode reverse2(SinglyLinkedListNode head) {
        		SinglyLinkedListNode tail = null;
	        	while (head != null) {
	        		SinglyLinkedListNode tmp = head.next;
	        		head.next = tail;
	        		tail = head;
	        		head = tmp;
	        	}
	        	return tail;
	        }

	        public static void main(String[] args) throws IOException {
                SinglyLinkedList llist = new SinglyLinkedList();
                int[] arr = {1, 9, 4, 3};

                for (int i = 0; i < arr.length; i++) {
                    llist.insertNode(arr[i]);
                }

                printSinglyLinkedList(llist.head);
                SinglyLinkedListNode llist1 = reverse2(llist.head);
                System.out.println();
                printSinglyLinkedList(llist1);

	        }
	        
}
