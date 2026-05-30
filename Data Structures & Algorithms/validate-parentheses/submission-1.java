class Solution {
    public boolean isValid(String s) {
    Stack<Integer> stack = new Stack<>();

            for (char c : s.toCharArray()) {
                        if (c == '(') stack.push(0);
                                    if (c == '[') stack.push(1);
                                                if (c == '{') stack.push(2);
                                                            
                                                                        if (c == ')') {
                                                                                        if (stack.isEmpty() || stack.peek() != 0) {
                                                                                                            return false;
                                                                                                                            }
                                                                                                                                            stack.pop(); // Safely pop after peek verification
                                                                                                                                                        }
                                                                                                                                                                    if (c == ']') {
                                                                                                                                                                                    if (stack.isEmpty() || stack.peek() != 1) {
                                                                                                                                                                                                        return false;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        stack.pop();
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                if (c == '}') {
                                                                                                                                                                                                                                                                                if (stack.isEmpty() || stack.peek() != 2) {
                                                                                                                                                                                                                                                                                                    return false;
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                    stack.pop();
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                                                                        return stack.isEmpty();
       
    }
}
