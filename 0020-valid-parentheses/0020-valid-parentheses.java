class Solution {
    public boolean isValid(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {

                if (st.isEmpty()) return false;
                
                char temp = st.peek();
               
                if ((ch == ')' && temp == '(') ||
                    (ch == '}' && temp == '{') ||
                    (ch == ']' && temp == '[')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}