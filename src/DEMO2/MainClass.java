package DEMO2;

public class MainClass {
	public static void main(String[]args) {
		LinkedLists list=new LinkedLists();
		list.insert(18);
		list.insert(45);
		list.insert(12);
		list.insertAtStart(23);
		list.insertAt(2, 55);
		list.show();
	}

}
