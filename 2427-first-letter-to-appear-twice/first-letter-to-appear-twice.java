class Solution {
    public char repeatedCharacter(String s) {
        int arr[] = new int [26];
        String ch = "";
        for(int i =0; i< s.length() ; i++)
        {
            arr[s.charAt(i) - 'a']++;
            if(arr[s.charAt(i) - 'a'] == 2)
            {
                ch = String.valueOf(s.charAt(i));
                break;
            }
        }
        return ch.charAt(0);
        
    }
}