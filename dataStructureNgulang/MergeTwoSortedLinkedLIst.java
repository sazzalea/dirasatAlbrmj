package org.zaza.dataStructureNgulang;

public class MergeTwoSortedLinkedLIst {
	
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
 
    // Complete the mergeLists function below.

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
    	if (head1 == null) {
    		return head2;
    	}
    	if (head2 == null) {
    		return head1;
    	}
    	
     	SinglyLinkedListNode t1 = head1, t2 = head2;
    	SinglyLinkedListNode head = null;
    	SinglyLinkedListNode tail = null;
    	if (t1.data <= t2.data) {
    		head = t1;
    		tail = t1;
    		t1 = t1.next;
    	}
    	else {
    		head = t2;
    		tail = t2;
    		t2 = t2.next;
    	}
    	
    	while (t1 != null && t2 != null) {
    		if (t1.data <= t2.data) {
    			tail.next = t1;
    			tail = t1;
    			t1 = t1.next;
    		}
    		else {
    			tail.next = t2;
    			tail = t2;
    			t2 = t2.next;
    		}
    	}
    	
    	if (t1 != null) {
    		tail.next = t1;
    	} 
    	else {
    		tail.next = t2;
    	}
    	
    	return head;
    }
    
    public static void main(String[] args) {
 
        SinglyLinkedList llist1 = new SinglyLinkedList();
        int[] arr1 = {2, 8};
        for (int i = 0; i < arr1.length; i++) {
            llist1.insertNode(arr1[i]);
        }
      
      	SinglyLinkedList llist2 = new SinglyLinkedList();
      	int[] arr2 = {1, 5};
        for (int i = 0; i < arr2.length; i++) {
            llist2.insertNode(arr2[i]);
        }

        SinglyLinkedListNode llist3 = mergeLists(llist1.head, llist2.head);

        printSinglyLinkedList(llist3);
    }

}
