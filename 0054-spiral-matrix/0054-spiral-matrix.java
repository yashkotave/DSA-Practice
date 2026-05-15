class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int rowBegin= 0,rowEnd = matrix.length-1;
        int colBegin =0;
        int colEnd = matrix[0].length-1;

        while(rowBegin<=rowEnd && colBegin<=colEnd){
            //traverse right
            for(int j =colBegin; j<=colEnd; j++){
                result.add(matrix[rowBegin][j]);
            }
            rowBegin++;

            //traverse Down
            for(int j = rowBegin; j<=rowEnd; j++){
                result.add(matrix[j][colEnd]);
            }
            colEnd--;

            //traverse Left
            if(rowBegin<=rowEnd){
                for(int j = colEnd; j>=colBegin; j--){
                    result.add(matrix[rowEnd][j]);
                }
                rowEnd--;
            }

            //traver up
            if(colBegin<=colEnd){
                for(int j = rowEnd; j>=rowBegin; j--){
                    result.add(matrix[j][colBegin]);
                }
                colBegin++;
            }
        }
        return result;
    }
}