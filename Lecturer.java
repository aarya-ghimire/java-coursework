/**
 * 23049142 (Aarya Ghimire)
 * 
 * @version (1.2)
 */
public class Lecturer extends Teacher {
    // declaring the attributes with access modifier as private
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;

    // creating a constructor that accepts parameters
    public Lecturer(int teacherId, String teacherName, String address, String workingType, String employmentStatus,
            int workingHours, String department, int yearsOfExperience) {
        // calling the parent class constructor eith five parameters
        super(teacherId, teacherName, address, workingType, employmentStatus);
        // setting the working hour using setter method from super class
        super.setWorkingHour(workingHours);
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.gradedScore = 0;
        this.hasGraded = false;
    }

    // creating accessor method for each attributes
    public String getDepartment() {
        return department;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public int getGradedScore() {
        return gradedScore;
    }

    public boolean getHasGraded() {
        return hasGraded;
    }

    // creating a mutator method for gradedScore
    public void setGradedScore(int newGradedScore) {
        this.gradedScore = newGradedScore;
    }

    // creating a method to grade assignments
    public void gradeAssignment(int gradedScore, String department, int yearsOfExperience) {
        if (yearsOfExperience >= 5 && department.equals(department)) {
            if (gradedScore >= 70) {
                System.out.println("The assignment score is A");
            } else if (gradedScore >= 60) {
                System.out.println("The assignment score is B");
            } else if (gradedScore >= 50) {
                System.out.println("The assignment score is C");
            } else if (gradedScore >= 40) {
                System.out.println("The assignment score is D");
            } else if (gradedScore < 40) {
                System.out.println("The assignment score is E");
            }
            // setting has graded as true as specified by question
            this.gradedScore = gradedScore;
            hasGraded = true;
        } else {
            System.out.println("The assignment has not been graded yet");
        }
    }

    // creating a method to display the details of Lecture
    public void display() {
        // calling displayTeacher method from super class
        super.display();
        System.out.println("The department of lecturer is " + department);
        System.out.println("The year of experience of lecturer is " + yearsOfExperience);

        if (hasGraded) {
            System.out.println("The graded score is " + hasGraded);
        } else {
            System.out.println("The score has not been graded yet");
        }
    }
}