package Queue;
import DemoLinkList.MyLinkedList;
import DemoLinkList.Node;

public class MyQueue {
	
	
			public MyLinkedList myLinkedList = new MyLinkedList();
		//	private LinkedList linkedList;
		public MyQueue() {
			
		}
			
		
			//@SuppressWarnings("rawtypes")
			//public MyStack(LinkedList<E> myLinkedList) {
				//this.myLinkedList = myLinkedList;
				//this.linkedList=new LinkedList();
			//}

			public void Enqueue(Node myNode) {
				// TODO Auto-generated method stub
				System.out.println("my push method");	

				myLinkedList.add(myNode);

			}


			public void printStack() {
				// TODO Auto-generated method stub
				// myLinkedList.printmyNode();
				
			}
			public static void main(String[]args) {
				QueueTest queue=new QueueTest();
				queue.given3NumbersWhenAddedToQueueShouldHaveLastAddedNode();
				
				//queue.given3NumbersInStackWhenDequeueShouldWithLastAddedNode();
			}


			public boolean peek() {
				// TODO Auto-generated method stub
			boolean StackEmpty=	 myLinkedList.peek();
				return StackEmpty;
			}
			
			
			}





