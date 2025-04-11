class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int Bhargav2B = 0;
        for(char ch : s.toCharArray())
        {
            if(ch == '(')
            {
               Bhargav2B ++; 
            }
            else if(ch == ')')
            {
                 Bhargav2B --; 
            }
            max = Math.max(max , Bhargav2B);
        }
        return max;
    }
}