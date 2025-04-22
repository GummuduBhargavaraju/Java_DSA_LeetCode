class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int [] Bhargav = new int[A.length];
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int count = 0;
        for(int i =0;i<A.length;i++)
        {
            set1.add(A[i]);
            set2.add(B[i]);
            if(A[i] == B[i])
            {
                count++;
            }
            else
            {
                if(set1.contains(B[i]))
                {
                   count++;
                }
                if(set2.contains(A[i]))
                {
                   count++;
                }
            }
            Bhargav[i] = count;
        }
        return Bhargav;
        
        
     }
}