package Stack;


import DemoLinkList.LinkedList;
import DemoLinkList.Node;

public class StackTest<INode>{
	private final String Assert = null;
	MyStack myStack =new MyStack();


	public void given3NumbersWhenAddedToStackShouldHaveLastAddedNode() {
		System.out.println("my stack program");
		Node myFirstNode =new Node(70);
		Node mySecondNode =new Node(50);
		Node myThirdNode =new Node(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
	Node myNode;
	LinkedList linkedlist=new LinkedList();
//	myNode=(Node) myStack.peek();
boolean stackEmpty=	linkedlist.peek();
System.out.println("stack is empty" +stackEmpty);
		myStack.printStack();
		//myStack.peek();
		//Assert.assertEquals(myThirdNode,myNode);
	}

		

		
		
}
		
		
		


	


