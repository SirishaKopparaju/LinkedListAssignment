package DemoLinkList;

public class LinkedList {
	int size;
public 	Node head;
public	Node tail;
	
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
				n=n.getNext();
				
			}
		}
	}
	
	public void insertAtLast(int data) {
		Node n,t;
        n=new Node();
        n.setData(data);
        n.setNext(null);
        // this.head;
		if(this.head==null) {
			this.head=n;
			
		}else if(this.tail==null){
			this.tail=n;
			}
		else {
			
			 while (this.head.getNext()!=null) {
             Node tempnode=this.head;  
			 this.head=n;

	                this.head.setNext(tempnode);
	                tail=n;
	            size++;
		}
		
	}}
	
	
	public void insertAtPosition(int val,int pos){
        if (pos == 1){
        	inserAtFirst(val);
        }
        else if(pos == size+1 && pos > size+1){
            insertAtLast(val);
        }else if(pos>1 && pos<size){
            Node n,t;
            n=new Node();
            n.setData(val);
            n.setNext(null);
            t=head;
//            21,14,16,43
            for(int i=1;i<pos;i++) {
//            	t=head;i=1;t=head.getnext();
                t = t.getNext();
                n.setNext(t.getNext());
                t.setNext(n);
                size++;
            }
        }

    }
	
	
	public void deleteFirst(){
		Node tempnode;
        if(head == null){
        	tempnode=null;
            System.out.println("Empty");
        }
        else{
        	tempnode=this.head;
            head=head.getNext();
            size--;
        }
    }
	
	public void deleteLast(){
        if (head == null){
            System.out.println("empty");
        }
        else if(size == 1){
            head=null;
            size--;
        }else{
            Node t;
            t=head;
            for(int i=1;i<size-1;i++)
                t=t.getNext();
                t.setNext(null);
                size--;
        }
    }


	public boolean peek() {
		// TODO Auto-generated method stub
		boolean stackEmpty=false;

		if(this.head==null) {
	
			stackEmpty=true;
	}
		return stackEmpty;
	}
	public void add( Node myFirstNode)
	{
		Node tempNode;
		if(this.head==null) {
			this.head=myFirstNode;
		}
		else if(this.tail==null){
			this.tail=myFirstNode;
		}
		else {
		tempNode=this.head;
		this.head=myFirstNode;
		this.head.setNext(tempNode);
		
	}
	
	}
		
	}

