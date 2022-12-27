class Solution {
    public void reverseString(char[] s) {
        int front=0, back=s.length-1;
        while(front<back){
            char c=s[front];
            s[front]=s[back];
            s[back]=c;
            front++;
            back--;
        }
        System.out.print(s);
    }
}