package cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws IOException {
        /*5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
        заданному е. Общий член ряда имеет вид an=1/2n+1/3n
        */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите n: ");
        int n = Integer.parseInt(reader.readLine());
        System.out.print("Введите е: ");
        double e = Double.parseDouble(reader.readLine());

        double sum = 0; //сумма членов ряда
        for (int i = 1; i <= n; i++) {
            double a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (Math.abs(a) >= e) {
                sum = sum + a;
            }
        }
        System.out.println("Сумма членов ряда = " + sum);
    }
}
