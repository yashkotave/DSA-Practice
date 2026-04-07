class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalCost = 0;
        int totalGas = 0;

        //Calculate total gas& totalCOst

        for (int i = 0; i< gas.length; i++){
            totalGas+= gas[i];
            totalCost+= cost[i];
        }

        //if total gas is less than cost return -1;
        if(totalGas<totalCost){
            return-1;
        }

        int currentGas = 0;
        int startIndex = 0;

        for( int i =0; i<gas.length;i++){
            //iterate through gas station

            currentGas += gas[i] - cost[i];
            //if current is negative reset startindex and currentgas =0
            if(currentGas<0){
                startIndex = i+1;
                currentGas = 0;
            }
        }
        //return the start index if the valid circuit exist
        return startIndex;

    }
}