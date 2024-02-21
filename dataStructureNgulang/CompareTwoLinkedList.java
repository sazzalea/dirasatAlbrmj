package org.zaza.dataStructureNgulang;

import java.io.IOException;

public class CompareTwoLinkedList {
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

        public void insertNode(int arr) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(arr);

            if (this.head == null) {
                this.head = node;
            } 
            else {  
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node)  throws IOException {
        while (node != null) {
           System.out.print((node.data) + " ");
           node = node.next;
        }
    }

    // Complete the compareLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
//    	boolean result = false;
//    	int counter1 = 0;
//    	int counter2 = 0;
//    	while (head1 != null && head2 != null) {
//    		if (head1.data == head2.data) {
//    			result = true;
//    		}
//    		else {
//    			result = false;
//    			break;
//    		}
//        	head1 = head1.next;
//    		head2 = head2.next;
//    	}
//    		counter1++;
//    		counter2++;
//    	if (counter1 != counter2) {
//    		result = false;
//    	}
    	
    	while ((head1 != null && head2 != null) && (head1.data == head2.data)) {
    		head1 = head1.next;
    		head2 = head2.next;
    	}
    	return head1 == null && head2 == null;
    }
    
    public static void main(String[] args) throws IOException {
  		SinglyLinkedList llist1 = new SinglyLinkedList();
    	int[] arr1 = {2, 1, 4};
    	
        for (int i = 0; i < arr1.length; i++) {
            llist1.insertNode(arr1[i]);
        }
        printSinglyLinkedList(llist1.head);
        System.out.println();
      
      	SinglyLinkedList llist2 = new SinglyLinkedList();
      	int[] arr2 = {2, 5, 4};

        for (int i = 0; i < arr2.length; i++) {
            llist2.insertNode(arr2[i]);
        }
        printSinglyLinkedList(llist2.head);

        boolean result = compareLists(llist1.head, llist2.head);
        System.out.println(result);

    }

}
