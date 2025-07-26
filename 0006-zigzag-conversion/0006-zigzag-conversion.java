class Solution {
    public String convert(String s, int numRows) {

        if(s.length() <= numRows || s.length() ==1 || numRows ==1) return s;

        StringBuilder[] rows = new StringBuilder[numRows];

        for(int i=0; i < numRows;i++){
            rows[i] = new StringBuilder();
        }

       boolean goDown = false;
       int currentRow = 0;
        //알맞게 배열

        for(int i=0; i <s.length(); i++){
            rows[currentRow].append(s.charAt(i));  
                                                   
          if(currentRow == numRows-1){
            goDown = false; 
           
          }else if(currentRow == 0){
             goDown = true;
          }      
          
          if(goDown){
            currentRow++;
          }else{
            currentRow--;
          }
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder sb : rows) {
        result.append(sb);
        }
        return result.toString();
        
    }
}