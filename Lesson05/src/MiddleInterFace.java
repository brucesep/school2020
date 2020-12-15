import java.util.ArrayList;
import java.util.Collection;

public interface MiddleInterFace <T extends Comparable<T>>{

    T findIt(Collection<T> someList, String toFind);
    T countIt(Collection<T> someList);
}

abstract class FinderClient<T extends Comparable<T>> implements MiddleInterFace<T> {

    static String searching = null;
    static int min = 0, max = 0;

    public static void findIt(ArrayList<ClientId> someList, String toFind) {
        for (int i = 0; i < someList.size(); i++) {
            if (someList.get(i).getName().equals(toFind)) {
                System.out.println("Client detected! " + someList.get(i));
            }
        }
    }

    public static void countIt(ArrayList<Billing> someList) {
        for (int i = 0; i < someList.size(); i++) {
            for (int j = 0; j < (someList.size() - 1); j++) {
                min = someList.get(i).getSumma();
                if (someList.get(j + 1).getSumma() > min) {
                    max = someList.get(j + 1).getSumma();
                    searching = someList.get(j + 1).getClientId().getName();
                }
            }
        }
        System.out.println("Max billing: " + searching + " - " + max);
    }
}

