package linearProgram;

public class Task2 {
    public static void main(String[] args) {
        /*2.Вычислить значение выражения по формуле (все переменные принимают действительные значения):
         (𝑏+√𝑏2+4𝑎𝑐)/2𝑎−𝑎3𝑐+𝑏−2
        */

        double a = 2.2;
        double b = 3.1;
        double c = 4.4;
        double result;
        result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("Значение выражения = " + result);
    }
}
