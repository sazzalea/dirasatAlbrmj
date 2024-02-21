package org.zaza.eulerDataStructure;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;

import org.zaza.eulerDataStructure.LinkedList07.SinglyLinkedListNode;

public class GetNodeValue {

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

//    class Result {

        /*
         * Complete the 'getNode' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER_SINGLY_LINKED_LIST llist
         *  2. INTEGER positionFromTail
         */

        /*
         * For your reference:
         *
         * SinglyLinkedListNode {
         *     int data;
         *     SinglyLinkedListNode next;
         * }
         *
         */
    public static SinglyLinkedListNode reverse2(SinglyLinkedListNode head) {
		SinglyLinkedListNode tail = null;
    	while (head != null) {
//    		System.out.println(head.data);
//    		head = head.next;
    		SinglyLinkedListNode tmp = head.next;
    		head.next = tail;
    		tail = head;
    		head = tmp;
    	}
    	return tail;
    }

        public static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        // Write your code here
        	head = reverse2(head);
        	int dataOnPosition = 0;
        	if (head.next == null || positionFromTail == 0) {
        		dataOnPosition = head.data;
        	}
        	else {
	        	int counter = 0;
	        	while (counter < positionFromTail) {
	        		head = head.next;
	        		counter++;
	        		if (counter == positionFromTail) {
	        			dataOnPosition = head.data;
	        		}
	        	}
        	}
        	return dataOnPosition;
        }

        public static int getNode2(SinglyLinkedListNode head, int positionFromTail) {
        // Write your code here
        	head = reverse2(head);
        	int dataOnPosition = head.data;
        	int counter = 0;
        	while (head != null) {
        		if (counter == positionFromTail) {
        			dataOnPosition = head.data;
        			break;
        		}
        		head = head.next;
        		counter++;
        	}
        	return dataOnPosition;
        }
        
//    }

}
