class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ret = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();

        for(String s: strs)
        {
            String key = generateKey(s);
            if(map.get(key)==null)
            {
                List<String> list = new ArrayList<>();
                map.put(key,list);
            }
            map.get(key).add(s);
        }

        for(List<String> list: map.values())
        {
            ret.add(list);
        }



        return ret;
    }

    public String generateKey(String s)
    {
        int[] count = new int[26];
        for(char c: s.toCharArray()) count[c-'a']++;
        String ret = "";
        for(int i=0;i<26;i++)
        {
            ret += i+":"+count[i]+":";
        }

        return ret;

    }
}
