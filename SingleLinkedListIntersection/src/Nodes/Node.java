package Nodes;

public class Node {
	public int data;
//	using encapsulation 
	private Node next;
	public Node(int d){
		data = d;
		setNext(null);
	}
	//^^ public method
	
	public Node() {
		
	}
	
//	Intersection method
	public Node getIntersectionNode(Node head1, Node head2) {
//		First i want to look at head2
		while(head2 != null) {
			Node temp = head1;
			while(temp != null) {
//				When both node are the same
				if(temp == head2) {
					return head2;
				}
//				Look for next temp until nodes match
				temp = temp.getNext();
			}
//			Look for next head2 until nodes match
			head2 = head2.getNext();
		}
//		If no node is the same
		return null;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
