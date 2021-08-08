/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundopc;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import org.springframework.scheduling.TaskScheduler;

/**
 *
 * @author octavio
 */
public class SchedulerController {

    public SchedulerController() {
        
    }
    
    public void schedulerJob(){
        
        this.addTaskToScheduler(
            1, 
            () -> System.out.println("my task is running -> 1")
            , Date.from(
                    LocalDateTime.now().plusSeconds(10).atZone(ZoneId.systemDefault()).toInstant()
                )
            );
    
    }
    
    TaskScheduler scheduler;

    // A map for keeping scheduled tasks
    Map<Integer, ScheduledFuture<?>> jobsMap = new HashMap<>();

    public SchedulerController(TaskScheduler scheduler) {
        this.scheduler = scheduler;
    }
    
    public void addTaskToScheduler(int id, Runnable task, Date runningDate) {
        ScheduledFuture<?> scheduledTask = scheduler.schedule(task, runningDate);
        jobsMap.put(id, scheduledTask);
    }

    void schedulerJob(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
