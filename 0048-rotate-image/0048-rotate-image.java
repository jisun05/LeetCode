class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        //대각선 기준으로 뒤집기
        for(int i=0; i<n;i++){
            for(int j=i+1; j<n;j++){
                int temp =0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //좌우 반전
        for(int i=0; i<n;i++){
            for(int j=0; j<n/2;j++){
                int temp2 = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp2;

            }
        }
        
    }
}