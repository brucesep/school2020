
/* Задание 5:
Напишите программу, которая объявляет массив целых чисел (10-20 чисел)  и реализует алгоритм сортировки заданного массива (на ваш выбор).
 */

public class Task05 {
    public static void main(String[] args) {

        int[] massive = new int[20];
        for (int i = 0; i < 20; i++){
            massive[i] = (int) (Math.random() * 100);
            System.out.print(massive[i] + " ");
        }


        for (int g = 0; g < 19; g++){
            for (int j = 0; j < 19; j++){
                if (massive[j] > massive[j+1]){
                    int naim = massive[j+1];
                    int naib = massive[j];
                    massive[j] = naim;
                    massive[j+1] = naib;
                }
            }
        }


        System.out.println();
        for (int k = 0; k < 20; k++){
            System.out.print(massive[k] + " ");
        }

    }
}
