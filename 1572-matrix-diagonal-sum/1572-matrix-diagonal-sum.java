class Solution {
    public int diagonalSum(int[][] mat) {

        int row = mat.length;
        int sum = 0;

        for(int i = 0; i < row; i++){

            sum = sum + mat[i][i];
            sum = sum + mat[i][row-1-i];

        }

        if(row % 2 != 0){

            sum = sum - mat[row/2][row/2];
        }
        return sum;
    }
}