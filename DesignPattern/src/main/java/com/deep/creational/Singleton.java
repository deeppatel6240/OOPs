package com.deep.creational;

class SingletonObj {

    private static SingletonObj INSTANCE = new SingletonObj();

    private SingletonObj() {}

    public static SingletonObj getInstance() {
        return INSTANCE;
    }

    public void print() {
        System.out.println("It's Singleton Class");
    }

}

public class Singleton {

    public static void main(String[] args) {
        SingletonObj singletonObj = SingletonObj.getInstance();
        singletonObj.print();
        System.out.println(singletonObj);

        SingletonObj singletonObj1 = SingletonObj.getInstance();
        singletonObj1.print();
        System.out.println(singletonObj1);
    }

}
