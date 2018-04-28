public class LinkedListOfLabs {

	private Node head;
	
	public LinkedListOfLabs() {
		head = null;
	}
	
	public void insertAtFront(Lab l) {
		Node n = new Node(l);
		n.setNext(head);
		head = n;
	}
	
	public void insertAtBack(Lab l) {
		Node n = new Node(l);
		if (head == null) {
			head = n;
		}
		else {
		Node curr = head;
		while (curr.getNext() != null) {
			curr = curr.getNext();
		}
		curr.setNext(n);
		}
	}
	
	
	public int countLabs(int s) throws Exception {
		Node curr = head;
		int total = 0;
		while (curr != null) {
			if (curr.getData().getNbPrinters(s) >= 1) {
				total++;
				curr = curr.getNext();
			}
			
		}
		return total;
	}
	
	
	public void split(LinkedListOfLabs L1, LinkedListOfLabs L2, int s) throws Exception {
		Node curr = head;
		
		while (curr != null) {
			if (curr.getData().getPrinters(s) != null ) {
				L1.insertAtBack(curr.getData());
				curr = curr.getNext();
			} else {
				L2.insertAtFront(curr.getData());
				curr = curr.getNext();
			}
		}
		
	}
	
	
}
