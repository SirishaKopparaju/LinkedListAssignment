package DemoLinkList;

public class Node<E>{
	private int data;
	private Node node;
	public E key;
	
	
	public Node() {
		this.data=0;
		this.node=null;
	}
	
	
	
	
	public Node(E key) {
		super();
		this.key=key;
		this.node = null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNode() {
		return node;
	}
	public void setNode(Node node) {
		this.node = node;
	}




	public Node getNext() {
		// TODO Auto-generated method stub
		return this.node;
	}




	public void setNext(Node head) {
		// TODO Auto-generated method stub
		this.node=head;
	}
	
	

}