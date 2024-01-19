package com.company;

public class A {
    int f(int a) {
        return a+a;
    }
}

class B extends A {
    int f(int a) {
        return a*a;
    }
    int f(double a){
        return (int)a;
    }
}