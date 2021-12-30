package branching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws IOException {
        //5.Вычислить значение функции F(x), если х<=3, F(x)=(x2-3x+9), если x>3, F(x)=1/(x3+6)

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите значение x: ");
        double x = Double.parseDouble(reader.readLine());

        double result;
        if (x <= 3) {
            result = Math.pow(x, 2) - 3 * x + 9;
        } else {
            result = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.println("Значение функции равно F(x)= " + result);
    }
}
