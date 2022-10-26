import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (i == n - 1) {
                System.out.println(arr[sc.nextInt()]);
            }
        }
    }
}
/*
На вход подаётся натуральное число n > 0, на следующей строке - последовательность целых чисел,
а затем - индекс id < n. Создайте из неё массив и выведите на печать значение элемента массива c индексом id.
 */
