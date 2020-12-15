package ReflectPack;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CommandDate implements Command {

    static final String name = "date";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public  void execute() {
        System.out.println("Текущая дата: " + new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime()));
            }
}
