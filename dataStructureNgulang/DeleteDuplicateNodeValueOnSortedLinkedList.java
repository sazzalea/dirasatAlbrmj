package org.zaza.dataStructureNgulang;

public class DeleteDuplicateNodeValueOnSortedLinkedList {
	
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


    public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode llist) {
//    	SinglyLinkedListNode current = llist;
//    	while (llist.next != null) {
//    		if (llist.data == llist.next.data) {
//    			current.next = current.next.next;
//    		}
//    		llist = llist.next;
//    	}
//		int currData = current.data;
//    	while (llist.next != null) {
//    		int nextCurrData = llist.next.data;
//    		llist = llist.next;
//    		if (currData == nextCurrData) {
//    			current = current.next;
//    		}
//    		else {
//    			currData = llist.next.data;
//    		}
//    	}
    	
    	SinglyLinkedListNode temp = llist;
    	
    	while (temp.next != null) {
    		if (temp.data == temp.next.data) {
    			temp.next = temp.next.next;
    		}
    		else {
    			temp = temp.next;
    		}
    	}
    	
    	return llist;
    }

    public static void main(String[] args) {

            SinglyLinkedList llist = new SinglyLinkedList();
            int[] arr = {1, 3, 3, 4, 4};

            for (int i = 0; i < arr.length; i++) {
                llist.insertNode(arr[i]);
            }

            SinglyLinkedListNode llist1 = removeDuplicates(llist.head);

            printSinglyLinkedList(llist1);
    }

}
