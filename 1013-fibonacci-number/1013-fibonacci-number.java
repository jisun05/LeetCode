class Solution {
    public int fib(int n) {
        if (n < 2) return n; // 0 또는 1은 그대로 반환

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
