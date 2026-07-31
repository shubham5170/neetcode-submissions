class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int [] ret = new int[nums.length-k+1];
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<k;i++)
        {
            int num = nums[i];
            for(int j = list.size() - 1; j >= 0; j--)
            {
                if(list.get(j)<num) list.remove(j);
            }
            list.add(num);
        }

        int counter = 0;
        ret[counter++] = list.get(0);

        for(int i=k;i<nums.length;i++)
        {
  
            int num = nums[i];
            if(list.get(0)==nums[i-k]) list.remove(0);
            for(int j = list.size() - 1; j >= 0; j--)
            {
                if(list.get(j)<num) list.remove(j);
            }
            list.add(num);
            ret[counter++] = list.get(0);
        }





        return ret;
        
    }
}
