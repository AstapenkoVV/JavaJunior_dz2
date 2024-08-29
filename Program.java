package ru.gb.dz.lesson2;

/*
    Используя Reflection API, напишите программу,
    которая выводит на экран все методы класса String.
 */

import java.lang.reflect.Method;

public class Program {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> str = Class.forName("java.lang.String");
        Method[] methods = str.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
