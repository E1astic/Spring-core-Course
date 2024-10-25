package ru.fil.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    // МОЖЕМ ВНЕДРИТЬ ЗАВИСИМОСТИ ТАК - ЧЕРЕЗ ПОЛЯ,  В ЭТОМ СЛУЧАЕ ПИСАТЬ КОНСТРУКТОР НЕТ НЕОБХОДИМОСТИ
//    @Autowired
//    @Qualifier("classicalMusic")
//    private Music music1;                             В ЦЕЛОМ СУЩЕСТВУЕТ 3 ВАРИАНТА ВНЕДРЕНИЯ ЗАВИСИМОСТЕЙ
//                                                      ЧЕРЕЗ ПОЛЕ,  СЕТТЕР  ИЛИ  КОНСТРУКТОР
//    @Autowired
//    @Qualifier("rockMusic")
//    private Music music2;

    private Music music1;
    private Music music2;

    // А МОЖЕМ И ТАК
    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1=music1;
        this.music2=music2;
    }

    public String playMusic(){
        return"Playing: " + music1.getSong()+",  "+music2.getSong();
    }


}
