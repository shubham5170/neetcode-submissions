class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Set<String> set = new HashSet<>();
        Arrays.sort(nums);
        List<List<Integer>> res =  new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            if(i>0 && nums[i-1]==nums[i]) continue;
            int start=i+1;
            int end = n-1;
            while(start<end)
            {
                if(start>i+1 && nums[start]==nums[start-1]) 
                {
                    start++;
                    continue;
                }
                if(nums[i]+nums[start]+nums[end]==0)
                {
                   List<Integer> list =  new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[start]);
                    list.add(nums[end]);
                    res.add(list);
                    start++;
                    end--;
                }
                else if(nums[i]+nums[start]+nums[end]<0)
                {
                    start++;
                }
                else
                {
                    end--;
                }
            }
        }


        return res;      
    }
}
