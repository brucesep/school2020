import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
