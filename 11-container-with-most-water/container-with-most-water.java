class Solution {
    public int maxArea(int[] height) {
    int Bhargav =0;
    int Bhargav2B = height.length-1;
    int currentArea =0 , MaxArea = 0;
    while (Bhargav < Bhargav2B)
    {
    currentArea = (int) (Math.min(height[Bhargav],height[ Bhargav2B]) * (Bhargav2B-Bhargav));
       MaxArea  = Math.max(currentArea ,  MaxArea );
       if (height[Bhargav] <= height[Bhargav2B])
        {
           Bhargav ++;
        }
        else if(height[Bhargav] > height[Bhargav2B])
        {
           Bhargav2B --; 
        }
    }
    return  MaxArea;
    }
}