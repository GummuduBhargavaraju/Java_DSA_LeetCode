class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int Bhargav = 0 ;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] % 2 == 1)
            {
                Bhargav ++;
            }
            else
            {
                Bhargav = 0;
            }
            if(Bhargav == 3)
            {
                return true;
            }
        }
        return false;
        
    }
}