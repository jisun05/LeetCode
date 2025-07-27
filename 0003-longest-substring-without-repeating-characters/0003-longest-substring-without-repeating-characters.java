class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() ==0) return 0;
        
        Map<Character, Integer> map = new HashMap<>();
        int longest =0;     //3   3
        int left=0;        //1   2  3
        //"abcabcbb"
                      
        for(int right=0 ;right<s.length();right++){
            char c = s.charAt(right);

            if(map.containsKey(c) && map.get(c) >= left){
                left = map.get(c)+1;
            }    

            map.put(c,right);
            longest = Math.max(longest, right-left+1);
           
        }
        return longest;
    }
}