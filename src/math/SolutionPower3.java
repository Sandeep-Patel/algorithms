package math;

/**
 * Given an integer, write a function to determine if it is a power of three.
 * <p>
 * Example 1:
 * <p>
 * Input: 27
 * Output: true
 * Example 2:
 * <p>
 * Input: 0
 * Output: false
 * Example 3:
 * <p>
 * Input: 9
 * Output: true
 * Example 4:
 * <p>
 * Input: 45
 * Output: false
 * <p>
 * <p>
 *
 *
 *     3,9,27,81...etc
 * Could you do it without using any loop / recursion?
 */
class SolutionPower3 {

    public static void main(String[] args) {
        int num = 45;
        boolean res = new SolutionPower3().isPowerOfThree(num);
        System.out.println("is "+ num +" power of 3? :  " + res);
    }

    public boolean isPowerOfThree(int n) {

        System.out.println(Math.log10(n));
        System.out.println(Math.log10(3));
        double r = Math.log10(n) / Math.log10(3);
        System.out.println(r);
        System.out.println(r%1);
        if(r % 1 == 0) {
            return true;
        }
        return false;
    }

}