package org.zaza.dataStructureNgulang;
import java.io.*;
import java.util.*;

public class CycleDetection {
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

    public static void printSinglyLinkedList(SinglyLinkedListNode node){
        while (node != null) {
            System.out.print((node.data) + " ");
            node = node.next;
         }
    }
    static boolean hasCycle(SinglyLinkedListNode head) {
    Set<SinglyLinkedListNode> set=new HashSet<>();
    while(head!=null){
        if(set.contains(head.next))
        return true;
        set.add(head.next);
        head=head.next;
    }
    return false;

    }


    public static void main(String[] args) throws IOException {
        SinglyLinkedList llist = new SinglyLinkedList();

        int[] arr = {1, 2 ,3 ,1};

        for (int i = 0; i < arr.length; i++) {
            llist.insertNode(arr[i]);
        }

        boolean result = hasCycle(llist.head);
        System.out.println(result);
    }
}
