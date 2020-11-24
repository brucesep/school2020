import java.util.Scanner;

/* Задание 2:
В переменных a и b хранятся два натуральных числа. Напишите программу, выводящую на экран результат деления a на b с остатком.
Пример работы программы (a = 21, b = 8): « 21 / 8 = 2 и 5 в остатке »
 */

public class Task02 {
    public static void main(String[] args) {

        // Вариант 1: числап заданы:
        int a = 45;
        int b = 7;
        System.out.println("Вариант 1: числа задны в коде");
        printInfo(a, b);

        // Вариант 2: числа вводятся с консоли:
        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите первое целое число");
        int c = in1.nextInt();
        System.out.println("Введите второе целое число");
        int d = in1.nextInt();
        in1.close();
        System.out.println("Вариант 2: числа были введены через консоль");
        printInfo(c, d);

        // Вариант 3: числа задаются в параметрах запуска (хотя нам этого не объясняли :))
        // Исключения мы тоже пока не проходили.
        try {
            int e = Integer.parseInt(args[0]);
            int f = Integer.parseInt(args[1]);
            System.out.println("Вариант 3: числа задаются в параметрах запуска");
            printInfo(e, f);
        }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("В аргументах нет чисел :(");
            }
        }

        public static void printInfo(int number1, int number2){
            System.out.println(number1 + " / " + number2 + " = " + number1/number2 + " и " + number1%number2 + " в остатке");
        }
}
