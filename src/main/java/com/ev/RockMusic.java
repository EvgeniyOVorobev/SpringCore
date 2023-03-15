package com.ev;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    public String getSong() {
        return "Wind crises";
    }
}
