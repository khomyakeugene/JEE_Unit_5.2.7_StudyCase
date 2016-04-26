package com.company.tasks;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by Yevhen on 25.04.2016.
 */
@Aspect
public class LogAspect {

    @Before("execution ( * Executor.addTask(Task)) && args(task))")
    public void onExecute(Task task) throws Throwable {
        System.out.println("LogAspect: Before execution of: " + task.toString());
    }
}
