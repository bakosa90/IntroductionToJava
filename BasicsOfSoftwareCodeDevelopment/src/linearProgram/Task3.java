package linearProgram;

public class Task3 {
    public static void main(String[] args) {
        /* 3.Вычислить значение выражения по формуле (все переменные принимают действительные значения):
        ((𝑠𝑖𝑛𝑥+𝑐𝑜𝑠𝑦)/(𝑐𝑜𝑠𝑥−𝑠𝑖𝑛𝑦))∗𝑡𝑔 𝑥𝑦
        */

        double x = 0.5;
        double y = 0.7;
        double result;
        result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
        System.out.println("Значение выражения = " + result);
    }
}
