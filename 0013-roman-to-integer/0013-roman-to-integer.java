class Solution {
    public int romanToInt(String s) {   

        int result =0;

        for(int i =0; i < s.length(); i++){
            int current = changeToNum(s.charAt(i));
            
            if(i+1 < s.length() && changeToNum(s.charAt(i+1)) > current){
                result -=current;
            }else{
                result += current;
            }

        }      
    return result;
        }

        
    
     private int changeToNum(char roman){
              switch(roman){
                  case 'I' : return 1;
                  case 'V' : return 5;
                  case 'X' : return 10;
                  case 'L' : return 50;
                  case 'C' : return 100;
                  case 'D' : return 500;
                  case 'M' : return 1000;
            }

            return -1;
    }

}
