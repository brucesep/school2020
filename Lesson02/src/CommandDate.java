import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
