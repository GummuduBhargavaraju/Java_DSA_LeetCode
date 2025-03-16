class Solution {
    public int maxPower(String s) {
    if( s.length() == 0 ||s == null)
    {
        return 0;
    }
    int countstrick = 1; int maxstrick = 1;
    for(int i = 1 ; i<s.length() ; i++)
    {
        if(s.charAt(i) == s.charAt(i - 1))
        {
            countstrick ++;
        }
        else{
            countstrick = 1;
        }
        maxstrick = Math.max(maxstrick ,countstrick);
    }
    return maxstrick;
        
    }
}