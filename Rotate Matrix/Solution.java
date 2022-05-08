class Solution {
    public void rotate(int[][] matrix) {
        int i,j,k,temp=0, r= matrix.length;
        for(i=0; i<r; i++)
        {
            for(j=i; j<r; j++)
            {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        for(i=0; i<r; i++)
        {
            for(j=0; j<r/2; j++)
            {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][r-j-1];
                matrix[i][r-j-1] = temp;
            }
        }
        
        return;
    }
}