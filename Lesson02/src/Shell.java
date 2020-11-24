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

        String[] commandList = {"date", "time", "exit"};

        String executeCom;

        while (true){
            executeCom = enterCommand();
            if (executeCom.equals(commandList[2])){
                command = new CommandExit(executeCom);
                executing();
                break;
            } else  if (executeCom.equals(commandList[0])){
                command = new CommandDate(executeCom);
                executing();
            }
             else if (executeCom.equals(commandList[1])){
                command = new CommandTime(executeCom);
                executing();
            }
            else{
                System.out.println("Введите команду из списка!");
            }
        }
    }

        public static void executing () {
            System.out.println("Имя команды: " + command.getName());
            command.execute();
        }

        public static String enterCommand() {
            System.out.println("Введите команду (time, date, exit):");
            Scanner scan = new Scanner(System.in);
            return scan.nextLine();
        }
    }
