package com.vladarsenjtev;

public class Main {

    public static void main(String[] args) {
        Human clid = new Human("Vlad","Arsenjtev", "Igorovich");

        System.out.println(clid.getFullName());
        System.out.println(clid.getShortName());
    }
}