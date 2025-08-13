class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> s = new ArrayDeque<>();

        for(String t : tokens){
            if("+-*/".contains(t) && t.length() ==1){
                int b =s.pop();
                int a =s.pop();

                switch(t){
                    case "+": s.push(a+b); break;
                    case "-": s.push(a-b); break;
                    case "*": s.push(a*b); break;
                    case "/": s.push(a/b); break;
                }
            }else{
                s.push(Integer.parseInt(t));
            }
        }
        return s.pop();
        
    }
}