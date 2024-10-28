package ru.fil.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.GenericApplicationContextExtensionsKt;

// ДАННЫЙ КЛАСС ПО СВОЕМУ ФУНКЦИОНАЛУ ПОЛНОСТЬЮ СОВПАДАЕТ С XML - КОНФИГУРАЦИЕЙ С ПРОШЛЫХ УРОКОВ

@Configuration
//@ComponentScan("ru.fil.springcourse")                       // вместо <context:component-scan base-package="ru.fil.springcourse"/>
@PropertySource("classpath:musicPlayer.properties")         // вместо <context:property-placeholder location="classpath:musicPlayer.properties"/>
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(classicalMusic(), rockMusic());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }

}
