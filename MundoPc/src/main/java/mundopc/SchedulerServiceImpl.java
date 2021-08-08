/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundopc;

import jakarta.annotation.PostConstruct;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.TriggerContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author octavio
 */
@EnableScheduling
@Configuration
public class SchedulerServiceImpl implements SchedulingConfigurer , SchedulerService{

    @Autowired
    private ScheduledFuture<?> future;

     @Autowired
    private TaskScheduler scheduler;

    @Bean
    public SchedulerController schedulerBean() {
        return new SchedulerController();
    }

    @Bean(destroyMethod = "shutdown")
    public Executor taskExecutor() {
        return Executors.newScheduledThreadPool(100);
    } 

    @Override
    public void start() {
        future = scheduler.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("  Hello World! " + new Date());
                schedulerBean().schedulerJob();
            }
        }, new Trigger() {
            @Override public Date nextExecutionTime(TriggerContext triggerContext) {
                Calendar nextExecutionTime =  new GregorianCalendar();
                Date lastActualExecutionTime = triggerContext.lastActualExecutionTime(); 
                nextExecutionTime.setTime(convertExpresssiontoDate());//you can get the value from wherever you want
                return nextExecutionTime.getTime();
            }

            
            private Date convertExpresssiontoDate() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

    }


    @Override
    public void stop() {
        future.cancel(true);

    }

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        // TODO Auto-generated method stub
        start();
    }

}