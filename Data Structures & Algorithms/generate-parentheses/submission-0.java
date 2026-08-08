class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<>();
        recur(ret,"",0,0,n);
        return ret;
        
    }

    public void recur(List<String> res,String s, int l, int r, int n)
    {
        if(l==n && r==n) res.add(s);
        if(l<n) recur(res,s+"(",l+1,r,n);
        if(r<l) recur(res,s+")",l,r+1,n);

    }
}
