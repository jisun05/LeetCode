class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length() <= 0 || s == null) return 0;

            int first =0;
            int longest = Integer.MIN_VALUE;
            Set<Character> set = new HashSet<>();

            for(int right=0; right<s.length();right++){
                char key = s.charAt(right);

                while(set.contains(key)){
                    set.remove(s.charAt(first));
                   first++;
                }

                if(!set.contains(key)){
                    set.add(key);
                }
                longest = Math.max(longest, right-first+1);

            }



        return longest;
    }
}