package ru.fil.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class MusicPlayer {
    private Music music;

    // IoC - инверсия управления (внедряем зависимости)
    public MusicPlayer(Music music) {
        this.music=music;
    }


}
