package com.driver;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        RWOnly rowonly = new RWOnly("Sreethar");

        //  System.out.print(rowonly.name);
        //  Name has private access in RWOnly

        rowonly.setName("vijay");

        String nam = rowonly.getName();
        System.out.println(nam);
    }

}