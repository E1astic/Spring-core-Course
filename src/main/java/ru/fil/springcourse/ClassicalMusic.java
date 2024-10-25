package ru.fil.springcourse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class ClassicalMusic implements Music{

    @PostConstruct    // выполняется сразу после инициализации бина
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    @PreDestroy     // выполняется перед удалением бина
    public void DoMyDestroy(){
        System.out.println("Doing my distruction");
    }

    @Override
    public String getSong() {
        return "Playing: classical music";
    }
}
