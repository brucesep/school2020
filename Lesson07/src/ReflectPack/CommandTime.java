package ReflectPack;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CommandTime implements Command {

    static final String name = "time";
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void execute() {
        System.out.println("Текущее вермя: " + new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
    }
}
