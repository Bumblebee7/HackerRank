package dataStructures.linkedLists.mySimplyLinkedList;

class Node {
	
	private int value;
	private Node followingNode;

	public Node(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public Node getFollowingNode() {
		return followingNode;
	}
	
	public void setFollowingNode(Node followingNode) {
		this.followingNode = followingNode;
	}
}
