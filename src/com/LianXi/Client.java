package com.LianXi;

public class Client {
    public static void main(String[] args) {
        /*Cat c = new Cat();
        Dog d = new Dog();
        Person p = new Person();

        p.feedCat(c);
        p.feedDog(d);*/
        Cat c = new Cat();
        Animal ani = new Cat();
        Animal ani1 = new Dog();
        Animal ani2 = new DaXiang();

        /*Person p = new Person();
        p.feed(ani);
        p.feed(ani1);
        p.feed(ani2);*/
        Cat cc =(Cat) ani;
        cc.Mouse();
    }
}
