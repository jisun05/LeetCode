class Solution {
    public void duplicateZeros(int[] arr) {
        int zeros = 0;
        // 1 0 2 3 0 4 5 0
        // Step 1. counting 0
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeros++;     //3
            }
        }

        // Step 2. 뒤에서부터 복제 작업 시작                      
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i + zeros < arr.length) {   
                arr[i + zeros] = arr[i]; // 원래 값을 zeros만큼 뒤로 이동
                // 7 + 3 =10 >8  pass    // 1 0 2 3 0 4 5 0
                // 6 + 2 =9 >8 pass      // 1 0 2 3 0 4 5 0
                // 5 + 2 = 7 < 8      
                    //arr[7] = arr [5]    // 1 0 2 3 0 4 5 4
                // 4 + 2  = 6 
                    //arr[6] = arr [4]   // 1 0 2 3 0 4 0 4
                //3 + 1 =4
                    //arr[4] = arr [3]   // 1 0 2 3 3 0 0 4
                //2 + 1 = 3
                    //arr[3] = arr[2]    // 1 0 2 2 3 0 0 4 
                // 1 + 1 = 2
                    //arr[2] = arr[1]   // 1 0 0 2 3 0 0 4 
                //0 +0 =0
                //arr[0] = arr[0]
               }

            if (arr[i] == 0) {
                zeros--; // 0 하나를 복제해야 하니까 zeros 감소   //0
                if (i + zeros < arr.length) {
                    arr[i + zeros] = 0; 
                    //arr[4 + 1] =0    // 1 0 2 3 0 0 0 4
                    //arr[1] = 0   //// 1 0 0 2 3 0 0 4 
                }
            }
        }
    }
}
