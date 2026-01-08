package Day19;

public class Main3 {
    public static void main(String[] args) {

        WorkingEmployee e1 =
                new WorkingEmployee("Sai", 18, 6754, 8.8, 11, 25000);
        e1.show();

        WorkingEmployee e2 =
                new WorkingEmployee("Sam", 12, 1234, 8.1, 12, 20000);
        e2.show();
    }
}

/* ================= PARENT CLASS ================= */
class Human {
    private String name;
    private int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("NAME : " + name);
        System.out.println("AGE  : " + age);
    }
}

/* ================= CHILD CLASS ================= */
class Student extends Human {
    private int roll;
    private double cgpa;

    Student(String name, int age, int roll, double cgpa) {
        super(name, age);
        this.roll = roll;
        this.cgpa = cgpa;
    }

    @Override
    void display() {
        super.display();
        System.out.println("ROLL NO : " + roll);
        System.out.println("CGPA    : " + cgpa);
    }
}

/* ================= GRANDCHILD CLASS ================= */
class WorkingEmployee extends Student {
    private int empNo;
    private int salary;

    WorkingEmployee(String name, int age, int roll, double cgpa,
                    int empNo, int salary) {
        super(name, age, roll, cgpa);
        this.empNo = empNo;
        this.salary = salary;
    }

    @Override
    void display() {
        super.display();
        System.out.println("EMP NO  : " + empNo);
        System.out.println("SALARY  : " + salary);
    }

    void show() {
        display();
        System.out.println();
    }
}
