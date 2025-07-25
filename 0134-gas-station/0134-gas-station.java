class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        //gas[5]   -> 5th station have gas[5] gas
        //gas[5] to gas[6] : cost[5]

        int startIdx =0; //return this      
        int totalGas =0;
        int currentGas = 0;
        for(int i =0; i< gas.length ; i++){

            int reamin = gas[i] - cost[i];
            totalGas += reamin;
            currentGas += reamin;

            if(currentGas <0){
                currentGas =0;
                startIdx= i+1;
            }

        }


        if(totalGas < 0) return -1;

        return startIdx;
    }
}