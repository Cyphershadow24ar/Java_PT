package Day19;
// Hierarchical Inheritance
public class Main2{
    public static void main(String[] args) {
		Student s1 = new Student("Sai", 18, 56432, 8.9);
		s1.show();
		
		Employee e1 = new Employee("Sam", 19, 113, 32000);
		e1.show();
	}
}

class Human {
    private String name;
    private int age;
    
    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void display() {
        System.out.println("NAME : " + this.name);
        System.out.println("AGE : " + this.age);
    }
}

class Student extends Human{
    private int roll;
    private double cgpa;
    
    Student(String name, int age, int roll, double cgpa) {
        super(name, age);
        this. roll = roll;
        this.cgpa = cgpa;
    }
    
    void display() {
        System.out.println("ROLL NO : " + this.roll);
        System.out.println("CGPA : " + this.cgpa);
    }
    
    void show() {
        super.display();
        this.display();
        System.out.println();
    }
}

class Employee extends Human{
    private int empNo;
    private int salary;
    
    Employee(String name, int age, int empNo, int salary) {
        super(name, age);
        this. empNo = empNo;
        this.salary = salary;
    }
    
    void display() {
        System.out.println("EMP NO : " + this.empNo);
        System.out.println("SALARY : " + this.salary);
    }
    
    void show() {
        super.display();
        this.display();
        System.out.println();
    }
}
