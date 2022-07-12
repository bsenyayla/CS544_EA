package app.lab12;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimerTask;


//TimerTask
public class HelloWorldTask extends TimerTask {

    @Override
    public void run() {
        Date date = Calendar.getInstance().getTime();
        DateFormat timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT);String currenttime = timeFormatter.format(date);
        System.out.println("[TimerTask] This task runs at "+currenttime);
    }

}
