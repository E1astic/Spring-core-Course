package ru.fil.springcourse;


import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        // считываем содержимое файла и добавляем его в Spring Application Context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        try {
            MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
            System.out.println("link on player1:  "+player);

            MusicPlayer player2 = context.getBean("musicPlayer", MusicPlayer.class);
            System.out.println("link on player2:  "+player2);

            player2.setVolume(100);
            System.out.println(player.getVolume());
            System.out.println(player2.getVolume());
        }
        catch(NoSuchBeanDefinitionException e) {
            System.out.println("Bean not found");
        }

        System.out.println("\nApplication context is closed");
        context.close();  // закрываем Application Context
    }
}
