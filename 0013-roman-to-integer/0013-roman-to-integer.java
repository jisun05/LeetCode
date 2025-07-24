class Solution {
    public int romanToInt(String s) {

        int sum =0;  //50   55   
        //"LVIII"
        for(int i =0 ; i < s.length();i++){
            int change = changeToNum(s.charAt(i));
            
            if(i + 1 <s.length() && changeToNum(s.charAt(i)) < changeToNum(s.charAt(i+1))){
                sum -=changeToNum(s.charAt(i));
            }else{
                     sum += change;    
            }

        }

        return sum;
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
