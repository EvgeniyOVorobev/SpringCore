package com.ev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
//       MusicPlayer music= context.getBean("musicPlayer", MusicPlayer.class) ;
//       MusicPlayer musicPlayer=context.getBean("musicPlayer", MusicPlayer.class);
//       boolean comparison=musicPlayer==music;
//        System.out.println(comparison);
//        music.playMusic();
//        System.out.println(music.getName()+" "+music.getValue());
        ClassicalMusic classicalMusic=context.getBean("musicBean1", ClassicalMusic.class);
        ClassicalMusic classicalMusic1=context.getBean("musicBean1", ClassicalMusic.class);

       context.close();
    }
}
