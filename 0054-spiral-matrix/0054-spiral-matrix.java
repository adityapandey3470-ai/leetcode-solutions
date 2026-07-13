class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();
// sR = startingRow, eR = endingRow.
        int sR = 0;
        int eR = m - 1;
// sC = startingColumn, eC = endingColumn.
        int sC = 0;
        int eC = n - 1;

        while(sR <= eR && sC <= eC){

            for(int col = sC; col <= eC; col++){
                result.add(matrix[sR][col]);
            }
            sR++;

            for(int row = sR; row <= eR; row++){
                result.add(matrix[row][eC]);
            }
            eC--;
            
            if(sR <= eR){
            for(int col = eC; col >= sC; col--){
                result.add(matrix[eR][col]);
            }
             eR--;
            }

            if(sC <= eC){
             for(int row = eR; row >= sR; row--){
                result.add(matrix[row][sC]);
            }
            sC++;

            }
        }
        return result;
    }
}