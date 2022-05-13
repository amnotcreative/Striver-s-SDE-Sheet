public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m=matrix.length,n=matrix[0].length,i=0,j=0;
        int low =0, high = m*n-1;
        int mid=0;
        while(low<=high)
        { 
            mid=(low + high)/2;
            i= mid/n;
            j= mid%n;
            int temp = matrix[i][j];
                if(target==temp)
                    return true;
                else if(target < temp)
                    high=mid-1;
                else
                    low = mid+1;
         }  
        return false;
    }
}
