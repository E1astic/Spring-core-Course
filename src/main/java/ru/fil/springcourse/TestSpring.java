package ru.fil.springcourse;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        // считываем содержимое файла и добавляем его в Spring Application Context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        TestBean testBean1 = context.getBean("testBean1", TestBean.class);
        TestBean testBean2 = context.getBean("testBean2", TestBean.class);

        System.out.println(testBean1.getName());
        System.out.println(testBean2.getName());

        context.close();  // закрываем Application Context
    }
}
