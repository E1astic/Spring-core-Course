package ru.fil.springcourse;


import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        // считываем содержимое файла и добавляем его в Spring Application Context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        try {
            // При создании одинаковых singleton-бинов методы init-method и destroy-method вызываются только 1 раз
            // Причем init-method выполняется, даже если мы не вызываем getBean()
            ClassicalMusic classicalMusic=context.getBean("classicalMusicBean", ClassicalMusic.class);
            ClassicalMusic classicalMusic2=context.getBean("classicalMusicBean", ClassicalMusic.class);


            // При создании одинаковых prototype-бинов метод init-method вызывается каждый раз, а destroy-method не вызывается вообще
            // init-method вызывается только при вызове getBean()
            RockMusic rockMusic=context.getBean("rockMusicBean", RockMusic.class);
            RockMusic rockMusic2=context.getBean("rockMusicBean", RockMusic.class);
        }
        catch(NoSuchBeanDefinitionException e) {
            System.out.println("Bean not found");
        }

        System.out.println("\nApplication context is closed");
        context.close();  // закрываем Application Context
    }
}
