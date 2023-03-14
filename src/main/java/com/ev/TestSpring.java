package com.ev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
       MusicPlayer music= context.getBean("musicPlayer", MusicPlayer.class) ;

        music.playMusic();
       context.close();
    }
}
