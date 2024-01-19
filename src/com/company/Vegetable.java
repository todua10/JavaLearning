package com.company;

abstract class Vegetable{
    public String name;
    public final void cultivate(){}
    public abstract void harvest();
}

class Potato extends Vegetable{
    @Override
    public void harvest(){}

    public void debug(){}
}