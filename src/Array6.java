import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(",");
        for (String str : arr) {
            System.out.println(str);
        }
    }
}
/*
На вход подаётся строка из элементов, разделённых запятой.
Создайте из неё массив и выведите элементы массива каждый в отдельной строке.
*/