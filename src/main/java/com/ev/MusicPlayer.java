package com.ev;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList=new ArrayList<Music>();
    private String name;
    private int value;

    public MusicPlayer() {
    }


    public void playMusic(){
        for (Music s:musicList
             ) {
            System.out.println(s.getSong());

        }
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
