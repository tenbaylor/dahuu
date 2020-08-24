package com.gobest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author baylorten
 */
@Configuration
@ComponentScan("com.gobest.schedule")
@EnableScheduling
public class TaskSchedulerConfig {

}
