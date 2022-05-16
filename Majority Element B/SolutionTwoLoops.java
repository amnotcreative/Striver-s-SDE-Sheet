class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List <Integer> ans = new ArrayList<>();
        int c=0;
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[i]==nums[j])
                {
                    c++;
                }
            }
            if(c>=nums.length/3)
                if(!ans.contains(nums[i]))
                    ans.add(nums[i]);
            c=0;
        }
        return ans;
    }
}
