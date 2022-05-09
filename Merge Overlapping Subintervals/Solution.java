class Solution {
    public int[][] merge(int[][] intervals) {
        int i, j;
        //sorting the array using Array function
        //Arrays.sort(intervals, (a,b) -> a[0]-b[0]);

        //sorting the Array without Array function
        for(i=0; i<intervals.length-1; i++)
        {
            for(j=i+1; j<intervals.length; j++)
            {
                if(intervals[i][0]>intervals[j][0])
                    swap(intervals, i,j);
                else if(intervals[i][0]==intervals[j][0])
                {
                    if(intervals[i][1]>intervals[j][1])
                        swap(intervals, i, j);
                }
            }
                
        }
        
        
        ArrayList <int[]> ans = new ArrayList<>();
        int lb = intervals[0][0];
        int ub = intervals[0][1];
        for(int p[] : intervals)
        {
            if(p[0]<=ub)
            {
                ub = Math.max(ub,p[1]);
            }
            else
            {
                ans.add(new int[]{lb, ub});
                lb = p[0];
                ub = p[1];
            }
        }
         ans.add(new int[]{lb, ub});
        return ans.toArray(new int[0][]);
    }
    
    private static void swap(int arr[][], int i, int j)
    {
        int temp[] = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
}