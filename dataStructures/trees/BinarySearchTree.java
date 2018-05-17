package dataStructures.trees;

import java.util.LinkedList;
import java.util.Queue;



public class BinarySearchTree {

	static Node root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		root=null;
		add(6);
	    add(4);
	    add(8);
	    add(3);
	    add(5);
	    add(7);
	    add(9);
		traverseTreeBFS(root);
	}

	static void add(int value)
	{
		root= insertNode(root,value);
	}
	static Node insertNode(Node current, int value)
	{
		if(current==null)
		{
			current=new Node(value);
		}
		else
		{
			if(current.value>value)
				current.left=insertNode(current.left,value);
			else if(current.value<value)
				current.right=insertNode(current.right,value);
			else {
		        // value already exists
		        return current;
		    }
		}
		return current;
	}
	
	static void traverseTreeBFS(Node root)
	{
		StringBuilder sb= new StringBuilder();
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			Node current= queue.poll();
			sb.append(current.value+" ");
			if(current.left!=null)
				queue.add(current.left);
			if(current.right!=null)
			{
				queue.add(current.right);
			}
		}
		
		System.out.println(sb.toString().trim());
	}
}

class Node {
	int value;
	Node left;
	Node right;
	
	Node(int value)
	{
		this.value=value;
		this.left=null;
		this.right=null;
	}
}
