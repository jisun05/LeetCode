class Solution {
    public boolean validPalindrome(String s) {

        int first =0;
        int last =s.length() -1;
        boolean result = false;
        //첫번째랑 마지막이랑 같은지 확인해야함
        //ex) acba   
        //ex2) kbfgyvaap (1번을 빨리 풀수있게하면 2번 케이스의 경우는 너무 느려지지 않을까?)
    //새로운 배열이 필요?
        while(first < last){
            if(s.charAt(first) != s.charAt(last)){
                return isPalindrome(s,first,last-1) || isPalindrome(s,first+1,last);

                           
            }else{
                first++;
                last--;
            }
        
        }
        return true;
       
    }


 private boolean isPalindrome(String s, int first, int last){

    while(first < last){
    if(s.charAt(first) != s.charAt(last)){
            return false;
    }else{
       first++;
       last--;
    }
       
 }
 return true;
}

}