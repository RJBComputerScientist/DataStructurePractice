import Nodes.Node;
public class TestNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	I'll be creating 2 singly linked list
		 	
		 	1st 4 -> 9 -> 14
		 	2nd 7 -> 6 -> 16 -> 21 -> 14
		 	
		 */
		
		Node list = new Node(), head1, head2;
		
		head1 = new Node(4);
		head2 = new Node(7);
		
//		Than ill need a new node
		Node newNode = new Node(9);
		head1.setNext(newNode);
		
//		add another node to the second list head again
		newNode = new Node(6);
		head2.setNext(newNode);
		
		newNode = new Node(16);
		head2.getNext().setNext(newNode);
		
		newNode = new Node(21);
		head2.getNext().getNext().setNext(newNode);
		
		newNode = new Node(14);
		head1.getNext().setNext(newNode);
		head2.getNext().getNext().getNext().setNext(newNode);
		
		head1.getNext().getNext().getNext().setNext(null);
		
		Node intersectionPoint = list.getIntersectionNode(head1, head2);
		
		if(intersectionPoint == null) {
			System.out.print("No Intersection Point \n");
		} else {
			System.out.print("Intersection Point:\t"+intersectionPoint.data);
		}
	}

}
