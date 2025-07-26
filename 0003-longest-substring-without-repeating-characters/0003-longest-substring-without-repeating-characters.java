class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length() < 1) return 0;

        Map<Character, Integer> map = new HashMap<>();

        int left = 0;
        int longest = 1;

        for(int right =0; right<s.length();right++){
                char currentChar = s.charAt(right);

                if(map.containsKey(currentChar)){
                    left =Math.max(left, map.get(currentChar) +1);
                }
                map.put(currentChar,right);
                longest = Math.max(longest, right-left+1);
                }
              
               
        return longest;
        
        
    }
}