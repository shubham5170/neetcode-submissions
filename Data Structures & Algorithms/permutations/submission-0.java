class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        permute(nums,0,ret);
        return ret; 
    }

    public void permute(int[] nums, int index, List<List<Integer>> ret)
    {
        if(index==nums.length)
        {
            List<Integer> temp = new ArrayList<>();
            for(int num:nums)
            {
                temp.add(num);
            }
            ret.add(temp);
            return;
        }
        for(int i=index;i<nums.length;i++)
        {
            swap(nums,index,i);
            permute(nums,index+1,ret);
            swap(nums,index,i);
        }

    }

    public void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
