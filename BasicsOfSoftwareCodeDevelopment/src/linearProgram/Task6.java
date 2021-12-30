package linearProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {
    public static void main(String[] args) throws IOException {
        /* 6. Для данной области составить линейную программу, которая печатает true, если точка с
         координатами (х, у) принадлежит закрашенной области, и false — в противном случае.
        */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите координату точки х: ");
        int coordinateX = Integer.parseInt(reader.readLine());
        System.out.print("Введите координату точки y: ");
        int coordinateY = Integer.parseInt(reader.readLine());

        if ((coordinateX >= -4 && coordinateX <= 4 && coordinateY >= -3 && coordinateY <= 0) ||
                (coordinateX >= -2 && coordinateX <= 2 && coordinateY >= 0 && coordinateY <= 4)) {
            System.out.println("Принадлежит точка закрашенной области? - true");
        } else {
            System.out.println("Принадлежит точка закрашенной области? - false");
        }
    }
}
