package DataStructures.linkedlist;

import java.util.List;

public class LinkedList {

	static Node HEAD;
	static Node insert(Node head,int value)
	{
		
		Node newNode= new Node(value,null);
		if(head==null)
		{
			head=newNode;
		}
		else {
			Node current= head;
			while(current.next!=null)
			{
				current=current.next;
			}// now we traversed the array and the current is pointing to the last element in the linked list
			current.next=newNode;
		}
		return head;
	}
	
	static void display(Node head)
	{
		StringBuilder sb = new StringBuilder();
		Node current = head;
		while(current!=null)
		{
			sb.append(current.value + " ");
			current=current.next;
		}
		System.out.println(sb.toString());
	}
	
	
	static void revDisplay(Node current)
	{
		if(current==null)
		{
			return ;
		}
		else {
			revDisplay(current.next);
			System.out.print(current.value+" ");
		}
		
	}
	
	static Node reverseIterative(Node head)
	{
		Node current=head;
		Node prev=null;
		while(current!=null)
		{
			Node next= current.next;
			current.next=prev;
			prev=current;
			current = next;
		}
		head = prev;
		//display(prev);
		System.out.println("\n Reverse Through Iteration");
		return head;
		
	}
	
	static void reverseRecursive(Node current)
	{
		if(current.next==null)
		{
			HEAD=current;
			return ;
		}
		
		reverseRecursive(current.next);
		Node p=current.next;
		p.next=current;
		current.next=null;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {1,2,3,4,5};
		int n=arr.length;
		Node head=null;
		for(int i=0;i<n;i++)
		{
			int data= arr[i];
			head=insert( head,data);
		}
		display(head);
		revDisplay(head);	
		HEAD=head;
		reverseRecursive(HEAD);
		System.out.println("\nRecursive sorted");
		display(HEAD);
		//head=reverseIterative(head);
		//display(head);
	}

}


class Node{
	int value;
	Node next;
	Node(int v,Node n)
	{
		this.value=v;
		this.next=n;
	}
}