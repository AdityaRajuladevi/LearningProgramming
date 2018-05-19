package LearningProgramming.dataStructures;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList lsLinkedList= new LinkedList();
		// Scanner sc = new Scanner(System.in);
		
		int[] arr=new int[] {1,2,3,4,5};
		int n=arr.length;
		Node head=null;
		for(int i=0;i<n;i++)
		{
			int data= arr[i];
			head=lsLinkedList.insert(data, head);
		}
		head=lsLinkedList.reversList(head);
		lsLinkedList.display(head);
	//	lsLinkedList.reverseIterative( head);
	}

}


