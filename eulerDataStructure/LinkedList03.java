package org.zaza.eulerDataStructure;
import java.io.BufferedWriter;
import java.io.IOException;
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;

public class LinkedList03 {

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

    // Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data) {
    	SinglyLinkedListNode node = new SinglyLinkedListNode(data);
    	if (head == null) {
    		head = node;
    	}
    	else {
    		node.next = head;
    	}
    	return node;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
