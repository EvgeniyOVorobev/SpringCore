package com.ev;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.ev")
@PropertySource("musicPlayer.properties")
public class MyConfig {
}
