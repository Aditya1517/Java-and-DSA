package oops;

public class abstraction {
    
}


abstract class Animal {
    // as this abstract class we can not create object of this class 

    Animal(){
        // we can crate constructor in animla class , and always when we call the class , constructor of the parent class 1st 
        // sequence is 1st parent class then child class constructor is called 
    }

    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();   // this is abstract method and we can not define what is do , here this only gives idea meaing that we must define the method in child class and the method depends on each class 
}

class Horse extends Animal{
    void walk(){
        System.out.println("Walks");    // as this abstract method which is created above we have to define this method in child class
    }
}
