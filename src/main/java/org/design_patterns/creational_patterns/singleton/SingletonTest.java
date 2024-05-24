package org.design_patterns.creational_patterns.singleton;

public class SingletonTest {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstanceWithParameter("s2");
        Singleton s3 = Singleton.getInstanceWithParameter("s3");

        boolean areStringsEqual;

        areStringsEqual = s1 == s2;
        System.out.println("s1 == s2 -> " + areStringsEqual);

        areStringsEqual = s1 == s3;
        System.out.println("s1 == s3 -> " + areStringsEqual);

        areStringsEqual = s2 == s3;
        System.out.println("s2 == s3 -> " + areStringsEqual);


        System.out.println(s1);
        s1.print();

        System.out.println(s2);
        s2.printWithParameter("Hello");

        System.out.println(s3);
        s3.print();

    }
}
