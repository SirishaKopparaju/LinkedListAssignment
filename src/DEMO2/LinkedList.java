package DEMO2;

public class LinkedList {
Node head;
public void insert(int data)
{
	Node node=new Node();
	node.data=data;
	node.next=null;
	if(head==null)
	{
		head = node;
	}
	else {
		Node n=head;
	
		while(n.next!=null) {
			n=n.next;
		}
		n.next=node;
	}
}
public void insertAtStart(int data) {
	Node node=new Node();
	node.data=data;
	node.next=null;
	node.next=head;
	head=node;
}


public void show() {
	Node node=head;
	while(node.next!=null) {
		node=node.next;
	}
	System.out.println(node.data);
	}
}


