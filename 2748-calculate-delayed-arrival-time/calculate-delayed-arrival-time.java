class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int Arrival = 0;
        Arrival = arrivalTime + delayedTime;
        if(Arrival >= 24)
        {
            Arrival = Arrival % 24;
        }
        return  Arrival ;
        
        
    }
}