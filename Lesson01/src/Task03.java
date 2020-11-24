
/* Задание 3:
Напишите программу, которая вычислит простые числа в пределах от 2 до 100
 */

public class Task03 {
    public static void main(String[] args) {

        for (int i = 2; i < 101; i++){
            for (int k = 2; k < i; k++){
                if (i % k == 0) break;
                if (k == i -1) System.out.println(i);
            }

        }
    }
}
