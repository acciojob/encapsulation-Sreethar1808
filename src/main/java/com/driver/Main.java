package com.driver;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        RWOnly rowonly = new RWOnly("Sreethar");

        //  System.out.print(rowonly.name);
        // Error: Cannot directly access private member 'name'

        rowonly.setName("vijay");

        String nam = rowonly.getName();

    }

}