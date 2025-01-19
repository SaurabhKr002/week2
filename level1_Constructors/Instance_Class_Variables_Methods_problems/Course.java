class Course {
    // Instance variables
    private String courseName;
    private int duration; // Duration in weeks
    private double fee;

    // Class variable
    private static String instituteName = "ABC Institute";

    // Default Constructor
    public Course() {
        this("Unknown Course", 0, 0.0);
    }

    // Parameterized Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Getters
    public String getCourseName() {
        return courseName;
    }

    public int getDuration() {
        return duration;
    }

    public double getFee() {
        return fee;
    }

    public static String getInstituteName() {
        return instituteName;
    }

    // Setters
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: INR " + fee);
    }

    // Class method to update institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        // Default Constructor
        Course defaultCourse = new Course();
        System.out.println("Default Course:");
        defaultCourse.displayCourseDetails();

        // Parameterized Constructor
        Course paramCourse = new Course("Java Programming", 12, 15000.0);
        System.out.println("\nParameterized Course:");
        paramCourse.displayCourseDetails();

        // Updating the institute name
        Course.updateInstituteName("XYZ Academy");
        System.out.println("\nUpdated Institute Name:");

        // Displaying course details again after updating institute name
        defaultCourse.displayCourseDetails();
        paramCourse.displayCourseDetails();
    }
}
