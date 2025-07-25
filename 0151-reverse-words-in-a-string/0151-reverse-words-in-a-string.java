class Solution {
    public String reverseWords(String s) {
            s = s.trim(); // 앞뒤 공백 제거
            String[] words = s.split("\\s+");
            StringBuilder sb = new StringBuilder();

            for(int i = words.length-1 ; i>=0 ;i--){
                sb.append(words[i]);
                if(i !=0) sb.append(" ");
            }

            
        return sb.toString();
        
    }
}