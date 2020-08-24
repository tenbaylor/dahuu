package com.gobest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author baylorten
 */
@Configuration
@ComponentScan("com.gobest.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
