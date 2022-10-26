package For;

import java.util.Scanner;

class For3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        int result = n % 10;
        while (n > 10) {
            if (n % 10 > result) {
                result = n % 10;
            }
            n /= 10;
        }
        System.out.println(result);
    }
}