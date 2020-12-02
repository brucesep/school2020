import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {

        LList<Node> currentList = new LList<>();
        currentList.add(new Node("First Element"));
        currentList.add(new Node("Second Element"));
        currentList.add(new Node("Fird Element"));
        currentList.add(new Node("Forth Element"));
        currentList.add(new Node("Fiths Element"));

        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите номер элемента (1 - 5): ");
        int curr = in1.nextInt();
        in1.close();

        currentList.size();
        System.out.println("Последний элемент: " + currentList.findLast());
        System.out.println("Ваш элемент: " + currentList.getNum(curr-1));
    }


    static class Node {
        public Node(Object data) {
            this.data = data;
        }

        Object data;
        Node next;

        public boolean hasNext(){
            return next != null;
        }


        @Override
        public String toString(){
            return "" + data;
        }

    }

    static class LList<T> {
        private Node root;

        public void add(Object item) {
            Node tmpItem = new Node(item);
            Node lastItem = findLast();

            if (lastItem != null) {
                lastItem.next = tmpItem;
            } else {
                root = tmpItem;
            }
        }

        public Object getNum(int id) {
            Node currentNode = this.root;
            int i = 0;
            while (i < id && currentNode.hasNext()){
                currentNode = currentNode.next;
                i++;
            }
            return currentNode.data;
        }

        public int size() {
            int size = 0;
            if (root == null)
                return 0;
            else {
                size = 1;
                Node current = root;
                while (current.next != null) {
                    size++;
                    current = current.next;
                }
            }
            System.out.println("Размер списка: " + size);
            return size;
        }

        Node findLast() {
            if (root == null)
                return null;
            else {
                Node current = root;
                while (current.next != null) {
                    current = current.next;
                }
                return current;
            }
        }
    }
}
