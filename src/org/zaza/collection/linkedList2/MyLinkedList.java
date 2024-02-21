package org.zaza.collection.linkedList2;

public class MyLinkedList {
	
	public MyLinkedListNode head;
	public MyLinkedListNode tail;
	
	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public void add(int nodeData) {
		MyLinkedListNode node = new MyLinkedListNode(nodeData);
		if (this.head == null) {
			this.head = node;
		}
		else {
			this.tail.next = node;
		}
		this.tail = node;
	}
	
	public void printAll() {
		MyLinkedListNode tempNode = this.head;
		while (tempNode.next != null) {
			System.out.println(tempNode.data);
			tempNode = tempNode.next;
		}
		if (tempNode.next == null) {
			System.out.println(tempNode.data);
		}
	}
	
	public void insertNodeAt(int nodeData, int position) {
		MyLinkedListNode newNode = new MyLinkedListNode(nodeData);
		if (position == 0) {
			newNode.next = head;
			head = newNode;
		}
//		TODO need to handle if insert into the last position
		else {
			int counter = 0;
			MyLinkedListNode currentNode = this.head;
			while (counter < position - 1) {
				counter++;
				currentNode = currentNode.next;
			}
			newNode.next = currentNode.next;
			currentNode.next = newNode;
		}
	}

}
