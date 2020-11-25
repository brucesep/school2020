import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CommandTime implements Command {

    String name;

    public CommandTime(String name) {
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        System.out.println("Текущее вермя: " + new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
    }
}
