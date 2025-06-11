class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        if(matrix.length == 0)
        {
            return result;
        }
        int rowstart = 0;
        int rowend =  matrix.length-1;;
        int colmstart = 0;
        int colmend = matrix[0].length-1;

        while( rowstart <= rowend && colmstart <= colmend)
        {
            for(int j = colmstart ; j<= colmend ; j++)
            {
                result.add(matrix[rowstart][j]);     
            }
            rowstart++;
                    
            for(int i = rowstart;i<= rowend;i++)
            {
                result.add(matrix[i][colmend]);
            }
            colmend--;
            
            if(rowstart <= rowend)
            {
                for(int j= colmend ; j>=colmstart ; j--)
                {
                     result.add(matrix[rowend][j]);      
                }
                rowend--;
                
            }

            if(colmstart <= colmend)
            {
                for(int i= rowend; i>=rowstart; i--)
                {
                    result.add(matrix[i][colmstart]);        
                }  
                 colmstart++;   
            }
        }
        return  result;
        
    }
}