class Solution {
    public int lengthOfLongestSubstring(String s) {


    int maxLength =0;
    Set<Character> check = new HashSet<>();
    int left =0;


   
    for(int right =0; right < s.length()  ; right++){
        if(!check.contains(s.charAt(right))){
            check.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);

        }else{
            while(check.contains(s.charAt(right))){
                check.remove(s.charAt(left));
                left++;
            }
                check.add(s.charAt(right));
        }


        
    }

        return maxLength;
        
    }
}