class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int Bhargav = 0;
        int Bhargav2B = arr.length-1;
        while(Bhargav < Bhargav2B)
        {
           int mid = Bhargav + (Bhargav2B - Bhargav) /2;
            if(arr[mid] < arr[mid + 1] )
            {
                Bhargav = mid +1;
            }
            else
            {
             Bhargav2B = mid;
            } 
        }
        return Bhargav2B;
        
    }
}