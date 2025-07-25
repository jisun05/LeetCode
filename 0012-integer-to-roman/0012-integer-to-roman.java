class Solution {
    public String intToRoman(int num) {


            int[] numeral ={1,4,5,9,10,40,50,90,100,400,500,900,1000};

            String[] symbol ={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
            StringBuilder sb = new StringBuilder();
            for(int i=numeral.length-1; i>=0;i--){

                while(num >= numeral[i]){
                    num = num - numeral[i];
                    sb.append(symbol[i]);

                }
            }
        return sb.toString();
    }
}