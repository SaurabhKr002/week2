package multilevelinheritance.educationalcoursehierarchy;

//Represents a paid online course that extends OnlineCourse.
class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount; // Discount percentage

    //Parameterized constructor to initialize paid online course details.
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    //Displays details specific to the paid online course.
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Course Fee: INR " + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee After Discount: INR " + calculateFinalFee());
    }

    //Calculates the final fee after applying the discount.
    private double calculateFinalFee() {
        return fee - (fee * discount / 100);
    }
}
