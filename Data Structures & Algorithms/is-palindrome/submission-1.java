class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        char[] arr= new char[s.length()];
        int end = 0;
        for(char c: s.toCharArray())
        {
            if(c>='0' && c<='9') arr[end++]=c;
            if(c>='a' && c<='z') arr[end++]=c;
            if(c>='A' && c<='Z') arr[end++]=(char) (c-'A'+'a');
        }
        System.out.println(arr+":"+end);
        end--;

        while(start<end)
        {
            if(arr[start++]!=arr[end--]) return false;
        }
        return true;
        
    }
}
