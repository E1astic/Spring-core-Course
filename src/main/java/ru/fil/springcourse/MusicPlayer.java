package ru.fil.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    // пока что создали 2 поля по-отдельности, потому что при передаче в параметр единственного поля типа Music,
    // имея при этом 2 бина ClassicalMusic и RockMusic, Spring бы не понял, какой из этих двух бинов передавать на место поля типа Music

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic(){
        return"Playing: " + classicalMusic.getSong()+
        "\nPlaying: " + rockMusic.getSong()+"\n";
    }


}
