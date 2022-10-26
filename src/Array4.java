import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1) * 2;
            count += arr[i];
            System.out.print((i + 1) == arr.length ? arr[i] + "\n" : arr[i] + " ");
        }
        System.out.print(count);
    }
}

/*
На вход подаётся целое число n > 1. Сформируйте массив чётных чисел от 2 до n (включительно).
Выведите на печать массив в одной строке, через пробел.
Посчитайте и выведите на печать сумму элементов массива.
 */