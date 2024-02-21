package org.zaza.collection.linkedList2;

public class Main {

	public static void main(String[] args) {
		MyLinkedList mll = new MyLinkedList();
		mll.add(6);
		mll.add(12);
		mll.add(8);
		mll.insertNodeAt(35, 3);
		mll.add(5);
		mll.printAll();
	}

}
