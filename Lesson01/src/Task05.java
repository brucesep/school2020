
/* Задание 5:
Напишите программу, которая объявляет массив целых чисел (10-20 чисел)  и реализует алгоритм сортировки заданного массива (на ваш выбор).
 */

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {


        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int razM = in1.nextInt();
        in1.close();

        int[] massive = new int[razM];
        System.out.println("Массив до сортировки:");
        for (int i = 0; i < razM; i++) {
            massive[i] = (int) (Math.random() * 100);
            System.out.print(massive[i] + " ");
        }

        for (int g = 0; g < razM-1; g++) {
            for (int j = 0; j < razM-1; j++) {
                int minNumber = massive[j+1];
                int maxNumber = massive[j];
                if (maxNumber > minNumber) {
                    massive[j] = minNumber;
                    massive[j + 1] = maxNumber;
                }
            }
        }

        System.out.println();
        System.out.println("Массив после сортировки:");
        for (int k = 0; k < razM; k++) {
            System.out.print(massive[k] + " ");
        }

    }
}
