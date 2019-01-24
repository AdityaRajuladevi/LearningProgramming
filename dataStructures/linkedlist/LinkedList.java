package LearningProgramming.dataStructures.linkedlist;

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

	static void reverseInInterval(int m, int n, Node head)
	{
		if(m==n)
		return ;
		Node current = head;
		Node mNode=null;
		Node nNode =null;
		Node nNodeNext =null;
		Node mNodePrev=head;
		int counter=1;
		Node t=head;
		while(current!=null && counter <=n)
		{	
			if(counter<m)
			{
				mNodePrev =t;
			}
			else if(counter ==m)
			{
				mNode=current;
			}
			else if(counter==n)
			{
				nNode =current;
				nNodeNext=current.next;
			}
			t=current;
			current = current.next;
			counter++;
		}
		nNode.next = null;
		Node h=reverseIterative(mNode);
		if(m==1)
		{
			head = h;
		}
		else
		mNodePrev.next = h;
		mNode.next = nNodeNext;
		display(head);
		System.out.println("Something");
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
		// display(head);
		// revDisplay(head);	
		// HEAD=head;
		// reverseRecursive(HEAD);
		// System.out.println("\nRecursive sorted");
		// display(HEAD);
		//head=reverseIterative(head);
		//display(head);
		//reverseInInterval(2, 3, head);
		getMiddleNode(head);
		//Node k=middleNode(head);
		//System.out.println("Middle = "+k.value);

		//sortList(head);
		display(head);
	}

	public static Node getMiddleNode (Node head)
	{
		Node fastNode= head;
		Node slowNode = head;
		while(fastNode!=null && fastNode.next!=null)
		{
			fastNode=fastNode.next.next;
			slowNode=slowNode.next;
		}
		System.out.println("Middle Node " + slowNode.value);
		return slowNode;
	}

	public static Node middleNode(Node head) {
        int size=0;
        Node current = head;
        if(current == null)
            return head;
        size =0;
        while(current!=null)
        {
            size+=1;
            current=current.next;
        }
        int middle =size/2 +1;
        // if(size%2==0)
        // {
        //    middle = size/2 +1 ;
        // }
        // else 
        //     middle = size/2;
            
		current = head;
		middle-=1;
        while(middle>0)
        {
            current = current.next;
            middle--;
        }
        return current;
    }



public static Node sortList(Node head) {
		if (head == null || head.next==null)
		{
			return head;
		}
		Node fast=head, slow=head,prev=null;
		while(fast!=null && fast.next!=null)
		{
			prev= slow;
			slow=slow.next;
			fast = fast.next.next;
		}
		prev.next =null;
		Node l=sortList(head);
		Node r=sortList(slow);
		return mergeList(l, r);
	}

	public static Node mergeList(Node l, Node r)
	{
		Node k= new Node(0,null);
		Node s=k;
		while(l!=null && r!=null)
		{
			if(l.value<=r.value)
			{
				k.next = l;
				k=k.next;
				l=l.next;
			}
			else{
				k.next = r;
				k=k.next;
				r=r.next;
			}
		}
		if(l!=null)
		{
			k.next = l;
		}
		
			if(r!=null)
		{
			k.next = r;
		}
		return s.next;
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