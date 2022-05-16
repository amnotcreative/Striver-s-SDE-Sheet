class Solution {
    public int uniquePaths(int m, int n) {
        int ans =0;
        int arr[][] = new int[m][n];
        ans = count(m-1,n-1, arr);
        return ans;
    }
    
    private static int count(int m, int n, int[][] arr)
    {
        if(m==0 && n==0)
            return 1;
        else if(m<0 || n<0)
            return 0;
        if(arr[m][n] != 0)
            return arr[m][n];
        arr[m][n]=count(m, n-1, arr) + count(m-1, n, arr);
        return arr[m][n];
    }
}