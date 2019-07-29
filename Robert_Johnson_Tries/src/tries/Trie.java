package tries;

public class Trie {
	//Name of the node
		public Node root;
		
		//This is saying that Trie will be whatever root currently is, then changed to the new Node.
		public Trie() {
			this.root = new Node();
		}
		//insertion method
		public void insertWord(String word) {
			// gets the root node;
			Node currentNode = this.root;
			
			//iterates over everyc characted in the word
			for(int i = 0; i < word.length(); i++) {
				//currentLetter is just the character at the iteration
				Character currentLetter = word.charAt(i);
				//ask if currentLetter is in the map of the current node
				Node child = currentNode.children.get(currentLetter);
				//if not, then you create a new node
				if(child == null) {
					child = new Node();
					//put in the value of that character
					currentNode.children.put(currentLetter, child);
				
				}
				
				currentNode = child;
			}
			currentNode.isCompleteWord = true;
		}
		
		
		public boolean isPrefixValid(String prefix) {
			Node currentNode = this.root;		
			for (int i =0; i < prefix.length(); i++) {
				Character currentLetter= prefix.charAt(i);			
				System.out.println("Checking: "+currentLetter);
				Node child = currentNode.children.get(currentLetter);
				currentNode = child;				
				if (child==null) {
					System.out.println("false");
					return false;	
				}
			}
			System.out.println("true");
			return true;
		}
		
		public boolean isWordValid(String word) {
			//returns a true or false if the whole word can be made
			Node currentNode = this.root;
			for (int  i = 0; i < word.length(); i++) {
				Character currentLetter= word.charAt(i);			
				System.out.println("Checking: "+currentLetter);
				Node child = currentNode.children.get(currentLetter);
				currentNode = child;				
				if (child==null) {
					System.out.println("false");
					return false;
			}
		}
			System.out.println(currentNode.isCompleteWord);
			return currentNode.isCompleteWord;
		}
		
		public void traverse(Node node, String word) {
			if(node.isCompleteWord){
				System.out.println(word);
				}		
			for (Character c : node.children.keySet()){
				System.out.println(c);
				traverse(node.children.get(c) , word+c);
				}
		}
		
		void printAllKeys() {
			traverse(this.root, "");
		}
}
