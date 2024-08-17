class Solution {
    public String destCity(List<List<String>> paths) {
        
        Set<String> incoming = new HashSet<>();
        Set<String> outgoing = new HashSet<>();
        
        for(List<String> path: paths){
            incoming.add(path.get(1));
            outgoing.add(path.get(0));
        }
        
        for(String city: incoming){
            if(!outgoing.contains(city)){
                return city;
            }
        }
        
        return "";
    }
}