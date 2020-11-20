import java.util.Scanner;

/* Задание 2:
В переменных a и b хранятся два натуральных числа. Напишите программу, выводящую на экран результат деления a на b с остатком.
Пример работы программы (a = 21, b = 8): « 21 / 8 = 2 и 5 в остатке »
 */

public class Task02 {
    public static void main(String[] args) {
        int a = 45;
        int b = 7;
        System.out.println(a + " / " + b + " = " + a/b + " и " + a%b + " в остатке");

        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите первое целое число");
        int c = in1.nextInt();
        System.out.println("Введите второе целое число");
        int d = in1.nextInt();

        System.out.println(c + " / " + d + " = " + c/d + " и " + c%d + " в остатке");

        in1.close();
    }
}
