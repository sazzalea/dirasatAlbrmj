package org.zaza.collection.linkedList;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
//		List<String> lsStr = new ArrayList<>();
//		lsStr.add("Kara");
//		lsStr.add("Coreng");
//		lsStr.add("Moka");
		
		SinglyLinkedList llist = new SinglyLinkedList();
		llist.insertNode(6);
		llist.insertNode(16);
		llist.insertNode(3);
		llist.insertNode(78);
		
		SinglyLinkedListNode node = llist.head;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		if (node != null) {
			System.out.println(node.data);
		}
		
	}

}
