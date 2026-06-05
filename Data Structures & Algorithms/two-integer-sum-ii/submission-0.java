class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ret[] =  new int[2];
        int start = 0;
        int end = numbers.length-1;
        while(start<end)
        {
            if(numbers[start]+numbers[end]==target)
            {
                ret[0]=start+1;
                ret[1]=end+1;
                return ret;
            }
            else if(numbers[start]+numbers[end]<target)
            {
                start++;
            }
            else
            {
                end--;
            }
        }

        return ret;
        
    }
}
