class Solution {
    public int longestConsecutive(int[] nums) {
         nums = Arrays.stream(nums)
                            .distinct()
                            .sorted()
                            .toArray();
        int max = 0;
        int max_so_far = 0;

        for(int i=0;i<nums.length;i++)
        {
            if(i==0 || nums[i]-nums[i-1]==1)
            max_so_far++;
            else
            max_so_far=1;
            max = Math.max(max,max_so_far);   
        } 
        return max;
    }
}
