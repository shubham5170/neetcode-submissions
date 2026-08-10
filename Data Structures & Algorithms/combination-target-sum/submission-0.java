class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
          List<List<Integer>> ret = new ArrayList<>();
          combinationSum(nums,target,0,ret,new ArrayList<>());
          return ret;
    }

    public void combinationSum(int[] nums, int target,int index, List<List<Integer>> ret,      List<Integer> temp)
    {
        if(index==nums.length) return;
        if(target==0) 
        {
            ret.add(temp);
            return;
        }
        if(target>=nums[index])
        {
            List<Integer> temp2 =  new ArrayList<>(temp);
            temp2.add(nums[index]);
            combinationSum(nums,target-nums[index],index,ret,temp2);
        }
        combinationSum(nums,target,index+1,ret,temp);

    }
}
