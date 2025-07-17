class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //    i      k
        //1, 2, 3,0, 0,0

             //j
        //2,5,6
        //first we need 3 variables
        int i = m -1;
        int j = n-1;
        int k = m+n-1; //know about first inser


            // 이 조건만 주면 될까? 조건 x
        while(i>=0 && j >= 0){
         if(nums1[i] > nums2[j]){
            nums1[k] = nums1[i];
            i--;
         }else{
             nums1[k] = nums2[j];
             j--;
         }
        k--;
        }

        //think about if nums1 is 0,0,0,0   then i should be -1 then pre condition is always false
        while(j >= 0){
            nums1[k] = nums2[j];
            k--;
            j--;
        }

        
    }
}