class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res="";
        // sort the given array by length
        Arrays.sort(strs, (a, b)->Integer.compare(a.length(), b.length()));
        for(String s: strs){
            System.out.println(s);
        }
        // convert the smallest string to character array
        char arr[] = strs[0].toCharArray();    
        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            for(int j=1;j<strs.length;j++){
                flag=false;
                if(strs[j].charAt(i)==arr[i]){
                    flag=true;
                }
                else{
                    flag=false;
                    break;
                }
                }
            if(flag){
                res=res+arr[i];
            }
            else{
                break;
            }
            }
            if(strs.length==1)
                return strs[0];
            return res;
        }
}