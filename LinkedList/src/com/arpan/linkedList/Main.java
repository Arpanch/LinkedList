package com.arpan.linkedList;

public class Main {
public static void main(String[] args) {
		
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
