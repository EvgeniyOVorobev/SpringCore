package com.ev;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component

public class MusicPlayer {
    @Autowired
    @Qualifier("classicalMusic")
    private Music music;
    @Value("${musicPlayer.value}")
    private int value;

    public void playMusic() {
        System.out.println(music.getSong());
    }
    public void getValue(){
        System.out.println(value);
    }

}
