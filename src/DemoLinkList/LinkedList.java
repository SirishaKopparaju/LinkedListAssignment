package DemoLinkList;

public class LinkedList {
	int size;
	Node head;
	Node tail;
	
	public LinkedList() {
		this.size=0;
		this.head=null;
	}
	
	public boolean isEmpty() {
		if(this.size==0) {
			return true;
		}
		return false;
	}
	
	public void inserAtFirst(int data) {
		Node node=new Node();
		node.setData(data);
		if(head==null) {
			head=node;	
			size++;
		}
		else {
			node.setNext(head);;
			head=node;
			size++;
		}
	}
	
	
	public void display() {
		System.out.println("size ::->"+size);
		if(size==0) {
			System.out.println("List is empty");
		}else {
			System.out.println("List ::->");
			Node n=head;
			for(int i=0;i<size;i++) {
				System.out.println(n.getData());
				n=n.getNext();;
				
			}
		}
	}
}