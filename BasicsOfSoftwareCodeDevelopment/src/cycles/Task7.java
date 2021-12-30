package cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {
    public static void main(String[] args) throws IOException {
        /*7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
        m и n вводятся с клавиатуры.
        */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите значение m= ");
        int m = Integer.parseInt(bufferedReader.readLine());
        System.out.print("Введите значение n= ");
        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = m; i <= n; i++) {
            System.out.print("Для числа= " + i + "-делители= ");
            int count = 0; //считаем количество делителей
            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                    count++; // увеличиваем количество делителей на 1
                }
            }
            if (count == 0) {
                System.out.println("отсутствуют");
            }
        }
    }
}
