package com.sap.mervyn.spring.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan
public class CDPlayerConfig {

    @Bean
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    @Bean(name = "player")
    public MediaPlayer getCDPlayer() {
        return new CDPlayer(sgtPeppers());
    }

}
