class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        String ret = "";

        for(int i=0;i<n;i++)
        {
            String temp = ""+s.charAt(i);
            int j=1;
            while(i-j>=0 && i+j<n && s.charAt(i-j)==s.charAt(i+j))
            {
                temp = (s.charAt(i-j)+temp+s.charAt(i-j));
                j++;
            }
            ret = ret.length()<temp.length()?temp:ret;
        }

        for(double i=0.5;i<n;i++)
        {
            String temp = "";
            double j=0.5;
            while(i-j>=0 && i+j<n && s.charAt((int) (i-j))==s.charAt(((int) (i+j))))
            {
                temp = (s.charAt((int) (i-j))+temp+s.charAt((int) (i-j)));
                j++;
            }
            ret = ret.length()<temp.length()?temp:ret;
        }

        return ret;
        
    }
}
