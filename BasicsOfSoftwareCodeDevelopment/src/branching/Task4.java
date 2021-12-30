package branching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws IOException {
        /*4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
        Определить, пройдет ли кирпич через отверстие.
        */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите размер прямоугольного отверстия A: ");
        int sideOfRectangleA = Integer.parseInt(reader.readLine());
        System.out.print("Введите размер прямоугольного отверстия B: ");
        int sideOfRectangleB = Integer.parseInt(reader.readLine());
        System.out.print("Введите размер кирпича х: ");
        int wightOfBrickX = Integer.parseInt(reader.readLine());
        System.out.print("Введите размер кирпича у: ");
        int heightOfBrickY = Integer.parseInt(reader.readLine());
        System.out.print("Введите размер кирпича z: ");
        int lengthOfBrickZ = Integer.parseInt(reader.readLine());

        if (sideOfRectangleA >= wightOfBrickX && (sideOfRectangleB >= heightOfBrickY || sideOfRectangleB >= lengthOfBrickZ)) {
            System.out.println("Кирпич пройдет через прямоугольное отверстие");
        } else if (sideOfRectangleA >= heightOfBrickY && (sideOfRectangleB >= wightOfBrickX || sideOfRectangleB >= lengthOfBrickZ)) {
            System.out.println("Кирпич пройдет через прямоугольное отверстие");
        } else if (sideOfRectangleA >= lengthOfBrickZ && (sideOfRectangleB >= heightOfBrickY || sideOfRectangleB >= wightOfBrickX)) {
            System.out.println("Кирпич пройдет через прямоугольное отверстие");
        } else {
            System.out.println("Кирпич НЕ пройдет через прямоугольное отверстие");
        }
    }
}
