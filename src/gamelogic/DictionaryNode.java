package programlogic;

public class DictionaryNode {// a simple node for the dictionary linked list that stores a string data
	private String data;
	private DictionaryNode next;
	
	
	public DictionaryNode(String data) {
		this.data=data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public DictionaryNode getNext() {
		return next;
	}

	public void setNext(DictionaryNode next) {
		this.next = next;
	}

}
