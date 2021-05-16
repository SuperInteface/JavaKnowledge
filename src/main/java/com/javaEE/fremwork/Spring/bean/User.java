package com.javaEE.fremwork.Spring.bean;

public class User {

    // 名称
    private String name;
    // 性别
    private String sex;
    // 地址
    private String address;
    // 薪资
    private Double salary;

    public User() {
    }

    public User(String name, String sex, String address, Double salary) {
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
