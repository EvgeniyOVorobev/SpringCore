package com.ev;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music {
    public String getSong() {
        return "Rap";
    }
}
