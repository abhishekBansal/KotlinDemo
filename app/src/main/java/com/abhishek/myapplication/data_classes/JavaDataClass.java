package com.abhishek.myapplication.data_classes;

public class JavaDataClass   {
    private String name;
    private int age;
    private String address;
    private String fatherName;

    public JavaDataClass(String name, int age, String address, String fatherName) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.fatherName = fatherName;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;

    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
}














//
//public final class JavaDataClass   {
//    private final String name;
//    private final int age;
//    private final String address;
//    private final String fatherName;
//
//    public JavaDataClass(String name, int age, String address, String fatherName) {
//        this.name = name;
//        this.age = age;
//        this.address = address;
//        this.fatherName = fatherName;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public String getFatherName() {
//        return fatherName;
//    }
//}
//

