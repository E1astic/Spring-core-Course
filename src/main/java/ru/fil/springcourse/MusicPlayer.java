package ru.fil.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private Music music;
    private List<Music> musicList=new ArrayList<Music>();
    private String name;
    private int volume;

    // IoC - инверсия управления (внедряем зависимости)
    public MusicPlayer(Music music) {
        this.music=music;
    }

    @Autowired
    public MusicPlayer(List<Music> musicList) {
        this.musicList=musicList;
    }

    public MusicPlayer() {
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusic(Music music) {
        this.music=music;
    }

    public void playMusic(){
        System.out.println("Playing: "+music.getSong());
    }


    public void playAllMusic(){
        for(Music music:musicList){
            System.out.println("Playing: "+music.getSong());
        }
    }
}
