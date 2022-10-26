package For;

import java.util.Scanner;

class For4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = 0;
        for (int i = Math.min(x, y); i <= Math.max(x, y); i++) {
            if (i % 2 != 0) {
                if (z == 0) {
                    System.out.print(i);
                    z++;
                } else
                    System.out.print(" " + i);
            }
        }
    }
}