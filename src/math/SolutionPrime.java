package math;

import java.util.Arrays;

class SolutionPrime {

    public static void main(String[] args) {
        int res = new SolutionPrime().listPrime(170000);
        System.out.println("Total primes == " + res);
    }

    public int listPrime(int n) {
        boolean[] exist = new boolean[n];
        Arrays.fill(exist, true);
        for (int i = 2; i < n; i++) {
            if (exist[i]) {
                int idx = i;
                for (int j = 2; idx * j < n; j++) {
                    exist[idx*j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (exist[i]) {
                count++;
            }
        }
        return count;
    }

    private boolean isPrime(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        System.out.println(num);
        return true;
    }
}