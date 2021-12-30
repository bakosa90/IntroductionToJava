package branching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        //2. Найти max{min(a, b), min(c, d)

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число а: ");
        int a = Integer.parseInt(reader.readLine());
        System.out.print("Введите число b: ");
        int b = Integer.parseInt(reader.readLine());
        System.out.print("Введите число c: ");
        int c = Integer.parseInt(reader.readLine());
        System.out.print("Введите число d: ");
        int d = Integer.parseInt(reader.readLine());

        int result = Math.max((Math.min(a, b)), (Math.min(c, d)));
        System.out.println("Результат = " + result);
    }
}
