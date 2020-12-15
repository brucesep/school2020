package ReflectPack;

import java.util.*;

public class ListBuilding {
    public static void main(String[] args) {

        List<Integer> testList = new ArrayList<>();
        fullList2(testList);
        System.out.println("Первый список: " + testList); //лист до внесения изменений
        editListMethod(testList); // поместил все операции с Листом в один метод

        //Заполянем дерево из списка
        TreeSet<Integer> testTree = new TreeSet<>(testList);
        System.out.println("Таким получилось дерево: " + testTree);

        workWithTree(testTree); //Cчитаю элементы больше какого-то значения

        deleteElem(testTree); //Удаляю третий по счету элемент итератором.

        //Теперь создаём карту
        ListBuilding firstClass = new ListBuilding();
        ListBuilding secondClass = new ListBuilding();

        Map<Object, Collection> testMap = new HashMap<>(); //Кладу в качестве Object экземпляры класса. Наверное я что-то неправильно понял, да? ))
        testMap.put(firstClass, testTree);
        testMap.put(secondClass, testList);
        System.out.println(testMap);  // и печатаем эту карту

//        testMap.put("some key", testTree);
//        testMap.put(123, testList);

        //Создаем вторую карту со средними значениями
        Map<Object, Integer> testMap2 = new ListBuilding().newMapTest(testMap);
        System.out.println("Вторая карта на основе первой (среднее арифметическое):");
        System.out.println(testMap2);
    }

    public static List fullList2(List testList) {
        testList.add(17);
        testList.add(18);
        testList.add(45);
        testList.add(93);
        testList.add(77);
        testList.add(63);
        testList.add(48);
        return testList;
    }

    public static void deleteElem(TreeSet tree) {
        int count = 0;
        for (Iterator<TreeSet> iterator = tree.iterator(); iterator.hasNext(); ) {
            count++;
            iterator.next();
            if (count == 3) {
                iterator.remove();
                break;
            }
        }
        System.out.println("Удален третий элемент: " + tree); //окончательное дерево
        System.out.println("--------------------------------");
    }

    public static void workWithTree(TreeSet<Integer> testTree) {
        int count = 0;
        for (Integer element : testTree) {
            if (element > 45) count++;
        }
        System.out.println("Элементов больше 45: " + count);
    }

    Map<Object, Integer> newMapTest(Map<Object, Collection> testMaps) {
        Map<Object, Integer> promMap = new HashMap<>();
        for (Map.Entry<Object, Collection> entry : testMaps.entrySet()) {
            Integer summ = 0, count = 0;
            for (Object element : entry.getValue()) {
                count++;
                summ = summ + (int) element;
            }
            promMap.put(entry.getKey(), summ / count);
        }
        return promMap;
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

    public static void editListMethod(List testList) {
        fullList(testList);  // добавляем в список элемент
        delList(testList, 3); // удаляем из списка элемент по индексу
        miltiInsert(testList, 4); //вставляем 4 одинаковых записи
        duplicateElem(testList, 2); // вставляем запись идентичную записи под номером 2
        System.out.println("После всех изменений: " + testList); // выводим на печать просто список с изменениями
        secondPrint(testList); // выводим на печать столбиком. Не пойму почему повторяются индексы
        System.out.println("--------------------------------");
        testList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer t1, Integer t2) {
                return t1.compareTo(t2);
                //return t1 - t2;
            }
        });
        System.out.println("Сортировка компаратором: " + testList);
    }
}
