class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowid = serachColame(matrix , target);
        if(rowid  != -1)
        {
            return benarysearch(rowid , matrix , target);
        }
        else{
            return false;
        }
    }

    private int serachColame(int[][] matrix, int target)
    {
        int low = 0;
        int high = matrix.length-1;
        while(low <= high)
        {
            int mid = (low + high)/2;

            if(matrix[mid][0] <= target && target <= matrix[mid][matrix[0].length-1])
            {
                return mid;
            }
            else if (matrix[mid][0] < target)
            {
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        }
        return -1;
    }

    private boolean benarysearch(int rowid ,int [][] matrix , int target)
    {
        int low = 0;
        int high = matrix[rowid].length-1;

        while(low <= high)
        {
            int mid = (low + high)/2;
            if(matrix[rowid][mid] == target)
            {
                return true;
            }
            else if(matrix[rowid][mid] < target)
            {
                low = mid +1;
            }
            else{
                high = mid -1;
            }
            
        }
        return false;
    }
}