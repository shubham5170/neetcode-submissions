class Solution {

    public String encode(List<String> strs) {
        String res1="";
        String res2="";
        for(String str: strs)
        {
            res1+=str.length()+",";
            res2+=str;
        }

        return res1+"#"+res2;

    }

    public List<String> decode(String str) {
    if (str.length() == 0) {
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int i = 0;
        while (str.charAt(i) != '#') {
            StringBuilder cur = new StringBuilder();
            while (str.charAt(i) != ',') {
                cur.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(cur.toString()));
            i++;
        }
        i++;
        for (int sz : sizes) {
            res.add(str.substring(i, i + sz));
            i += sz;
        }
        return res;
    }
}
