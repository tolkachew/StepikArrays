package For;

import java.util.Scanner;

class For1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 6) System.out.print("Таких чисел нет");
        else for (int i = 6; i <= n; i += 6) System.out.print(i + " ");
    }
}

/*
На вход подаётся натуральное число n. Выведите на печать в одной строке через пробел все числа от 1 до n включительно,
которые одновременно без остатка делятся на 2 и на 3. Если таких чисел в диапазоне нет, выведите "Таких чисел нет".
 */