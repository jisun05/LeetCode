class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;

        //calaulate when the ransomNote =0
        Map<Character, Integer> magaMap = new HashMap<>();
        
        for(char c: magazine.toCharArray()){
            magaMap.put(c, magaMap.getOrDefault(c,0)+1);
        }
        
        for(int i=0; i < ransomNote.length();i++){
                if(!magaMap.containsKey(ransomNote.charAt(i)) || magaMap.get(ransomNote.charAt(i)).equals(0)){return false;}
                else{
                    magaMap.put(ransomNote.charAt(i), magaMap.get(ransomNote.charAt(i))-1);
                }

        }




        return true;



    }
}