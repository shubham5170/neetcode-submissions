class Solution {
     public int characterReplacement(String s, int k) {
        int ret = 0;
        int start = 0;
        int end = 0;
        Map<Character, Integer> map = new HashMap<>();

        while (start <= end && end < s.length()) {

            if (isValid(map, k)) {
                map.put(s.charAt(end), map.getOrDefault(s.charAt(end), 0) + 1);
                end++;
                if (isValid(map, k)) ret = Math.max(ret, end - start);
             
            } else {
                map.put(s.charAt(start), map.getOrDefault(s.charAt(start), 0) - 1);
                start++;
            }
        }
        return ret;
    }

    public boolean isValid(Map<Character, Integer> map, int k) {
        System.out.println(map);
        int sum = 0;
        int max = 0;
        for (Character c : map.keySet()) {
            max = Math.max(max, map.get(c));
            sum += map.get(c);
        }
        return sum - max <= k;

    }
}
