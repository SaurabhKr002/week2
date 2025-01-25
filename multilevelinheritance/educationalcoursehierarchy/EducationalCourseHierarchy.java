package multilevelinheritance.educationalcoursehierarchy;

//The main class to demonstrate the Educational Course Hierarchy.
public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        // Creating objects of different course types
        Course course = new Course("Introduction to Programming", 6);
        OnlineCourse onlineCourse = new OnlineCourse("Java Basics", 8, "Udemy", true);
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Advanced Java", 12, "Coursera", true, 20000, 20);

        // Display details for each course type
        System.out.println("----- Course Details -----");
        course.displayDetails();
        System.out.println();

        System.out.println("----- Online Course Details -----");
        onlineCourse.displayDetails();
        System.out.println();

        System.out.println("----- Paid Online Course Details -----");
        paidOnlineCourse.displayDetails();
        System.out.println();
    }
}
