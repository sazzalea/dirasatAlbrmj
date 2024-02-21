package org.zaza.dataStructureNgulang;

import java.io.BufferedWriter;
import java.io.IOException;

public class ReverseALinkedList {
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

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
    // Write your code here
    	if (head == null || head.next == null) {
    		return head;
    	}
    	SinglyLinkedListNode tmp = reverse(head.next);
    	head.next.next = head;
    	head.next = null;
    	return tmp;
    }

    public static SinglyLinkedListNode reverse2(SinglyLinkedListNode head) {
    // Write your code here
    	SinglyLinkedListNode tail = null;
    	while (head != null) {
    		SinglyLinkedListNode tmp = head.next;
    		head.next = tail;
    		tail = head;
    		head = tmp;
    	}
    	return tail;
    }
}
