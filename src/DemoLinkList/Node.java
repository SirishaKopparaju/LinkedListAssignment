package DemoLinkList;

public class Node<E>{
	//private int data;
	//private Node node;
	public E key;
	public Node next;	
	
	public Node(E key) {
	//	super();
		this.key=key;
		this.next = null;
	}
	



	public E getKey() {
		return key;
	}




	public void setKey(E key) {
		this.key = key;
	}




	public Node getNext() {
		// TODO Auto-generated method stub
		return this.next;
	}




	public void setNext(Node next) {
		// TODO Auto-generated method stub
		this.next=next;
	}
	
	

}