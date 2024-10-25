package ru.fil.springcourse;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{

    private String[] songs={"rock song number 1", "rock song number 2", "rock song number 3"};

    @Override
    public String getSong(int index) {
        return songs[index];
    }

    public int getSongsLength(){
        return songs.length;
    }
}
