class Trie {
    private TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode current = root;
        for(char c: word.toCharArray()){
            if(!current.children.containsKey(c)){
                current.children.put(c, new TrieNode());
            }
            
            current = current.children.get(c);
        }
        current.isWord=true;
    }
    
    public boolean search(String word) {
        
        TrieNode current = root;
        for(char c: word.toCharArray()){
            current = current.children.get(c);
                if(current==null){
                    return false;
                }
        }
        if(current.isWord){
            return true;
        }
        return false;
        
    }
    
    public boolean startsWith(String prefix) {
        
        TrieNode current = root;
        for(char c: prefix.toCharArray() ){
            current = current.children.get(c);
            if(current == null){
                return false;
            }
        }
        return true;
        
        
        
    }
}

class TrieNode{
    Map<Character, TrieNode> children = new HashMap<>();
    boolean isWord = false;
    
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */