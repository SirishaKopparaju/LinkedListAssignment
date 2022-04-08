package Stack;

//import java.util.LinkedList;

import DemoLinkList.MyLinkedList;
import DemoLinkList.Node;

public class MyStack<INode, E> {
		public MyLinkedList myLinkedList = new MyLinkedList();
	//	private LinkedList linkedList;
	public MyStack() {
		
	}
		
	
		//@SuppressWarnings("rawtypes")
		//public MyStack(LinkedList<E> myLinkedList) {
			//this.myLinkedList = myLinkedList;
			//this.linkedList=new LinkedList();
		//}

		public void push(Node myNode) {
			// TODO Auto-generated method stub
			System.out.println("my push method");	

			myLinkedList.add(myNode);

		}


		public void printStack() {
			// TODO Auto-generated method stub
			// myLinkedList.printmyNode();
			
		}
		public static void main(String[]args) {
			StackTest stack=new StackTest();
			stack.given3NumbersWhenAddedToStackShouldHaveLastAddedNode();
			
			//stack.given3NumbersInStackWhenPopedShouldWithLastAddedNode();
		}


		public boolean peek() {
			// TODO Auto-generated method stub
		boolean StackEmpty=	 myLinkedList.peek();
			return StackEmpty;
		}
		
		
		}


