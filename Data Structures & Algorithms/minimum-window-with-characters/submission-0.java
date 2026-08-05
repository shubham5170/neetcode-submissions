class Solution {
    public String minWindow(String s, String t) {
        String ret = null;

        int[] c1 =  new int[60];
        

        for(int i=0;i<t.length();i++)
        {
            c1[t.charAt(i)-'A']++;
        }

        for(int l=0;l<=s.length()-t.length();l++)
        {
            int[] c2 =  new int[60];
            int r = l;
            while(r<s.length() && !isPresent(c1,c2))
            {
                c2[s.charAt(r++)-'A']++;
                if(isPresent(c1,c2)) 
                {
                    if(ret==null || ret.length()>r-l) ret = s.substring(l,r);
                }      
            }
            c2[s.charAt(l)-'A']--;
        }

        return ret==null?"":ret;
        
    }

    public boolean isPresent(int[] c1, int[] c2)
    {
        for(int i=0;i<60;i++)
        {
            if(c2[i]<c1[i]) return false;
        }

        return true;

    }
}
