class Solution {

    //using hashmap
    public List<Integer> majorityElement(int[] nums) {
        List <Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
                if(!hm.containsKey(nums[i]))
                {
                    hm.put(nums[i], 1);
                }
            else
            {
                hm.put(nums[i], hm.get(nums[i])+1);
            }
          
            if(hm.get(nums[i])>nums.length/3)
                if(!ans.contains(nums[i]))
                    ans.add(nums[i]);
        }
        return ans;
    }
}