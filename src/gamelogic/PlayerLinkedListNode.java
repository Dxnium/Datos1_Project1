package programlogic;

public class PlayerLinkedListNode {//node that takes a player object as data
	private Player data;
	private PlayerLinkedListNode next;
	
	
	public PlayerLinkedListNode(Player data) {
		this.data=data;
	}
	public Player getData() {
		return data;
	}
	public void setData(Player data) {
		this.data = data;
	}
	public PlayerLinkedListNode getNext() {
		return next;
	}
	public void setNext(PlayerLinkedListNode next) {
		this.next = next;
	}
	
	
	
}
