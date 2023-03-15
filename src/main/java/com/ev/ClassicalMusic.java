package com.ev;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class ClassicalMusic implements Music{
    private ClassicalMusic(){

    }
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
    public String getSong() {
        return "Hungarian Rhapsody";
    }
    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("doing my distraction");
    }
}
