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
        // return longestConsecutive(nums,nums[0],1,1);
    }

    public int longestConsecutive(int[] nums,int prevNum, int index, int size)
    {
        if(index==nums.length) return size;
        if(nums[index]==prevNum+1)
        {
            return longestConsecutive(nums,nums[index],index+1,size+1);
        }
        else
        {
            return Math.max(
                longestConsecutive(nums,prevNum,index+1,size),
                longestConsecutive(nums,nums[index],index+1,1)
            );
        }

    }
}
