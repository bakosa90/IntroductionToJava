package branching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        /*3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
        Определить, будут ли они расположены на одной прямой.
        */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите координату х1 точки А: ");
        int x1 = Integer.parseInt(reader.readLine());
        System.out.print("Введите координату у1 точки А: ");
        int y1 = Integer.parseInt(reader.readLine());
        System.out.print("Введите координату х2 точки В: ");
        int x2 = Integer.parseInt(reader.readLine());
        System.out.print("Введите координату у2 точки В: ");
        int y2 = Integer.parseInt(reader.readLine());
        System.out.print("Введите координату х3 точки С: ");
        int x3 = Integer.parseInt(reader.readLine());
        System.out.print("Введите координату у3 точки С: ");
        int y3 = Integer.parseInt(reader.readLine());

        //условие, при котором 3 точки лежат на одной прямой:
        //(y3-y1) / (y2-y1) = (x3-x1) / (x2-x1)

        int res1 = (y3 - y1) / (y2 - y1);
        int res2 = (x3 - x1) / (x2 - x1);
        if (res1 == res2) {
            System.out.println("Три точки лежат на одной прямой");
        } else {
            System.out.println("Три точки НЕ лежат на одной прямой");
        }
    }
}
