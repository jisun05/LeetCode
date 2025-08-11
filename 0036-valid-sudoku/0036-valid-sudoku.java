class Solution {
    public boolean isValidSudoku(char[][] board) {

        final int N = 9;  //스토쿠 길이

        boolean[][] rowUsed = new boolean[N][N];
        boolean[][] colUsed = new boolean[N][N];
        boolean[][] boxUsed = new boolean[N][N];

        for(int i=0; i<N;i++){
            for(int j=0; j<N;j++){
                char cell = board[i][j];

                if(cell == '.') {
                    continue;
                }

                int d = cell -'1';
                if(d < 0 || d >=9) return false;

                int boxIndex = (i/3) * 3 + (j/3);

                if(rowUsed[i][d] || colUsed[j][d] || boxUsed[boxIndex][d]){
                    return false;
                }

                rowUsed[i][d] = true;
                colUsed[j][d] = true;
                boxUsed[boxIndex][d] = true;

            }
        }
    return true;



        
    }
}