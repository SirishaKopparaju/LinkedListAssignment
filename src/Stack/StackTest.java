package Stack;


import DemoLinkList.MyLinkedList;
import DemoLinkList.Node;

public class StackTest<INode>{
	private final String Assert = null;


	public void given3NumbersWhenAddedToStackShouldHaveLastAddedNode() {
		MyStack myStack =new MyStack();
		System.out.println("my stack program");
		Node myFirstNode =new Node(70);
		Node mySecondNode =new Node(50);
		Node myThirdNode =new Node(56);
		System.out.println(myFirstNode.getKey());
		System.out.println(mySecondNode.getKey());
		System.out.println(myThirdNode.getKey());

		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
	    Node myNode;
	    MyLinkedList linkedlist=new MyLinkedList();
//	myNode=(Node) myStack.peek();
      boolean stackEmpty=	myStack.peek();
 System.out.println("stack is empty" +stackEmpty);
		myStack.printStack();
		//myStack.peek();
		//Assert.assertEquals(myThirdNode,myNode);
	}
	public void given3NumbersInStackWhenPopedShouldWithLastAddedNode() {
		System.out.println("my stack program");
		Node myFirstNode =new Node(70);
		Node mySecondNode =new Node(50);
		//Node myThirdNode =new Node(56);
	//	myStack.push(myFirstNode);
		//myStack.push(mySecondNode);
		//myStack.push(myThirdNode);
	Node myNode;
	MyLinkedList linkedlist=new MyLinkedList();
	 linkedlist.add(myFirstNode);
	 linkedlist.add(mySecondNode);
	 //linkedlist.add(myThirdNode);
//	myNode=(Node) myStack.peek();
   Node node = linkedlist.pop();
System.out.println("poped out element-->" +node.getKey());
	//	myStack.printStack();
		//myStack.peek();
		//Assert.assertEquals(myThirdNode,myNode);
	}

		

		
		
}
		
		
		


	


