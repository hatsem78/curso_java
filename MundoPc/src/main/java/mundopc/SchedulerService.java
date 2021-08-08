package mundopc;

import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author octavio
 */
public interface SchedulerService {

    void start();
    void stop();

}
