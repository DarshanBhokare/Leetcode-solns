class Solution {
    public int reverse(int x) {
        int reversed =0;
        int count =0;
        while(x!=0){
            if(reversed>Integer.MAX_VALUE/10 || (reversed==Integer.MAX_VALUE && x%10>7))
                return 0;
            if(reversed<Integer.MIN_VALUE/10 || (reversed==Integer.MIN_VALUE && x%10>-8))
                return 0;
            reversed=(reversed * 10)+ (x%10);
            count++;
            x=x/10;
        }
        
        return reversed;
    }
}
