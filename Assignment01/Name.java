package assignment01;

public class Name {
	private String name;
	private String friends = "";
	
	public Name(String nm) {
		name = nm;
		if(nm.indexOf(' ') >= 0) throw new IllegalArgumentException("No Spaces in Names");
	}
	
	public void befriend(Name n) {
		friends = friends + n.name + " ";
	}
	
	public void unfriend(Name n) {
		friends = friends.replace((n.name + ' '), "");
	}
	
	public String getFriendNames() {
		return friends;
	}
	
	public int getFriendCount() {
		int count = 0;
		for(char c : friends.toCharArray()) {
			if(c == ' ') {
				count += 1;
			}
		}
		return count;
	}
}