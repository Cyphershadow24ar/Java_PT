public class InhertMain {
    public static void main(String[] args) {
        Human o1 = new Human();
        Student o2 = new Student();
        Student s1 = new Student();
        s1.show();

    }

    static class Human {
        Human() { // Constructor
            System.out.println("Human is invoked");
        }
    }

    static class Student extends Human {
        Student() {
            System.out.println("Student is invoked");
        }
    }
}

/*
public class Main
{
	public static void main(String[] args) {
		Employee s1 = new Employee("Sai", 18, 6754, 8.8, 11, 25000);
		s1.show();
		
		Employee s2 = new Employee("Sam", 12, 1234, 8.1, 12, 20000);
		s2.show();
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
        this.roll = roll;
        this.cgpa = cgpa;
    }
    
    void display() {
        super.display();
        System.out.println("ROLL NO : " + this.roll);
        System.out.println("CGPA : " + this.cgpa);
    }
}

class Employee extends Student{
    private int empno;
    private int salary;
    
    Employee(String name, int age, int roll, double cgpa, int empno, int salary) {
        super(name, age, roll, cgpa);
        this.empno = empno;
        this.salary = salary;
    }
    
    void display() {
        System.out.println("EMP NO : " + this.empno);
        System.out.println("SALARY : " + this.salary);
    }
    
    void show() {
        super.display();
        this.display();
        System.out.println();
    }
}












// Single Level Inheritance :
//     https://onlinegdb.com/ikTibdtM8













*/