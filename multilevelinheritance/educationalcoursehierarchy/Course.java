package multilevelinheritance.educationalcoursehierarchy;

// The base class representing a generic course.

class Course {
    private String courseName;
    private int duration; // Duration in weeks

     // Default constructor.
    public Course() {}

    //Parameterized constructor
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    //Displays course details.
    public void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Duration: " + duration + " weeks");
    }
}
