package DataStructures;

public class LinkedList {
	
	public Node insert(int data, Node head)
	{
		Node k= new Node(data);
		Node p= head;
		if(p==null)
		{
			head=k;
		}
		else {
			while(p.nextValue!=null)
			{
				p=p.nextValue;
			}
			p.nextValue=k;
		}
		
		return head;
	}
	
	public Node reverse(Node head)
	{
		Node c=head;
		Node p=null;
		Node n = null;
		while(c!=null)
		{
			n = c.nextValue;
			c.nextValue = p;
			p = c;
			c = n;
		}
		head = p;
		display(head);
		return head;
	}
	
	
	public Node reversList(Node head)
	{
		Node current=head;
		Node previous=null;
		Node next=null;
		while(current!=null)
		{
			next=current.nextValue;
			current.nextValue=previous;
			previous=current;
			current=next;
		}
		head=previous;
		return head;
	}
	
	public void display(Node head)
	{
        Node start = head;
        while(start != null) {
            System.out.print(start.value + " ");
            start = start.nextValue;
        }
	}
	
	public void reverseIterative(Node head){
		Node p = head;
		Node q = null;
		Node prevNode = null;

		while(p!=null){
			q = p.nextValue;
			p.nextValue = prevNode;
			prevNode = p;
			p = q;
		}
		head = prevNode;
		System.out.println("\n Reverse Through Iteration");
		//display(head);
	}
}





class Node {
	int value;
	Node nextValue;
	
	Node (int val)
	{
		this.value = val;
		this.nextValue = null;
	}
	
	Node (int val, Node nextVal)
	{
		this.value = val;
		this.nextValue = nextVal;
	}
	
}