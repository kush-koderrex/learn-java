package com.company;

import java.util.Locale;

public class kush_code_string_meth {
    public static void main(String[] args) {
        String  name ="Kuush";
        System.out.println(name.length());
        System.out.println(name.toLowerCase(Locale.ROOT));
        System.out.println(name.toUpperCase(Locale.ROOT));
        System.out.println(name.trim());
        System.out.println(name.substring(0,4));
        System.out.println(name.replace("u","p"));
        System.out.println(name.indexOf("u",2));

    }
}
