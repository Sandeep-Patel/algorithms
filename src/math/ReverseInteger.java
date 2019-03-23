package math;


/**
 Given a 32-bit signed integer, reverse digits of an integer.

 Example 1:

 Input: 123
 Output: 321
 Example 2:

 Input: -123
 Output: -321
 Example 3:

 Input: 120
 Output: 21
 Note:
 Assume we are dealing with an environment w

 */

class ReverseInteger {

    public static void main(String[] args) {
        int n = 999999999;
        int res = new ReverseInteger().reverse(n);
        System.out.println("Output : " + res);

    }

    public int reverse(int x) {
        int num = Math.abs(x);
        int total = 0;
        boolean neg = x < 0;
        while (num > 0) {
            total = (int) (total + (num % 10) * Math.pow(10, (String.valueOf(num).length() - 1)));
            num = num / 10;
        }

        if(total>Integer.MAX_VALUE||total<Integer.MIN_VALUE) return 0;

        if (neg) {
            total = total - (total * 2);
        }
        return total;
    }
}