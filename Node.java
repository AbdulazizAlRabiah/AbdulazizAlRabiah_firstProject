public class Node {

	private Lab data;
	private Node next;
	
	public Node(Lab l) {
		data = l;
		next = null;
	}

	public Lab getData() {
		return data;
	}

	public void setData(Lab data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
	
}
