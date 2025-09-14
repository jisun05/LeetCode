class Solution {
    public int maxFreqSum(String s) {

            if(s.length() == 1) return 1;
        int maxVowel =0;
        int maxConsonant = 0;
        int result =0;
        Map<Character, Integer> mapVowel = new HashMap<>();
        Map<Character, Integer> mapConsonant = new HashMap<>();
        
        for(char c : s.toCharArray()){

        switch(c){

         //check vowel
        case 'a', 'e', 'i', 'o', 'u':

            mapVowel.put(c, mapVowel.getOrDefault(c,0)+1);
            maxVowel = Math.max(maxVowel, mapVowel.get(c));
            break;
        //check consonant
        default:
            mapConsonant.put(c, mapConsonant.getOrDefault(c,0)+1);
            maxConsonant = Math.max(maxConsonant, mapConsonant.get(c));
            break;

        }
 
        }
       
            result = maxVowel+maxConsonant; 
            return result;
        
    }
}