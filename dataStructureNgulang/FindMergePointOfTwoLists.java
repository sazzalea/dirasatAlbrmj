package org.zaza.dataStructureNgulang;

import java.util.ArrayList;
import java.util.List;

public class FindMergePointOfTwoLists {
	
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

    public static void printSinglyLinkedList(SinglyLinkedListNode head) {
    	SinglyLinkedListNode node = head;
    	while (node.next != null) {
    		System.out.println(node.data);
    		node = node.next;
    	}
    	if (node != null) {
    		System.out.println(node.data);
    	}
    }

    // Complete the findMergeNode function below.

    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
//    	int mergeIndex = 0;
//		int counter = 0;
//    	while (head1.next != null) {
//        	SinglyLinkedListNode temp = head2; 
//    		while (temp != null) {
//    			temp = temp.next;
//        		if (head1.next == temp.next) {
//        			mergeIndex = counter;
//        		}
//    		}
//    		head1 = head1.next;
//    		counter++;
//    	}
//    	return mergeIndex;
    	
    	SinglyLinkedListNode temp1 = head1;
    	SinglyLinkedListNode temp2 = head2;
    	List<SinglyLinkedListNode> list = new ArrayList<SinglyLinkedListNode>();
    	
    	while(temp1 != null) {
    		list.add(temp1);
    		temp1 = temp1.next;
    	}
    	
    	while(temp2 != null) {
    		if (list.contains(temp1)) {
    			
    			break;
    		}
    		temp2 = temp2.next;
    	}
    	return temp2.data;
    }
    
    public static void main(String[] args) {
    	int index = 2;
    	
        SinglyLinkedList llist1 = new SinglyLinkedList();
        int[] arr1 = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr1.length; i++) {
            llist1.insertNode(arr1[i]);
        }
      
      	SinglyLinkedList llist2 = new SinglyLinkedList();
      	int[] arr2 = {1, 3};
        for (int i = 0; i < arr2.length; i++) {
            llist2.insertNode(arr2[i]);
        }
          
      	SinglyLinkedListNode ptr1 = llist1.head;
        SinglyLinkedListNode ptr2 = llist2.head;

        for (int i = 0; i < arr1.length; i++) {
            if (i < index) {
                ptr1 = ptr1.next;
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if (i != arr2.length-1) {
                ptr2 = ptr2.next;
            }
        }

        ptr2.next = ptr1;

        int result = findMergeNode(llist1.head, llist2.head);
        System.out.println(result);
    }

}
