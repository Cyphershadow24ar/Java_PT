
import java.util.*;
public class OopsMain {
    public static void main(String[] args){
        /*
        OOPS - Object Oriented Programming System
        
        Class and Object is Used for ?
        Refernces and Address

        PPA ? 
        Professional programming langugae 

        Pillars of OOPS
        1. Inhertiritance 
        2. polymorphism 
        3. Encapsulation 
        4. Abstraction 
        
        Class name -> Pascal case -> Every word starting letter must be uppercase
        
        method name -> camel case -> Every word starting letter must be uppercase except first word

        Constant value -> All letters must be Uppercase

        Reference variable name -> Every word starting letter must be uppercase, except first word(Only meanigful names.)

        Boolean Variable name -> Should starts with is or has. Eg: isSwapped, hasNext

        construcutor 
        instant variable 
        static variable 
        global variable 
        this key word
        super key word
        */

        AppForm s1 = new AppForm();
        s1.name = "Ani";
        System.out.println(s1.name);

        AppForm s2 = new AppForm();
        s2.name = "Raj";
        System.out.println(s2.name);

        // Calling method
        s1.greet();
        s2.greet();

        AppForm s3 = new AppForm();
        AppForm s4 = new AppForm(15);
        AppForm s5 = new AppForm("Ani");
        AppForm s6 = new AppForm(15, "Ani");
        AppForm s7 = new AppForm("Ani", 15);

        // printing to verify
        s4.greet();
        s5.greet();
        s6.greet();
        s7.greet();
    }
}

// Separate class
class AppForm {
    String name;
    int age;

    void greet() {
        System.out.println("Hello " + name + " | Age: " + age);
    }

    AppForm() {
        System.out.println("Default constructor called");
    }

    AppForm(int age) {
        this.age = age;
        System.out.println("Constructor called | Age = " + age);
    }

    AppForm(String name) {
        this.name = name;
        System.out.println("Constructor called | Name = " + name);
    }

    AppForm(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("Constructor called | Name = " + name + ", Age = " + age);
    }

    AppForm(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor called | Name = " + name + ", Age = " + age);
    }
}
