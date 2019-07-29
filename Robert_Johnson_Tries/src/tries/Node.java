package tries;
import java.util.HashMap;

public class Node {
	//Hashmap takes a Character, Node value| name is children
	public HashMap<Character, Node> children;
	//Is the word complete true or false? It is defined under Trie.
	public boolean isCompleteWord;
	
	//
	public Node() {
		this.children = new HashMap<Character, Node>();
		this.isCompleteWord = false;
	}
	
}
