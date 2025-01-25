package multilevelinheritance.educationalcoursehierarchy;

//Represents an online course that extends the base class Course.
class OnlineCourse extends Course {
    private String platform; // e.g., Udemy, Coursera
    private boolean isRecorded;

    //Parameterized constructor
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Displays details specific to the online course.
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Is Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}
