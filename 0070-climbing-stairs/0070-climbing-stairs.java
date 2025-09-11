class Solution {
    public int climbStairs(int n) {
        // 1 2 3 4
        // 1 2 3 5

        if(n<=3) return n;

      
        int second =2;
        int third =3;
        for(int i =3; i<n;i++){
            int sum =second + third;
            second = third;
            third = sum;
        }

        return third;


    }
}