package linearProgram;

public class Task5 {
    public static void main(String[] args) {
        /*5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
        Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
        */

        int T = 123456; // время в секундах
        int secInHour = 3600; //секунд в 1 часу
        int secInMinute = 60; //секунд в 1 минуте
        int HH = T / secInHour; //полученное количество часов
        int MM = (T - (HH * secInHour)) / secInMinute; //полученное количество минут
        int SS = T - (HH * secInHour) - (MM * secInMinute); //полученное количество секунд
        System.out.println("Время: " + HH + "ч" + " " + MM + "мин" + " " + SS + "c");
    }
}
