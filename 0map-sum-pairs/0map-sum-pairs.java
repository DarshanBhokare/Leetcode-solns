class MapSum {
    Map<String, Integer> map;
    TrieNode root;
    public MapSum() {
        this.map = new HashMap<>();
        this.root = new TrieNode();
    }
    
    public void insert(String key, int val) {
        int difference = val - map.getOrDefault(key,0);
        map.put(key,val);
        TrieNode current = root;
        current.value +=difference;
        for(char c: key.toCharArray()){
            if(!current.children.containsKey(c)){
                current.children.put(c, new TrieNode());
            }
            
            current = current.children.get(c);
            current.value += difference;
        }
        
        
    }
    
    public int sum(String prefix) {
        
        TrieNode current = root;
        for(char c: prefix.toCharArray()){
            current = current.children.get(c);
            if(current == null){
                return 0;
            }
        }
        
        return current.value;
        
    }
}

class TrieNode{
    Map<Character, TrieNode> children = new HashMap<>();
    int value=0;
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */