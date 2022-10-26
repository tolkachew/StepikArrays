import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (i == n - 1) {
                System.out.print(arr[i]);
            }
        }
    }
}
/*
На вход подаётся натуральное число n > 0 (длина массива),
а на следующей строке - последовательность целых чисел.
Создайте из неё массив и выведите на печать значение последнего элемента массива.
 */
