package org.design_patterns.creational_patterns.singleton;

public class Singleton {
    private static volatile Singleton instance;
    private String data;

    private Singleton(String data) {
        this.data = data;
    }

    private Singleton() {

    }

    public static Singleton getInstanceWithParameter(final String data) {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton(data);
                }
            }
        }
        return instance;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void printWithParameter(String data) {
        System.out.println(data);
    }

    public void print() {
        System.out.println("Hello Singleton");
    }

}
