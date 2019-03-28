package math;

public class Count1InBinaryInteger {

    public static void main(String[] args) {
        System.out.println(new Count1InBinaryInteger().hammingWeight(111111));
    }

    public static int hammingWeight(int n) {
        System.out.println(Integer.toBinaryString(n));
        String binary =Integer.toBinaryString(n);

        int total = 0;
        return count(binary, total);
    }

    private static int count(String n, int total) {

        if(n.length()>=1) {
            total = total + Integer.parseInt(n.substring(0,1));
            return count(n.substring(1), total);
        }
        return total;

    }
}