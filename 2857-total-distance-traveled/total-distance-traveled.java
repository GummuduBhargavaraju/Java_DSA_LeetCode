class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
                int maxdistans = 0;
                while(mainTank >= 5 &&  additionalTank > 0)
                {
                      maxdistans += 50;
                      mainTank = (mainTank - 5) +1;
                       additionalTank --;
                }
                maxdistans  +=  mainTank * 10;
        return maxdistans;
    }
}