class Solution {
    public boolean isIsomorphic(String s, String t) {

if(s.length() != t.length()) return false;
            Map<Character, Character> sT = new HashMap<>();
            Map<Character, Character> tS = new HashMap<>();



for(int i=0; i<s.length();i++){
    char c1 = s.charAt(i);
    char c2 = t.charAt(i);



    //s->t
    if(sT.containsKey(c1)){
        if(sT.get(c1) != c2) return false;
    }else{
        sT.put(c1,c2);
    }

    //t->s
    if(tS.containsKey(c2)){
        if(tS.get(c2) != c1){ return false;
        }
    }else{
        tS.put(c2,c1);
       
        
        
    }

 

}


   return true;

        
    }
}