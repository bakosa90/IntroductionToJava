package cycles;

public class Task6 {
    public static void main(String[] args) {
        //6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

        for (int number = 0; number < Character.MAX_VALUE; number++) {
            System.out.println("Числу=" + number + " соответствует символ=" + (char) number);
        }
    }
}
