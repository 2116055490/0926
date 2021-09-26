package com.company;

public class LiShiMin extends LiYuan{
    // 子类的方法必须和父类的方法完全一致
    public void makeCountry(){
        super.makeCountry(); // 可以调用父类中被重写的方法
        System.out.println("李世民想建立自己的国家");
    }
    public static void main(String[] args) {
        LiShiMin lsm = new LiShiMin();
        lsm.makeCountry();
    }

}
