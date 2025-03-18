class Solution {
    public int bitwiseComplement(int n) {
        String convert = Integer.toBinaryString(n);
        String change = complemt(convert);
        int StringtoIntager = Integer.parseInt(change ,2);
        return StringtoIntager; 
    }
    public String complemt(String str)
    {
        String result = "";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == '0')
            {
                result += "1";
            }
            if(str.charAt(i) == '1')
            {
                result += "0";
            }
        }
        return result;
    }
}