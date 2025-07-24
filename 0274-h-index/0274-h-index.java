class Solution {
    public int hIndex(int[] citations) {


        Arrays.sort(citations);

        //0 1 3 5 6               5
        for(int i=0; i < citations.length;i++){
            int high = citations.length - i;
            if(citations[i] >= high){
                return high;
            }

        }


        return 0;
        
    }
}