package com.ev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
        MusicPlayer musicPlayer=context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.playMusic();
        musicPlayer.getValue();
       context.close();
    }
}
