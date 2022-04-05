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
	
		
	public void insertAtFirst(int data) {
		Node node=new Node();
		node.setData(data);
		if(this.head==null) {
			this.head=node;
			size++;
		}
		else{
			node.getNode();
			head=node;
		size++;
		}
		}
	

	public void display() {
		if(size==0) {
			System.out.println("List is empty");
		}
		else {
		
			System.out.println("list ::-->");
			Node n=head;
		
	
			for(int i=0;i<size;i++) {
		System.out.println(n.getData());
		n=n.getNode();
			}
		
	}

	}
	}
	

