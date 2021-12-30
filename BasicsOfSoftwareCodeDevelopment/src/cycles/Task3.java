package cycles;

public class Task3 {
    public static void main(String[] args) {
        //3. Найти сумму квадратов первых ста чисел

        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = (int) (sum + Math.pow(i, 2));
        }
        System.out.println("Сумма квадратов первых ста чисел= " + sum);
    }
}
