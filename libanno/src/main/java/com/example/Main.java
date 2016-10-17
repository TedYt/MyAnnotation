package com.example;

public class Main {

    public static void main(String[] args){
        UserCaseTracker.trackerUserCase(Main.class);
    }

    /**
     * 注释里的参数与自定义注解User里的方法是对应的，
     * 例如,下面用到了id和name，那自定义注解User里就有id和name两个方法
     * 如果想加一个sex，就要在User里增加一个sex的方法
     */

    @User(id = 34)
    public void getPeople(){}

    @User(id = 45, name = "Jack")
    public void one(){}

    @User(id = 23,name = "Two")
    public void two(){}

}
