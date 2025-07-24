class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int n = gas.length; //주유소

        int totalTank = 0;
        int currentTank = 0;
        int start =0; 

        for(int i =0; i < n; i++){
            int remain = gas[i] - cost[i];
            totalTank += remain;
            currentTank += remain;

             if(currentTank < 0){
                start = i+1;
                currentTank = 0;
           
        }
        }

        if(totalTank < 0 ) return -1;

       

        return start;

        
    }
}