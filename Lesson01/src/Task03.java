
/* Задание 3:
Напишите программу, которая вычислит простые числа в пределах от 2 до 100
 */

public class Task03 {
    public static void main(String[] args) {

        int count;

        for (int i = 2; i < 101; i++){
            count = 0;
            for (int k = 2; k < i; k++){
                if (i % k == 0) {
                    count++;
                    if (count > 0) break;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }
    }
}
