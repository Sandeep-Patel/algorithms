package math;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public static void main(String[] args) {
        List<String> res = new Solution().fizzBuzz(17);
        for(String s: res) {
            System.out.println(s);
        }
    }
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            if(i%3==0) {
                stringBuilder.append("Fizz");
            }
            if(i%5==0) {
                stringBuilder.append("Buzz");
            }

            if(stringBuilder.toString().isEmpty()) {
                stringBuilder.append(i);
            }

            result.add(stringBuilder.toString());
        }

        return result;
    }
}