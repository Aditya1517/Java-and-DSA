package oops;

public class StaticKeyWord {

    public static void main(String args[]){
        Student s1 = new Student();
        s1.schoolName = "VIT";

        Student s2 = new Student();
        System.out.println(s2.schoolName);  // It will print "VIT" because schoolName is a static variable
    }
    
}

class Student {
    String name;
    int rollNo;

    static String schoolName;   // Declaring as static

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}
