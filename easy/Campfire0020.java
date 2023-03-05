import java.util.Stack;

public class Campfire0020 {

    /**
     * 20. 有效括号匹配
     * */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.add(s.charAt(i));
                continue;
            }

            char c1 = stack.peek();
            if (isCompare(c1, s.charAt(i))) {
                stack.pop();
            } else {
                stack.add(s.charAt(i));
            }

        }
        return stack.isEmpty();
    }

    public boolean isCompare(char c1, char c2) {
        if (c1 == '(' && c2 == ')') {
            return true;
        }
        if (c1 == '[' && c2 == ']') {
            return true;
        }
        if (c1 == '{' && c2 == '}') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Campfire0020 campfire0020 = new Campfire0020();

        System.out.println(campfire0020.isValid("()))(((()()()()())))))))))()"));
        System.out.println(campfire0020.isValid("[][((()))]{}"));
    }
}
