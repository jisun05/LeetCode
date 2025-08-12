class Solution {
    public boolean isValidSudoku(char[][] board) {
        int N = 9;

        boolean[][] rowLine = new boolean[N][N];
        boolean[][] colLine = new boolean[N][N];
        boolean[][] square  = new boolean[N][N];


        for(int i =0 ;i <N;i++){
            for(int j=0;j<N;j++){
                char cell = board[i][j];

                if(cell == '.') {
                    continue;
                }

                int d = cell - '1';
                if(d < 0 || d > 8) return false;

                int boxIndex = (i/3) *3 + (j/3);

                if(rowLine[i][d] || colLine[j][d] || square[boxIndex][d] ){
                    return false;
                }
                rowLine[i][d] = true;
                colLine[j][d] = true;
                square[boxIndex][d] = true;


            }
        }

        return true;


    }
}