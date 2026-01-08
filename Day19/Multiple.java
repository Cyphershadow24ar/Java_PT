package Day19;

// Multiple Inheritance
public class Multiple {
    public static void main(String[] args) {

        WorkingStudent ws = new WorkingStudent();

        ws.setStudent(15, 8.6);
        ws.setEmployee(12345, 59000);
        ws.display();
    }
}

/* ========== STUDENT INTERFACE ========== */
interface StudentDetails {
    void setStudent(int rollNo, double cgpa);
    void showStudent();
}

/* ========== EMPLOYEE INTERFACE ========== */
interface EmployeeDetails {
    void setEmployee(int empNo, int salary);
    void showEmployee();
}

/* ========== IMPLEMENTING MULTIPLE INTERFACES ========== */
class WorkingStudent implements StudentDetails, EmployeeDetails {

    private int rollNo;
    private double cgpa;
    private int empNo;
    private int salary;

    @Override
    public void setStudent(int rollNo, double cgpa) {
        this.rollNo = rollNo;
        this.cgpa = cgpa;
    }

    @Override
    public void showStudent() {
        System.out.println("ROLL NO : " + rollNo);
        System.out.println("CGPA    : " + cgpa);
    }

    @Override
    public void setEmployee(int empNo, int salary) {
        this.empNo = empNo;
        this.salary = salary;
    }

    @Override
    public void showEmployee() {
        System.out.println("EMP NO  : " + empNo);
        System.out.println("SALARY  : " + salary);
    }

    void display() {
        showStudent();
        showEmployee();
        System.out.println();
    }
}
