package com.company;

public class Person extends Hero{
    String name = "孙猴子";

    public Person(){
        super("武大郎"); // 在子类构造方法的第一行 默认调用父类的构造方法
        System.out.println("我是子类构造方法");
    }
    public void eat(){
        // 直接查找父类
        System.out.println(super.name+"chi");
        // 先找自己类，再找父类
        System.out.println(this.name+"吃人参果");
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.eat();
    }
}
