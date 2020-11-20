import java.math.BigInteger;
import java.util.Scanner;

/* Задание 4:
Выведите на экран первые n членов последовательности Фибоначчи, где n запрашивается у  пользователя посредством консоли (2 < n < 100).
 */

public class Task04 {
    public static void main(String[] args) {


        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите целое число больше 2 и меньше 100");
        int a = in1.nextInt();

        BigInteger[] fibbonachi = new BigInteger[a]; // пришлось использовать BigInteger, т.к. ближе к сотому числу лонгов не хватает
        fibbonachi[0] = BigInteger.valueOf(0);
        fibbonachi[1] = BigInteger.valueOf(1);
        System.out.println(fibbonachi[0]);
        System.out.println(fibbonachi[1]);

        for (int i = 2; i < a; i++){
            fibbonachi[i] = fibbonachi[i-2].add(fibbonachi[i-1]);
            System.out.println(fibbonachi[i]);
        }
        in1.close();
    }
}
