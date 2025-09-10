class Solution {
    public int fib(int n) {

        if(n < 2) return n;
        int first= 0; 
        int second = 1;
            // 0 1 1 2 3 5
        for(int i=2;i<=n;i++){
            int third = first + second;
            first = second;
            second = third; 
        }

        return second;
    }
}