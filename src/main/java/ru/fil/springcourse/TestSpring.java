package ru.fil.springcourse;


import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        // считываем содержимое файла и добавляем его в Spring Application Context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        try {
            // двухэтапное внедрение зависимостей
            // (RockMusic, ClassicalMusic) -> MusicPlayer -> Computer
            Computer computer=context.getBean("computer", Computer.class);
            System.out.println(computer);
        }
        catch(NoSuchBeanDefinitionException e) {
            System.out.println("Bean not found");
        }

        System.out.println("\nApplication context is closed");
        context.close();  // закрываем Application Context
    }
}
