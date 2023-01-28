// Old is gold question = Write a following classes, Animal is a base class, cat (derived class of animal), write a method eat() in animal class and override that method in the derived classes.

// java.lang is by deafult understand by the compiler
import java.lang.*;

public class runtimepolymorphism {
    

    public static void main(String[] args){
        Animal a = new Animal();
        Cat c = new Cat();
        Cow co = new Cow();

        a.eat();
        c.eat();
        co.eat();
    }

    
}

// it cannot be made public, if you want to make it public you have to make a seperate file for that!
class Animal{
    void eat(){
        System.out.println("Hi I am animal, I can eat.");
    }
}

class Cat extends Animal{
    void eat(){
        System.out.println("I am cat and I am also eat.");
    }
}

class Cow extends Animal{
    void eat(){
        System.out.println("I am cow and I am also eat.");
    }
}