class Solution {
    public int numberOfBeams(String[] bank) {
        int bhargavTotalrow =0;
        int privesrow = 0;
        for(String row : bank)
        {
            int carrentrow = 0;
            for(int i=0;i<row.length();i++)
            {
                if(row.charAt(i) == '1')
                {
                   carrentrow ++;
                }
            }
            if(carrentrow > 0)
            {
              bhargavTotalrow += privesrow * carrentrow;
              privesrow = carrentrow; 
            }
        }
        return bhargavTotalrow; 
    }
}