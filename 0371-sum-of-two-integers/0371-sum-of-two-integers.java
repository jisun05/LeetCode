class Solution {
    public int getSum(int a, int b) {

        while( b != 0){
            int current = (a&b) << 1;
            a = a ^ b;
            b = current;
        }

        return a;
        
    }
}