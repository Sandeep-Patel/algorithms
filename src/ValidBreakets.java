import java.util.*;

/**
 Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 An input string is valid if:

 Open brackets must be closed by the same type of brackets.
 Open brackets must be closed in the correct order.
 Note that an empty string is also considered valid.

 Example 1:

 Input: "()"
 Output: true
 Example 2:

 Input: "()[]{}"
 Output: true
 Example 3:

 Input: "(]"
 Output: false
 Example 4:

 Input: "([)]"
 Output: false
 Example 5:

 Input: "{[]}"
 Output: true

 Prev
 1 / 3

 Next



 1
 class Solution {
 2
 public boolean isValid(String s) {
 3
 Stack
 4
 }
 5
 }
 Console

 Run Code

 Submit
 */
class ValidBreakets {

    public static void main(String[] args) {

        boolean res = new ValidBreakets().isValid("]");
        System.out.println("Output: " + res);

    }

    public boolean isValid(String s) {
        Map<Character, Character> matchingCharMap = new HashMap<>();
        matchingCharMap.put('}', '{');
        matchingCharMap.put(']', '[');
        matchingCharMap.put(')', '(');
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for(char character: chars) {
            if(matchingCharMap.get(character) == null) {
                stack.push(character);
            } else if(!stack.empty() && stack.peek() == matchingCharMap.get(character)) {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.empty();
    }
}