class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            
            if (bracket == '}' && !stack.isEmpty()) {
                if (stack.pop() != '{') {
                    return false;
                }
            }

            else if (bracket == ']' && !stack.isEmpty()) {
                if (stack.pop() != '[') {
                    return false;
                }
            }

            else if (bracket == ')' && !stack.isEmpty()) {
                if (stack.pop() != '(') {
                    return false;
                }
            }

            else {
                stack.push(bracket);
            }
        }

        if (stack.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
}
