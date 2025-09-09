import java.util.*;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n];
        
        // 마지막 행을 dp에 복사
        for (int i = 0; i < n; i++) {
            dp[i] = triangle.get(n-1).get(i);
        }
        
        // 아래에서 위로 갱신
        for (int row = n - 2; row >= 0; row--) {
            for (int col = 0; col <= row; col++) {
                dp[col] = triangle.get(row).get(col) + Math.min(dp[col], dp[col+1]);
            }
        }
        
        return dp[0];
    }
}
