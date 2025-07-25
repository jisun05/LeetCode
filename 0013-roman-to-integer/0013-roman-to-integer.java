class Solution {
    public int romanToInt(String s) {
        

        int result = romanToInteger(s.charAt(s.length()-1));
        //"III"
                               // 2
        for(int i = 0; i < s.length()-1;i++){
            if(romanToInteger(s.charAt(i)) < romanToInteger(s.charAt(i+1))){
                result -= romanToInteger(s.charAt(i));
            }else{
                result += romanToInteger(s.charAt(i)) ;
            }

        }
        
        return result;   
    }


    private int romanToInteger(char c){
        switch(c){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;    
            case 'D' : return 500;
            case 'M' : return 1000;
           // default : return -1;
        }

        return -1;
    }


}