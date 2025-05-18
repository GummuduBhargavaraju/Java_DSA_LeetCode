class Solution {
    public int maxProduct(int[] nums) {

        int n = nums.length;

        int leftProduct = 1;
        int RightProduct = 1;
        int anws = nums[0];

        for(int i = 0; i<nums.length;i++)
        {
            leftProduct = leftProduct == 0 ? 1:leftProduct;
             RightProduct = RightProduct == 0 ? 1:RightProduct;

              leftProduct *= nums[i];

              RightProduct  *= nums[n-1-i]; 


              anws = Math.max(anws,(Math.max(leftProduct ,RightProduct)));

        }

        return anws;
        
    }
}






/*---> nums[n-1-i]   ----> n-1 you know last element 
---> -i -->               revers direction
.*/