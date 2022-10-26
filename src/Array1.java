import java.util.Scanner;
class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i+1;
            System.out.print(arr[i] + " ");
        }
    }
}
/*
На вход подаётся натуральное число n.
Создайте массив натуральных чисел от единицы до n включительно и выведите его на печать
(в одной строке, через пробел).
 */