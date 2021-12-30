package linearProgram;

public class Task4 {
    public static void main(String[] args) {
        /* 4.Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
         Поменять местами дробную и целую части числа и вывести полученное значение числа.
        */

        double R = 123.789; //R=nnn.ddd
        double nnn = (int) R; // nnn=123
        double ddd = (int) ((R - nnn) * 1000); //ddd=789
        double result = ddd + (nnn / 1000);//result=ddd.nnn
        System.out.println("Полученное значение числа = " + result);
    }
}
