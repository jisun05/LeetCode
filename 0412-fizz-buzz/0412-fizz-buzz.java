class Solution {
    public List<String> fizzBuzz(int n) {

        List<String> answer = new ArrayList<>(n);
        

        for(int i=0;i<n;i++){
            int check = i+1;

            if(check%3 ==0 && check%5 ==0){
                answer.add("FizzBuzz");
            }else if(check%3 ==0){
                answer.add("Fizz");
            }else if(check%5 ==0){
                answer.add("Buzz");
            }else{
                answer.add(Integer.toString(check));
            }

        }
    





        return answer;

        
    }
}