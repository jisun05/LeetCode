class Solution {
    public int characterReplacement(String s, int k) {

            //슬라이딩 윈도우, 빈도 카운트
        int[] countDuplicate = new int[26];
        int maxChar = 0;

        int left =0;
        int result =0;
      

        for(int right=0; right<s.length();right++){
            int index = s.charAt(right) - 'A';
            countDuplicate[index]++;
            maxChar = Math.max(maxChar, countDuplicate[index] );


            //바꿔야 하는 문자수 = 전체 문자수 - 가장 많이 나온 문자수
             while((right-left+1) - maxChar > k){
            
                countDuplicate[s.charAt(left) - 'A']--;
                left++;
             }

            result = Math.max(result, right-left+1);

        }


       return result;

        
    }
}