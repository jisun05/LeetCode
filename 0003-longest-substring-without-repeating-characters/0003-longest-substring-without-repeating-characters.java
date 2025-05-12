class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n =s.length();

        int left =0;
        int maxLength =0;
        HashSet<Character> hashSet = new HashSet<>();

        for(int right =0; right < n ; right++){
            if(!hashSet.contains(s.charAt(right))){
                hashSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            }else{
                while(hashSet.contains(s.charAt(right))){
                   hashSet.remove(s.charAt(left));
                   left++;
                }
        }

        hashSet.add(s.charAt(right));

        } 


        return maxLength;

        
    }
}