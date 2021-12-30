package cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        //2. Вычислить значения функции y на отрезке [а,b] c шагом h, при х>2, y=x, при х<=2, y=-x

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите начало отрезка а: ");
        int a = Integer.parseInt(reader.readLine());
        System.out.print("Введите конец отрезка b: ");
        int b = Integer.parseInt(reader.readLine());
        System.out.print("Введите шаг h: ");
        int h = Integer.parseInt(reader.readLine());

        int resultY; //результат функции у
        for (int x = a; x <= b; x = x + h) {
            if (x <= 2) {
                resultY = -x;
            } else {
                resultY = x;
            }
            System.out.println("Значение функции y при x= " + x + " равно= " + resultY);
        }
    }
}
