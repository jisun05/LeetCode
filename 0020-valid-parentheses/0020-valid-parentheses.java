class Solution {
    public boolean isValid(String s) {

        if(s == null || s.length()%2 !=0) return false;
        Deque<Character> deque = new ArrayDeque();

        //닫는 괄호는 체크후 pop

        for(char c: s.toCharArray()){
            //여는 괄호들은 집어넣기
            if(c == '(' || c == '{' || c =='['){
                deque.push(c);
            }else{
                if(deque.isEmpty()) return false;
                if(!check(deque.peek(),c)) return false;
                deque.pop();
            }
        }

        if(!deque.isEmpty()) return false;

        
        return true;
    }

    //맞는 괄호인지 확인
    public boolean check(char open, char close){
        if(open == '(' && close == ')') return true;
        if(open == '[' && close == ']') return true;
        if(open == '{' && close == '}') return true;
        return false;
    }
}