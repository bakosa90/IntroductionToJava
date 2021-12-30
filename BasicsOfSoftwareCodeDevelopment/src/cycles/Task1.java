package cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        /*1. Напишите программу, где пользователь вводит любое целое положительное число.
        А программа суммирует все числа от 1 до введенного пользователем числа.
        */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите любое целое положительное число: ");
        int n = Integer.parseInt(reader.readLine());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + i;
        }
        System.out.println("Сумма всех чисел= " + sum);
    }
}
