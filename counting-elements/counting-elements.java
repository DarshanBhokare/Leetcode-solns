class Solution {
    public int countElements(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        int count=0;
        for(int a: arr){
            set.add(a);
        }
        for(int a: arr){
            if(set.contains(a+1))
                count++;
        }
        return count;
    }
}