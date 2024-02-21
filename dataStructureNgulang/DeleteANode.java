package org.zaza.dataStructureNgulang;
import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;

class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

class SinglyLinkedList {
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

class SinglyLinkedListPrintHelper {
    public static void printList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }
}


public class DeleteANode {
	
    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
    	if (position == 0) {
    		return head.next;
    	}
    	else {
    		int counter = 0;
        	SinglyLinkedListNode currentNode = head;
    		SinglyLinkedListNode beforeCurrentNode = null;
    		while (counter < position) {
    			counter++;
    			beforeCurrentNode = currentNode;
    			currentNode = currentNode.next;
    		}
    		beforeCurrentNode.next = currentNode.next;
    	}
    	return head;
    }


}
