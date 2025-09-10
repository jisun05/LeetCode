class Solution {
    public int climbStairs(int n) {

        if(n <= 3) return n;

        
        int b=1;
        int c =2;
        for(int i=3;i<=n;i++){
            int result = b+c;
            b = c;
            c = result;
        }
        return c;
    }
}