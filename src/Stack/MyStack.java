package Stack;

import java.util.LinkedList;

import DemoLinkList.Node;

public class MyStack<INode, E> {
		private final LinkedList<E> myLinkedList=new LinkedList();
		private LinkedList linkedList;
	public MyStack() {
		
	}
		
	
		//@SuppressWarnings("rawtypes")
		//public MyStack(LinkedList<E> myLinkedList) {
			//this.myLinkedList = myLinkedList;
			//this.linkedList=new LinkedList();
		//}

		public void push(E myFirstNode) {
			// TODO Auto-generated method stub
			myLinkedList.add(myFirstNode);
		}


		public void printStack() {
			// TODO Auto-generated method stub
			// myLinkedList.printmyNode();
			
		}
		public static void main(String[]args) {
			StackTest stack=new StackTest();
			stack.given3NumbersWhenAddedToStackShouldHaveLastAddedNode();
		}
		
		
	}


