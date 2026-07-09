/*
That is a very common point of confusion when optimizing the 3Sum problem! It feels like you're
aggressively skipping numbers and missing valid combinations (like [-1, -1, 2]), but you aren't.The
sorting + skipping approach avoids duplicate triplets without skipping unique combinations because
of when the skip happens.Here is exactly why this logic works and why it won't reduce your valid
solutions.1. The Core Idea: "We already did this"By sorting the array first, all identical numbers
are grouped together (e.g., [-4, -1, -1, 0, 1, 2]).When you are at index i, you are looking for all
valid triplets that start with nums[i].If nums[i] == nums[i - 1], it means you just finished finding
every single possible triplet that starts with that specific value. Moving to the next identical
number would only find the exact same triplets again.2. Why it doesn't skip triplets like [-1, -1,
2]Your main worry is likely: "If I have two -1s, won't the code skip the second -1 and miss a
triplet that needs both?"Look closely at the condition for j:Javaif (j > i + 1 && nums[j] == nums[j
- 1]) continue; The magic is in j > i + 1. This allows j to be identical to nums[j-1] only for the
very first element in the remaining subarray.Let's trace nums = [-1, -1, 2] after it's sorted:i = 0
(nums[i] = -1):The loop for j starts at j = i + 1, which is j = 1 (nums[j] = -1).The check j > i + 1
evaluates to 1 > 1, which is False.The code does not skip! It safely pairs the first -1 with the
second -1.It looks for target = -(-1 + -1) = 2, finds it, and adds [-1, -1, 2].i = 1 (nums[i] =
-1):The check i > 0 && nums[i] == nums[i - 1] evaluates to 1 > 0 && -1 == -1, which is True.It skips
this iteration. Why? Because we already found all triplets starting with -1 when i = 0.Summary of
the RulesLoop CheckWhat it actually meansi > 0 && nums[i] == nums[i - 1]"Never start a brand new
triplet with a value we've already used as a starting value."j > i + 1 && nums[j] == nums[j - 1]"For
the second number, only allow a duplicate if it's the first time we are looking at this position.
Don't pick the same value twice for j in a row."


*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Set<String> set = new HashSet<>();
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i - 1] == nums[i])
                continue;
            int start = i + 1;
            int end = n - 1;
            while (start < end) {
                if (start > i + 1 && nums[start] == nums[start - 1]) {
                    start++;
                    continue;
                }
                if (nums[i] + nums[start] + nums[end] == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[start]);
                    list.add(nums[end]);
                    res.add(list);
                    start++;
                    end--;
                } else if (nums[i] + nums[start] + nums[end] < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }

        return res;
    }
}
