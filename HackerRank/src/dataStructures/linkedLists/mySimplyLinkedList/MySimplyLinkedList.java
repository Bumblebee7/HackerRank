package dataStructures.linkedLists.mySimplyLinkedList;

public class MySimplyLinkedList {
	
	private Node head;
	private Node tail;
	
	public MySimplyLinkedList() {
		
	}
	
	public MySimplyLinkedList(int head) {
		this.head = new Node(head);
		tail = this.head;
	}
	
	public void addNode(int value) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
		}
		tail.setFollowingNode(newNode);
		tail = newNode;
	}
	
	public int getHeadValue() {
		return head.getValue();
	}

	public int getTailValue() {
		return tail.getValue();
	}
}
