package ru.fil.springcourse;

import org.springframework.stereotype.Component;

@Component  // по стандарту создает бин с id - названием класса с маленькой буквы
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Rock music song";
    }

}
