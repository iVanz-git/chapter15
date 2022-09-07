package com.hsp.generic;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @Author iVan@admin
 * @Version
 * @Date 周二, 2022/9/6 17:57 GMT+0800
 */
public class GenericHomeWork01 {
    public static void main(String[] args) {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(new Employee("zack", 20000, new MyDate(2000, 5, 20)));
        employeeArrayList.add(new Employee("jack", 10000, new MyDate(2000, 5, 21)));
        employeeArrayList.add(new Employee("jack", 25000, new MyDate(1980, 3, 31)));

        employeeArrayList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1.getName() != e2.getName()) {
                    return e1.getName().compareTo(e2.getName());
                }
                return e1.getBirthday().toString().compareTo(e2.getBirthday().toString());
            }
        });


        System.out.println("==============================分割线==============================");



        System.out.println(employeeArrayList);

    }

}


class Employee {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday.toString() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }
}

//class MyDate implements Comparator{
class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        if (this.day < 10) {
            return "MyDate{" +
                    "year=" + year +
                    ", month=" + month +
                    ", day=0" + day +
                    '}';


        }
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

//
//    @Override
//    public int compare(Object o1, Object o2) {
//
//        return 0;
//    }
}