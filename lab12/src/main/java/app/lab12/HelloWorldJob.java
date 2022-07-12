package app.lab12;


import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

//Quartz cron scheduling example
public class HelloWorldJob implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        Date date = Calendar.getInstance().getTime();
        DateFormat timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT);String currenttime = timeFormatter.format(date);
        System.out.println("[Quartz Cron Scheduling] This task runs at "+currenttime);
    }
}
