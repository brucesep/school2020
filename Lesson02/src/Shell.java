/*На самостоятельную проработку:
        Реализовать программу консольную оболочку Shell
        1) Программа предоставляет набор команд. Команды вводятся с консоли. time, date, exit.
        2) Каждая команда реализуется классом имплементирующим интерфейс Command.
        3) Интерфейс должен описывать методы для получения имени и исполнения команды.

        4) Для чтения с консоли пользуемся классом Scanner:
        Scanner in = new Scanner(System.in);
        •	nextLine(): считывает всю введенную строку

        5) Для работы с датой/временем исследуем класс LocalDateTime:
        https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html

        6) Интерфейс Command может определять вызов двух методов:
        getName() – возвращает имя команды.
        execute()  - выполнение команды.
        На старте в программе инициализируется массив с набором команд, которые может исполнять программа Shell. */


import java.util.Scanner;

public class Shell {

    static Command command;

    public static void main(String[] args) {

        Command[] commandList = {new CommandTime(), new CommandDate(), new CommandExit()};
        String executeCom;
        int count = 0;

        while (true) {
            boolean isExecute = false;
            executeCom = enterCommand();
            for (Command command : commandList) {
                if ((command.getName()).equals(executeCom.toLowerCase())) {
                    executing(command);
                    isExecute = true;
                }
            }
            count++; //добавил т.к. IDEA ругалась на бесконечный цикл
            if (count == 3) {
                System.out.println("Слишком много неверных команд! Выполнение программы завершено!");
                break;
            }
            if (!isExecute) System.out.println("Введите команду из списка!");
        }
    }

    public static void executing(Command command) {
        System.out.println("Имя команды: " + command.getName());
        command.execute();
    }

    public static String enterCommand() {
        System.out.println("Введите команду (time, date, exit):");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
