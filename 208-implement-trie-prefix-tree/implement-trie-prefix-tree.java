class Trie {
    class TrieNode{
        boolean isComplete;
        TrieNode[] children;
        public TrieNode(){
            isComplete = false;
            children = new TrieNode[26];
        }
    }

    TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode node = root;
        for(char c : word.toCharArray()){
            if(node.children[c - 'a'] == null)
             node.children[c - 'a'] = new TrieNode();
            node = node.children[c-'a']; 
        }
        node.isComplete = true;
    }
    
    public boolean search(String word) {
        TrieNode node = root;
        for(char c : word.toCharArray()){
            if(node.children[c-'a'] == null)
             return false;
            node = node.children[c-'a']; 
        }
        return node.isComplete;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for(char c: prefix.toCharArray()){
            if(node.children[c-'a'] == null)
             return false;
            node = node.children[c-'a']; 
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */