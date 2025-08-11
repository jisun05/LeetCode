import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c); // 여는 괄호는 push
            } else { // 닫는 괄호
                if (st.isEmpty()) return false; // 짝이 없음
                char open = st.pop();
                if (!matches(open, c)) return false; // 짝 불일치
            }
        }
        return st.isEmpty(); // 모두 짝이 맞으면 스택 비어있음
    }

    private boolean matches(char open, char close) {
        return (open == '(' && close == ')')
            || (open == '{' && close == '}')
            || (open == '[' && close == ']');
    }
}
