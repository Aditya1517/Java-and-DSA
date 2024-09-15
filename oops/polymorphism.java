package oops;

public class polymorphism {

    public static void main(String args[]){
        // Calculator c1 = new Calculator();
        // System.out.println(c1.sum(3,5));
        // System.out.println(c1.sum((float)5.5,(float)6.6));
        // System.out.println(c1.sum(3,5,2));


        Deer d1 = new Deer();
        d1.eat();   // this will call the function from child class only

    }
    
}


// this is an example of functino overloading :- compile time polymorphism
class Calculator {
    int sum (int a,int b){
        return a+b;
    }

    float sum(float a,float b){
        return a+b;
    }

    int sum (int a,int b,int c){
        return a+b+c;
    }

}



// this is an example of method overriding :- runtime polymorphism
class Animal {
    void eat(){
        System.out.println("Eats");
    }
}

class Deer extends Animal {
    void eat(){
        System.out.println("Eats Grass");
    }
}