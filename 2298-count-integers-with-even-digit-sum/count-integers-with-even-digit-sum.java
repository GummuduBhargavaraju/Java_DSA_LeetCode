class Solution {
    public int countEven(int num) {
        int count =0;
        for(int i = 1; i<=num;i++)
        {
            if(sumofdigits(i)%2 == 0)
            {
              count ++;
            }
        }
        return count;   
    }
    public int sumofdigits (int n)
    {
        int sum = 0;
        while(n != 0)
        {
            int dugitbhargav = n%10;
            sum += dugitbhargav;
             n = n/10;
        }
        return sum;
    }
}