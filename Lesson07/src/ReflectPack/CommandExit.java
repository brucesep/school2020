package ReflectPack;

public class CommandExit implements Command {

    static final String name = "exit";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void execute() {
        System.out.println("Выполнение программы завершено!");
        System.exit(0);
    }
}
