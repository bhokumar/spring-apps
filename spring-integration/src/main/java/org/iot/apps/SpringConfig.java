package org.iot.apps;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackageClasses= {SpringConfig.class})
@PropertySource("classpath:application.properties")
public class SpringConfig {
}
