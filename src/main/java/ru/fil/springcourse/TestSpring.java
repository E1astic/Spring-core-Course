package ru.fil.springcourse;


import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        // считываем содержимое файла и добавляем его в Spring Application Context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        try {
            Music classicalMusic = context.getBean("classicalMusicBean", Music.class);  // получили bean класса, реализующего интерфейс Music
            Music hipHopMusic = context.getBean("hipHopMusicBean", Music.class);

            MusicPlayer musicPlayer1 = new MusicPlayer(classicalMusic);  // внедряем зависимость
            MusicPlayer musicPlayer2 = new MusicPlayer(hipHopMusic);
            musicPlayer1.playMusic();
            musicPlayer2.playMusic();
        }
        catch(NoSuchBeanDefinitionException e) {
            System.out.println("Bean not found");
        }

        System.out.println("\nApplication context is closed");
        context.close();  // закрываем Application Context
    }
}
