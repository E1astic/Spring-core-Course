package ru.fil.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    private String[] songs={"classical song number 1", "classical song number 2", "classical song number 3"};

    @Override
    public String getSong(int index) {
        return songs[index];
    }

    public int getSongsLength(){
        return songs.length;
    }


}
