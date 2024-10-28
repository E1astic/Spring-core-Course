package ru.fil.springcourse;


import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        // теперь по-другому загружаем конфигурацию - java-код
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);

        try {
            MusicPlayer player =context.getBean("musicPlayer", MusicPlayer.class);
            System.out.println(player.getName());
            System.out.println(player.getVolume());

            ClassicalMusic classicalMusic=context.getBean("classicalMusic", ClassicalMusic.class);
        }
        catch(NoSuchBeanDefinitionException e) {
            System.out.println("Bean not found");
        }

        System.out.println("\nApplication context is closed");
        context.close();  // закрываем Application Context
    }
}
