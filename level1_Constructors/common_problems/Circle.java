class Circle {
    double radius;

    // Default Constructor
    Circle() {
        this(1.0); // Constructor chaining to set default radius
    }

    // Parameterized Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to display the radius
    void display() {
        System.out.println("Radius of the circle: " + radius);
    }

    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        Circle parameterizedCircle = new Circle(5.5);

        defaultCircle.display();
        parameterizedCircle.display();
    }
}
