package ru.fil.springcourse;

public class Computer {
    private final int id;
    private MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer) {
        id=777;
        this.musicPlayer=musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", musicPlayer=" + musicPlayer.playMusic() +
                '}';
    }
}
