class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
         //    i     j
        //[1,2,3,0,0,0]
        //     k
        //[2,5,6]

        int i = m -1;
        int j = m + n -1; 
        int k = n -1;

        while(i >= 0 && k >= 0 ){
            if(nums1[i] > nums2[k]){
                nums1[j] = nums1[i];
                i--;
               // j--;
            }else{
                nums1[j] = nums2[k];
                k--;
              
            }
            j--;
        }


        // 0 0 0
        // 1 ,2 ,5
        while(k >= 0){
            nums1[j] = nums2[k];
            j--;
            k--;
        }

    }



}