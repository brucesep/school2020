public class CommandExit implements Command {

    String name;

    public CommandExit(String name){
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public void execute() {
        System.out.println("Выполнение программы завершено!");
    }
}
