package branching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        /*1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
         и если да, то будет ли он прямоугольным.
         */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первый угол треугольника в градусах: ");
        int angleOfTriangleA = Integer.parseInt(reader.readLine());
        System.out.print("Введите второй угол треугольника в градусах: ");
        int angleOfTriangleB = Integer.parseInt(reader.readLine());

        int angleOfTriangleC = 180 - (angleOfTriangleA + angleOfTriangleB); //третий угол треугольника в градусах
        System.out.println("Третий угол треугольника в градусах: " + angleOfTriangleC);

        if (angleOfTriangleC > 0) {
            System.out.println("Треугольник с заданными сторонами существует");
            if (angleOfTriangleA == 90 || angleOfTriangleB == 90 || angleOfTriangleC == 90) {
                System.out.println("Треугольник с заданными сторонами-прямоугольный");
            } else {
                System.out.println("Треугольник с заданными сторонами-НЕ прямоугольный");
            }
        } else {
            System.out.println("Треугольник с заданными сторонами НЕ существует");
        }
    }
}
