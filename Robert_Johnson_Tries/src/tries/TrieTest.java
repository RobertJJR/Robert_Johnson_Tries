package tries;
import java.util.Set;

public class TrieTest {
	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.insertWord("car");
		trie.insertWord("card");
		trie.insertWord("chip");
		trie.insertWord("trie");
		trie.insertWord("try");
		
		System.out.println("============================");
		Set<Character> keys = trie.root.children.keySet();
		for(Character key : keys) {
			System.out.println(key);
		}
		System.out.println("============================");
		System.out.println(trie.isPrefixValid("ch"));
		System.out.println("============================");
		System.out.println(trie.isWordValid("cassr"));
		System.out.println("============================");
		trie.traverse(trie.root, "car");
		System.out.println("============================");
		trie.printAllKeys();
	
		
	}

}
