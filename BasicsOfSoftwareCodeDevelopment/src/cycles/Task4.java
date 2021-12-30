package cycles;

public class Task4 {
    public static void main(String[] args) {
        //4. Составить программу нахождения произведения квадратов первых двухсот чисел

        int multiply = 1;
        for (int i = 1; i <= 200; i++) {
            multiply = (int) (multiply * Math.pow(i, 2));
        }
        System.out.println("Произведение квадратов первых двухсот чисел= " + multiply);
    }
}
