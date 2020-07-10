package com.yx.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.yx.service","com.yx.dao"})
public class SpringConfig {

}
