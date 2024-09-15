package oops;

public class inheritance {

    public static void main(String args[]){

        // Fish f1 = new Fish();
        // f1.eat();

        // Dog d1 = new Dog();
        // d1.eat();
        // d1.breathes();
        // d1.legs = 4;
        // d1.breed = "lab";

        // Bird b1 = new Bird();
        // Cat c1 = new Cat();
        // Fish1 f1 = new Fish1();

        

    }
    
}


// base class :- this is single inheritance
class Animal{
    String color;
    void eat(){
       System.out.println("Eats");
    }
    void breathes(){
        System.out.println("breathes");
    }
}


// derived class
class Fish extends Animal {
    int fins;

    void swim(){
        System.out.println("Swims");
    }
}



// multi level inheritance

// this class extends animal class 
class Mammel extends Animal {
    int legs;
}

// this class extends Mammel class i.e this class contains all the methods and objects of mammel and animal class
// because mammel is extended form  animal
class Dog extends Mammel{
    String breed;
}


// hierachical inheritance
class Fish1 extends Animal {
    int talefin;
}

class Cat extends Animal {
    void walk (){
        System.out.println("Walks");
    }
}

class Bird extends Animal {
    void fly (){
        System.out.println("Flies");
    }
}