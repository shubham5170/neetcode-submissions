class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l = s1.length();
        for(int i=0;i+l<=s2.length();i++)
        {
            if(isPerm(s1,s2.substring(i,i+l)))
            return true;
        }

        return false;
     
        
    }

    public boolean isPerm(String s1, String s2)
    {
        int[] c1 =  new int[26];
        int[] c2 =  new int[26];

        for(char c:s1.toCharArray())
        {
            c1[c-'a']++;
        }

        
        for(char c:s2.toCharArray())
        {
            c2[c-'a']++;
        }

        for(int i=0;i<26;i++)
        {
            if(c1[i]!=c2[i])
            return false;
        }


        return true;
    }
}
