class Solution {
    public String longestCommonPrefix(String[] strs) {

        //기준
        String check = strs[0];

        for(int i=1; i<strs.length ;i++){
            while(strs[i].indexOf(check) != 0){
                check = check.substring(0,check.length()-1);
                if (check.isEmpty()) return "";
            }
        }
            

            return check;
        
    }
}