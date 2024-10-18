package ru.fil.springcourse;

public class MusicPlayer {
    private Music music;

    // IoC - инверсия управления (внедряем зависимости)
    public MusicPlayer(Music music) {
        this.music=music;
    }

    public void playMusic(){
        System.out.println("Playing: "+music.getSong());
    }
}
