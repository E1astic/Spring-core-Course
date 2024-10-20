package ru.fil.springcourse;


import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        // считываем содержимое файла и добавляем его в Spring Application Context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        try {
            MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);

//            Под капотом:
//            MusicPlayer musicPlayer=new MusicPlayer();
//            Music music1=new ClassicalMusic();
//            Music music2=new RockMusic();
//            Music music3=new HipHopMusic();
//            List<Music> musicList=Arrays.asList(music1, music2, music3);
//            musicPlayer.setMusicList(musicList);
//

            player.playAllMusic();

        }
        catch(NoSuchBeanDefinitionException e) {
            System.out.println("Bean not found");
        }

        System.out.println("\nApplication context is closed");
        context.close();  // закрываем Application Context
    }
}
