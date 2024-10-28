package ru.fil.springcourse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;



public class ClassicalMusic implements Music{

    @Override
    public String getSong() {
        return "Playing: classical music";
    }
}
