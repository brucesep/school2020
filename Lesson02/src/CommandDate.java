import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CommandDate implements Command {

    String name;
   // Date date;

    public CommandDate(String name){
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
    public  void execute() {
        //date = new Date();
       // System.out.println("Текущее время: " + date.getHours() + " : " + date.getMinutes() + " : " + date.getSeconds());
        System.out.println("Текущая дата: " + new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime()));
            }
}
