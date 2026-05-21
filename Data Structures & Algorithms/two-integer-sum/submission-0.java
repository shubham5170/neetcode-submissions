class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] ret = new int[2];
        for(int j=0;j<nums.length;j++)
        {
            if(map.get(target-nums[j])!=null)
            {
                ret[0] = map.get(target-nums[j]);
                ret[1] = j;
                return ret;
            }
            else
            {
                map.put(nums[j],j);
            }
        }


        return ret;
        
    }
}
