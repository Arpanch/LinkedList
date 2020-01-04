package com.arpan.linkedList;

public class Main {
public static void main(String[] args) {
	/*LinkedList linkedList=new LinkedList();
	System.out.println(linkedList.isEmpty());
	linkedList.printLinkedList();
	Node head=new Node(1);
	Node first=new Node(2);
	Node second=new Node(3);
	Node third=new Node(4);
	
	linkedList.setHead(head);
	head.setNext(first);
	first.setNext(second);
	second.setNext(third);
	System.out.println("Linked List Size "+linkedList.getSize());
	linkedList.printLinkedList();
	System.out.println(" ");
	linkedList.push(10);
	linkedList.push(11);
	linkedList.push(13);
	linkedList.pushAtEnd(100);
	linkedList.pushAtEnd(1020);
	linkedList.insertAfter(second,12);
	
	System.out.println("Linked List Size "+linkedList.getSize());
	linkedList.printLinkedList();
	System.out.println(" ");
	linkedList.deleteNode(0);
	linkedList.printLinkedList();
	System.out.println(" ");
	System.out.println(linkedList.searchNode(1021));
	System.out.println("Linked List Size "+linkedList.getSize());
	linkedList.printLinkedList();
	System.out.println("----------------------");
	linkedList.swapNode(11, 1020);
	System.out.println("--------------");
	linkedList.printLinkedList();
	System.out.println("--------------");
	System.out.println(linkedList.getNthData(9));
	System.out.println(linkedList.getMiddle());
	System.out.println(linkedList.getMiddleEfficent());
	linkedList.printNthFromLast(8);
	linkedList.getNthTermFormLast(8);
	System.out.println("------Reverse- before-------");
	linkedList.printLinkedList();
	linkedList.reverseLinkedList();
	System.out.println("------Reverse After--------");
	linkedList.printLinkedList();
*/	
	
	LinkedList linkedlist2=new LinkedList();
	linkedlist2.push(5);
	linkedlist2.push(4);
	linkedlist2.push(3);
	linkedlist2.push(2);
	linkedlist2.push(1);
	System.out.println("------Reverse- before-------");
	linkedlist2.printLinkedList();
	linkedlist2.reverseRecursive();
	System.out.println("------Reverse After--------");
	linkedlist2.printLinkedList();
	
	
	
	
	
	
	
}
}
