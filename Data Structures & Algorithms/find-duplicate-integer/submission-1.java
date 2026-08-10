class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1]) return nums[i];
        }
        return 0;
        
    }
}
