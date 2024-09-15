package oops;

public class oopsBasic {

    public static void main(String args[]){

        // this how we create a object of a class 
        Pen p1 = new Pen("red");
        p1 = new Pen();
        System.out.println(p1.color);

        // and this how we set properties for a object 
        p1.setColor("Blue");
        p1.setTip(5);
        p1.setCompany("leci");

        p1.color = "yellow";  // we can also set the value to the property like this 


        // this how we call copy constructor
        Pen p2 = new Pen(p1);
        p2.setCompany("renolds");

        // and this how we call the properties of a object of a class 
        System.out.println(p1.color);
        System.out.println(p1.tip);




        BankAccount myAcc = new BankAccount();
        myAcc.userName = "AdityaMohite";
        myAcc.setPassword("asdfjkl"); // we can not access password , we can only change it by the function coz password is private 

    }
    
}



// this is how write class
class  Pen {

    Pen(){   // this is non parameterized constuctor , if we dont create this system will create it aoutomatically , but if want to create a parameterized constructor we have to create it by ourselves
        System.out.println("constructor is called...");
    }

    // this is parameterized constructor 
    Pen(String color){
        this.color = color;   // here this.color points out color from the below and color form right side of the equal sign points out the color form the parameter 

    }

    // shallow copy constructor 
    // Pen(Pen p1){
    //     this.color = "blue";
    //     this.tip = 5;
    // }


    // deep copy constructor :- study this carefully
    Pen(Pen p1){
        this.color = "blue";
        this.tip = 5;
    }



    String color;
    int tip;
    String company;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }

    void setCompany(String newCompany){
        company = newCompany;
    }
    
}


// if we have make the objects private then for accessing them outside the class we have to write "get" functions to access outside the class  

class BankAccount {

    BankAccount(){  // this is constructor

    }

    public String userName;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }

    public String getPassword(){
        return this.password;   // "this" is the keyword which points out the current element , "this" keyword is used for private objects
    }

}