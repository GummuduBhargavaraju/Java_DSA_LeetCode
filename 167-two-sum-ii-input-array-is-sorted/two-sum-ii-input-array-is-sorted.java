class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] result = new int [2];
        int Bhargav =0;
        int Bhargav2B = numbers.length-1;
        while(Bhargav < Bhargav2B)
        {
            int sum = numbers[Bhargav] + numbers[Bhargav2B];
            if(sum == target)
            {
                result[0] = Bhargav + 1;
                result [1] = Bhargav2B + 1;
                break;
            }
            else if (sum > target)
            {
                Bhargav2B --;
            }
            else{
                Bhargav ++;
            }
        }
        return result;       
    }
}