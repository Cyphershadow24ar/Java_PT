import java.util.*;


public class Maini {
    public static void main(String[] args) {
        AppForm s1 = new AppForm("Ani", 22);
        AppForm s2 = new AppForm("Ram", 21);
        //s1.setName("Raj");
        //s1.setAge(15);
        // s1.display();
        // s2.display();
        System.out.println("Count: " + AppForm.count);
    }

    static class AppForm {
        private String name;
        private int age;
        static int count ;

        AppForm(String name, int age) {
            if (!name.equals(""))
                this.name = name;

            if (age > 0)
                this.age = age;

            count++;
        }

        void setName(String name) {
            if (!name.equals(""))
                this.name = name;
        }

        void setAge(int age) {
            if (age > 0)
                this.age = age;
        }

        String getName() {
            return this.name;
        }

        int getAge() {
            return this.age;
        }

        void display() {
            System.out.println("Name: " + this.name + " | Age: " + this.age);
            System.out.println("Name: " + getName());
            System.out.println("Age: " + getAge());
        }
    }

    // application class  code

}
