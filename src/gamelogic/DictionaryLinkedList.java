package programlogic;


public class DictionaryLinkedList {// a simple linked list that takes dictionary nodes
	
	DictionaryNode head;

		public void append (String data) {//adds a node at the end of the list
			if (head == null) {
				this.head = new DictionaryNode (data);
				return;
			}

			DictionaryNode current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}current.setNext( new DictionaryNode(data)) ;

		}


		public void eraseData(String data) {//erases a node using a search criteria
			if (head == null) return;
			if (head.getData()==data) {
				this.setHead(head.getNext());
			}

			DictionaryNode current = head;
			while (current.getNext() != null) {
				if(current.getNext().getData()==data) {
					current.setNext(current.getNext().getNext());
					return;
				}
				current = current.getNext();

			}
		}


		public void setHead(DictionaryNode head) {
			this.head = head;
		}

		public DictionaryNode getHead() {
			return head;
		}
		
}

	


