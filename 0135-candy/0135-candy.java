class Solution {
    public int candy(int[] ratings) {


        int n = ratings.length;
        if( n <= 1) return n;

        int[] candies = new int[n];
        Arrays.fill(candies, 1);

        //[1,3,2,2,1]
        for(int i =1; i < n ;i++){
            if(ratings[i] > ratings[i-1]){
                candies[i] = candies[i-1] +1;
            }
        }
        //배열의 마지막 인덱스가 n-1이라
        //[1,3,2,2,1]
        for(int i = n-2 ; i>=0 ;i--){
                if(ratings[i] > ratings[i+1]){
                    candies[i] = Math.max(candies[i],candies[i+1] +1) ;
                }

        }
        int result = 0;

        for(int sum : candies){
                result += sum;
        }

        return result;
        
    }
}