import sun.applet.AppletResourceLoader;

import java.util.*;

public class ListBuilding {
    public static void main(String[] args) {

        int num = 5;

        List<Integer> testList = new ArrayList<>();
        testList.add(17);
        testList.add(18);
        testList.add(45);
        testList.add(93);
        testList.add(77);
        testList.add(63);
        testList.add(48);

        System.out.println("Первый список: " + testList); //лист до внесения изменений

        fullList(testList);  // добавляем в список элемент
        delList(testList, 3); // удаляем из списка элемент по индексу
        miltiInsert(testList, 4); //вставляем 4 одинаковых записи
        duplicateElem(testList, 2); // вставляем запись идентичную записи под номером 2
        System.out.println("После всех изменений: " + testList); // выводим на печать просто список с изменениями
        secondPrint(testList); // выводим на печать столбиком. Не пойму почему повторяются индексы
        System.out.println("--------------------------------");

        //Сортировка списка компаратором
        testList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer t1, Integer t2) {
                return t1 - t2;
            }
        });
        System.out.println("Сортировка компаратором: " + testList);

        //Заполянем дерево из списка
        TreeSet<Integer> testTree = new TreeSet<>(testList);
        System.out.println("Таким получилось дерево: " + testTree);

        //если я правильно понял задание, то считаю элементы больше какого-то значения
       int count = 0;
       for (Integer element : testTree){
           if (element > 45) count++;
       }
        System.out.println("Элементов больше 45: " + count);

       //Удаляю третий по счету элемент. Почему-то все другие способы не прошли.
       count = 0;
       int perem = 0;
       for (Integer elem : testTree ){
           count ++;
           if (count == 3){
               perem = elem;
               break;
           }
       }
       testTree.remove(perem);
        System.out.println("Удален третий элемент: " + testTree); //окончательное дерево
        System.out.println("--------------------------------");

        //Теперь создаём карту
        HashMap<Object, Collection > testMap = new HashMap<>();
        testMap.put("some key", testTree);
        testMap.put(123, testTree);
        System.out.println(testMap);  // и печатаем эту карту

    }


    public static void secondPrint(List list) {
        for (Object element : list) {
            System.out.println(element + " " + list.indexOf(element)); //не могу понять почему индексы повторяются
        }
    }

    public static void duplicateElem(List list, int num) {
        list.add(list.get(num));
    }

    public static void miltiInsert(List list, int num) {
        for (int i = 0; i < num; i++) {
            list.add(55);
        }
    }

    public static void fullList(List list) {
        list.add(91);
    }

    public static void delList(List list, int i) {
        list.remove(i);
    }
}
