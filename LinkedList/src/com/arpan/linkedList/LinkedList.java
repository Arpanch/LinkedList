package com.arpan.linkedList;

public class LinkedList {
	
	private Node head;
	
	private int size;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public LinkedList() {
		super();
		this.head=null;
		size=0;
	}
	
	public boolean isEmpty(){
		return this.head==null;
	}
	
	public void printLinkedList(){
		if(this.isEmpty()){
			System.out.println("Linked List is empty");
			return;
		}else{
			Node ptr=head;
			System.out.print("Data "+ptr.getData()+"-->");
			while(ptr.getNext()!=null){
				ptr=ptr.getNext();
				System.out.print(ptr.getData()+"-->");
				
			}
			System.out.print("NULL");
		}
	}
	
	public int getSize() {
		int counter = 0;
		if(this.head!=null) {
			
			Node ptr = head;
			while (ptr != null)
			{
				counter++;
			ptr = ptr.getNext();
			
			}
		}
		return counter;

	}
	
	public void push(int data){
		Node newNode=new Node(data);
		newNode.setNext(head);
		head=newNode;
		}
	
	public void insertAfter(Node prev,int newData){
		
		if(prev==null){
			System.out.println("Previous node can't be null");
			return;
		}
			Node newNode=new Node(newData);
			newNode.setNext(prev.getNext());
			prev.setNext(newNode);
			
	}
	
	public void pushAtEnd(int data){
		Node newNode=new Node(data);
		Node ptr=head;
		if(ptr==null){
			head=newNode;
		} else {
			while (ptr.getNext() != null) {
				ptr = ptr.getNext();
			}
			ptr.setNext(newNode);
		}
		
	}
	
	public void deleteNode(int position){
		
		if(position==0){
			deleteHead();
			return;
		}
		int counter=0;
		Node ptr=head;
		while(counter!=position-1 && ptr!=null){
			counter++;
			ptr=ptr.getNext();
		}
		ptr.setNext(ptr.getNext().getNext());
		
		
	}
	
	public void deleteHead(){
		if(this.head==null){
			System.out.println("Linked list empty");
			return;
		}
		head=head.getNext();
	}
	
	public boolean searchNode(int data){
		if(head==null){
			System.out.println("Linked list is empty");
		}
		Node ptr=head;
		while(ptr!=null){
			if(ptr.getData()==data){
				return true;
			}
			ptr=ptr.getNext();
		}
		return false;
	}
	
	public void swapNode(int x,int y){
		//check both node exist in the list
		if(!(searchNode(x) && searchNode(y))){
			System.out.println("Any of the node doesn't exist in the linked list");
			return;
		}
		if(x==y){
			return;
		}
		
		//Serach x
		Node currentx=head;
		Node prevNodeOfX=null;
		while(currentx.getData()!=x){
			prevNodeOfX=currentx;
			currentx=currentx.getNext();
			
		}
		
		//Search Y
		Node currentY=head;
		Node prevNodeOfY=null;
		while(currentY.getData()!=y){
			prevNodeOfY=currentY;
			currentY=currentY.getNext();
			
		}
		
		if(prevNodeOfX!=null){
		prevNodeOfX.setNext(currentY);
		}else{
			head=currentY;
		}
		if(prevNodeOfY!=null){
		prevNodeOfY.setNext(currentx);
		}else{
			head=currentY;
		}
		
		
		Node orignalYNext=currentY.getNext();
		currentY.setNext(currentx.getNext());
		currentx.setNext(orignalYNext);
		
	}
	
	public int getNthData(int position){
		int data=Integer.MIN_VALUE;
		if(head==null || position>(this.getSize()-1)){
			System.out.println("LinkedlIst is null");
			assert(false);
			
		}else{
			int counter=0;
			Node ptr=head;
			while(ptr!=null && position!=counter){
				counter++;
				ptr=ptr.getNext();
			}
			data=ptr.getData();
		}
		return data;
	}
	
	public int getMiddle(){
		int size=this.getSize();
		if(size==0){
			System.out.println("linked list empty");
			return Integer.MIN_VALUE;
		}
		else if(size==1){
			return head.getData();
		}
		else {
			return getNthData(size/2);
		}
		
	}
	
	public int getMiddleEfficent(){
		if(head!=null){
		Node slowPointer=head;
		Node fastPointer=head;
		while(slowPointer.getNext()!=null && fastPointer.getNext()!=null)
			{slowPointer=slowPointer.getNext();
			fastPointer=fastPointer.getNext().getNext();
			}
		
		return slowPointer.getData();
		}
		return Integer.MIN_VALUE;
		
	}
	void printNthFromLast(int n)
    {
        Node main_ptr = head;
        Node ref_ptr = head;
 
        int count = 0;
        if (head != null)
        {
            while (count < n)
            {
                if (ref_ptr == null)
                {
                    System.out.println(n+" is greater than the no "+
                                      " of nodes in the list");
                    return;
                }
                ref_ptr = ref_ptr.getNext();
                count++;
            }
            while (ref_ptr != null)
            {
                main_ptr = main_ptr.getNext();
                ref_ptr = ref_ptr.getNext();
            }
            System.out.println("Node no. "+n+" from last is "+
                               main_ptr.getData());
        }
    }
	
	public void getNthTermFormLast(int n){
		Node ref_Pointer=head;
		Node main_pointer=head;
		
		int count=0;
		while(count<n){
			if(ref_Pointer==null){
				System.out.println("The n term is greater than total no of term!");
				return;
			}
			ref_Pointer=ref_Pointer.getNext();
			count++;
		}
		while(ref_Pointer!=null){
			main_pointer=main_pointer.getNext();
			ref_Pointer=ref_Pointer.getNext();
		}
		System.out.println("The "+ n +" term is "+main_pointer.getData());
		
	}
	
	public void reverseLinkedList(){
		Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.getNext();
            current.setNext(prev); 
            prev = current;
            current = next;
        }
        head = prev;
        
    }
	public void reverseLinkedListRecursive(Node prev,Node current,Node next){
		if(current!=null){
			next=current.getNext();
			current.setNext(prev);
			prev=current;
			current=next;
			reverseLinkedListRecursive(prev,current,next);
		}else{
			  head = prev;
		}
		
	}
	public void reverseRecursive(){
		reverseLinkedListRecursive(null,head,null);
	}
 
	
	
		

}

