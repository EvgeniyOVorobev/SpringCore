package com.ev;

public class ClassicalMusic implements Music{
    private ClassicalMusic(){

    }
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
    public String getSong() {
        return "Hungarian Rhapsody";
    }
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }
    public void doMyDestroy(){
        System.out.println("doing my distraction");
    }
}
