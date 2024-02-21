package org.zaza.dataStructureNgulang;

import java.io.BufferedWriter;
import java.io.IOException;

public class InsertNodeAtSpecificLocation {
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
    
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
    	SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
    	if (position == 0) {
    		newNode = head;
    		return newNode;
    	}
    	else {
    		int counter = 0;
    		SinglyLinkedListNode currentNode = head;
    		while (++counter < position) {
//    			counter++;
    			currentNode = currentNode.next;
    		}
    		newNode.next = currentNode.next;
    		currentNode.next = newNode;
    		return head;
    	}
    }

}
