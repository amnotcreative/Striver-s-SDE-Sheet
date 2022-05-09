//merging the two arrays randomly and then sorting them
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int c=0;
        for(int i=m; i<(m+n); i++)
        {
            nums1[i]=nums2[c];
            c++;
        }
        Arrays.sort(nums1);
        return;
    }
}


//sorting the array while inserting new elements from nums2[] into nums1[]
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int c;
        for(int i=0; i<n; i++)
        {
            c=0;
            while(c<(m+i) && nums2[i]>=nums1[c])
            {
                c++;
            }
            for(int j=m+n-1; j>c; j--)
            {
                nums1[j]=nums1[j-1];
            }
            nums1[c]=nums2[i];
        }
        return;
    }
}

