package com.arpan.linkedList;

class Node{
	private int data;
	
	private Node next;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node() {
		super();
		this.data=0;
		this.next=null;
	}

	public Node(int data) {
		super();
		this.data = data;
		this.next=null;
	}

	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
}