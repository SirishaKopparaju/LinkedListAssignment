package Queue;

import DemoLinkList.MyLinkedList;
import DemoLinkList.Node;
public class QueueTest {


	
		private final String Assert = null;


		public void given3NumbersWhenAddedToQueueShouldHaveLastAddedNode() {
			MyQueue myQueue =new MyQueue();
			System.out.println("my stack program");
			Node myFirstNode =new Node(70);
			Node mySecondNode =new Node(50);
			Node myThirdNode =new Node(56);
			System.out.println(myFirstNode.getKey());
			System.out.println(mySecondNode.getKey());
			System.out.println(myThirdNode.getKey());

		/*	myQueue.Enqueue(myThirdNode);
			myQueue.Enqueue(myFirstNode);
			myQueue.Enqueue(mySecondNode);*/
		    Node myNode;
		    MyLinkedList linkedlist=new MyLinkedList();

	      boolean stackEmpty=	myQueue.peek();
	 System.out.println("Queue is empty" +stackEmpty);
			myQueue.printStack();
			
		}
		public void given3NumbersInStackWhenDequeueShouldWithLastAddedNode() {
			System.out.println("my Queue program");
			Node myFirstNode =new Node(70);
			Node mySecondNode =new Node(50);
			
		Node myNode;
		MyLinkedList linkedlist=new MyLinkedList();
		 linkedlist.add(myFirstNode);
		 linkedlist.add(mySecondNode);
		 
	   Node node = linkedlist.pop();
	System.out.println("poped out element-->" +node.getKey());
		
		}

			

			
			
	}
			
			
			


		




