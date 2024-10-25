package ru.fil.springcourse;


import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        // считываем содержимое файла и добавляем его в Spring Application Context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        // ЗАДАНИЕ - ДЛЯ КАЖДОГО ТИПА МУЗЫКИ СОЗДАТЬ МАССИВ ИЗ 3 ПЕСЕН, СОЗДАТЬ ENUM С 2 ТИПАМИ МУЗЫКИ
        // В MusicPlayer ВНЕДРИТЬ 2 ЗАВИСИМОСТИ. МЕТОД playMusic() ДОЛЖЕН ПРИНИМАТЬ MusicType
        // И ИСХОДЯ ИЗ ПЕРЕДАННОГО ТИПА ПРОИГРЫВАТЬ РАНДОМНУЮ МУЗЫКУ ДАННОГО ТИПА

        try {
            MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
            System.out.println(player.playMusic(MusicType.ROCK));
        }
        catch(NoSuchBeanDefinitionException e) {
            System.out.println("Bean not found");
        }

        System.out.println("\nApplication context is closed");
        context.close();  // закрываем Application Context
    }
}
