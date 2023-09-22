class ValidParentheses {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else if (stack.size() != 0 && stack.peek().equals('(') && s.charAt(i) == ')') {
                stack.pop();
            } else if (stack.size() != 0 && stack.peek().equals('{') && s.charAt(i) == '}') {
                stack.pop();
            } else if (stack.size() != 0 && stack.peek().equals('[') && s.charAt(i) == ']') {
                stack.pop();
            } else {
                return false;
            }
        }
        return (stack.size() == 0);
    }
}
