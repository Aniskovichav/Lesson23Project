package by.itstep.aniskovich.java.lesson23.model;

public class PerfectNumber {
    public static boolean isPerfectNumber(int num) {
        if (num % 2 != 0) {
            return false;
        }

        int sum = 1;
        int n = num / 2;

        for (int i = 2; i <= n; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }

}
