package com.abhishek.myapplication.npe;

public class NpeJava {
    public int function(String b) {
        int length;
        if (b != null) {
            length = b.length();
        } else {
            length = -1;
        }

        return length;
    }

    public int function2(String b) {
        return b != null ? b.length() : -1;
        //     b?.length ?: -1

    }

    public void function3(String b) {
        int length;
        if (b != null) {
            length = b.length();
        } else {
            throw new IllegalArgumentException("Argument is Illegal");
        }

        System.out.println(length);
    }
}


