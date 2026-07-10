/*
Solution to this lies in finding most immediate max temp and once you find it not care about that number at all. 
So just maintain a stack keeping all the numbers while iterating array.
For each iteration, go through stack and see all the numbers where temp was smaller than this number, you have find answer
So remove that number from stack and do it for all elements in stack. Once done push current number to stack. 
*/
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res =  new int[n];

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++)
        {
            while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i])
            {
                int cooler = stack.pop();
                res[cooler] = i-cooler;
            }
            stack.push(i);

        }

        return res;

        
    }
}
