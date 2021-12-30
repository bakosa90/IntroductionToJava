package cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {
    public static void main(String[] args) throws IOException {
        //8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первое число: ");
        int numA = Integer.parseInt(bufferedReader.readLine());
        System.out.print("Введите второе число: ");
        int numB = Integer.parseInt(bufferedReader.readLine());

        char[] arrayA = String.valueOf(numA).toCharArray(); //переводим первое число numA в строку и затем в массив символов
        char[] arrayB = String.valueOf(numB).toCharArray();//переводим второе число numB в строку и затем в массив символов
        System.out.print("Цифры, входящие в запись как первого так и второго числа: ");
        for (char item : arrayA) {
            for (char value : arrayB) {
                if (item == value) {
                    System.out.print(item + " ");
                }
            }
        }
    }
}
