//Approach 1:
class Solution {
    public int findDuplicate(int[] nums) {
        int arr[] = new int[nums.length];
        int i=0;
        while(arr[nums[i]]==0)
        {
             arr[nums[i]]=-1;
            i++;
        }
           
        
        return nums[i];
    }
}

//Approach 2:
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i;
        for(i=1; i<nums.length; i++)
        {
            if(nums[i]==nums[i-1])
                return nums[i];
        }
        return 0;
    }
}