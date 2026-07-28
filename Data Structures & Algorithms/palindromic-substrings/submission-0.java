class Solution {
    public int countSubstrings(String s) {
        int ret = 0;
        int n = s.length();

        for(int i=0;i<n;i++)
        {
            int j=0;
            while(i-j>=0 && i+j<n && s.charAt(i-j)==s.charAt(i+j))
            {
                ret++;
                j++;
            }
        }

        for(double i=0.5;i<n;i++)
        {
            double j=0.5;
            while(i-j>=0 && i+j<n && s.charAt((int)(i-j))==s.charAt((int)(i+j)))
            {
                ret++;
                j++;
            }
        }

        return ret;
        
    }
}
