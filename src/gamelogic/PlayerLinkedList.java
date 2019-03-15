package programlogic;

public class PlayerLinkedList {// A circular  linked list that will store nodes that use player objects as data, will be used for a player queue
	PlayerLinkedListNode head;
	PlayerLinkedListNode tail;
	
	
	public void append (Player data) {//adds a node at the end of the list
		if (head == null) {
			this.head = new PlayerLinkedListNode (data);
			this.tail=this.head;
			return;
			
		}
		PlayerLinkedListNode newNode= new PlayerLinkedListNode(data);
		this.tail.setNext(newNode);
		this.tail=newNode;
		this.tail.setNext(head);

	}
	

	public void eraseData(Player data) {//looks for a node via search criteria and breaks the link between the node and the rest of the list
		if (head == null) return;
		if (head.getData()==data) {
			this.setHead(head.getNext());
		}

		PlayerLinkedListNode current = head;
		while (current.getNext() != head) {
			if(current.getNext().getData()==data) {
				current.setNext(current.getNext().getNext());
				return;
			}
			current = current.getNext();

		}
	}


	public void setHead(PlayerLinkedListNode head) {
		this.head = head;
	}

	public PlayerLinkedListNode getHead() {
		return head;
	}

}

