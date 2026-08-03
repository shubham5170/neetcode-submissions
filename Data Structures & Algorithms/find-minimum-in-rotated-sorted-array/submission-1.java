class Solution {
    public int findMin(int[] nums) {
        int ret = nums[0];
        int start = 0;
        int end = nums.length-1;

        while(start<=end)
        {
            int mid = (start+end)/2;
            ret = Math.min(ret,nums[mid]);
            if(nums[end]>nums[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }

        return ret;

    }
}
