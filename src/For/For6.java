package For;

import java.util.Scanner;
class For6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        if (a == 1) {
            System.out.print("false");
        } else {
            for (int i = 1; i <= a; i++) {
                int n1 = a % i;
                if (n1 == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print("true");
            } else {
                System.out.println("false");
            }
        }

    }
}
    //На вход подаётся натуральное число n. Определите, является ли это число простым.
    //Выведите true, если число n - простое, и false - если нет.
