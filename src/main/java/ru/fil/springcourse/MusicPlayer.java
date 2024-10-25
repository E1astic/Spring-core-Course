package ru.fil.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    @Autowired
    private ClassicalMusic classicalMusic;
    @Autowired
    private RockMusic rockMusic;


    public String playMusic(MusicType musicType) {
        String res=null;
        if(musicType==MusicType.CLASSICAL) {
            Random random=new Random();
            int randIndex=random.nextInt(classicalMusic.getSongsLength());

            res="Playing: "+classicalMusic.getSong(randIndex);
        }
        else{
            Random random=new Random();
            int randIndex=random.nextInt(rockMusic.getSongsLength());

            res="Playing: "+rockMusic.getSong(randIndex);
        }

        return res;
    }


}
