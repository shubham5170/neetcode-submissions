class Solution {
    public int lengthOfLongestSubstring(String s) {
       char[] arr = s.toCharArray();
               int n = s.length();

                               int start = 0;
                                       int end = 0;

                                                       Set<Character> set = new HashSet<>();
                                                               int ret = 0;

                                                                               while (start <= end && end < n) {
                                                                                           if (!set.contains(arr[end])) {
                                                                                                           set.add(arr[end++]);
                                                                                                                       } else {
                                                                                                                                       set.remove(arr[start++]);
                                                                                                                                                   }

                                                                                                                                                                           ret = Math.max(ret, end - start);
                                                                                                                                                                                   }

                                                                                                                                                                                                   return ret; 
    }
}
