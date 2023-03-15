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
    private List<Music> musicList;

    @Autowired
    @Qualifier("classicalMusic")
    private Music music;
    @Autowired
    @Qualifier("rockMusic")
    private Music music1;
    @Autowired
    @Qualifier("rapMusic")
    private Music music2;
    @Value("${musicPlayer.value}")
    private int value;

    public void playMusic() {
        for (Music m:musicList
             ) {
            System.out.println(m.getSong());

        };
    }
    public void getValue(){
        System.out.println(value);
    }

}
