class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int start = 0;
        int end = matrix.length-1;
        int mid = (start+end)/2;

        while(start<end)
        {
            mid = (start+end)/2;
            if(matrix[mid][0]<=target && matrix[mid][matrix[mid].length-1]>=target) break;
            else if(target<matrix[mid][0]) end = mid-1;
            else start = mid+1;
        }

        if(start>=end) mid = start;

        System.out.println(mid);

        start = 0;
        end = matrix[mid].length-1;

        while(start<=end)
        {
            int mid2 = (start+end)/2;
            if(matrix[mid][mid2]==target) return true;
            else if(matrix[mid][mid2]<target) start = mid2+1;
            else end = mid2-1;
        }

        return false;
        
    }
}
