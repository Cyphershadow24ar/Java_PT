package Day19;

public class RuntimePolymorphism {

    public static void main(String[] args) {

        // Runtime polymorphism
        Shape s;

        s = new Circle();     // Parent reference → Child object
        s.draw();

        s = new Rectangle();  // Parent reference → Another child object
        s.draw();
    }
}

class Shape {
    void draw() {
        System.out.println("Drawing any Shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}
