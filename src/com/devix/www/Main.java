package com.devix.www;

public class Main {

    public static void main(String[] args) {

        String value = "1000";
        int result = Integer.parseInt(value);
        System.out.println(result);
        System.out.println(result + 1);

        int result2 = Integer.parseUnsignedInt(value);
        System.out.println(result2);
        System.out.println(result2 + 2);
    }
}
