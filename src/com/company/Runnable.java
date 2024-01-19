package com.company;

interface Runnable{
    void run();
}

class MyClass1 implements Runnable{
    public boolean running;
    public void run(){}
    public void start(){}
    public void stop(){}
}

