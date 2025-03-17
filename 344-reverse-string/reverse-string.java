class Solution {
    public void reverseString(char[] s) {
        int Bhargav = 0;
        int Bhargav2B = s.length-1;
        while(Bhargav < Bhargav2B)
        {
            char ch = s[ Bhargav];
            s[Bhargav]=s[Bhargav2B];
            s[Bhargav2B] = ch;
             Bhargav ++;
             Bhargav2B--;
        }
        
    }
}