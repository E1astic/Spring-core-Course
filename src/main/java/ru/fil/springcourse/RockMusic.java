package ru.fil.springcourse;

public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Rock music song";
    }

    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destroy");
    }
}
