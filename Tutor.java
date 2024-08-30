/**
 * 23049142 (Aarya Ghimire)
 * 
 * @version (1.3)
 */
public class Tutor extends Teacher {
    // declaring the attributes with access modifier as private
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;

    // creating a constructor
    public Tutor(int teacherId, String teacherName, String address, String workingType, String employmentStatus,
            int workingHours, double salary, String specialization, String academicQualifications,
            int performanceIndex) {
        // calling the parent class constructor eith five parameters
        super(teacherId, teacherName, address, workingType, employmentStatus);
        // setting the working hour using setter method from super class
        super.setWorkingHour(workingHours);
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified = false;
    }

    // creationg accessor method for these attributes
    public double getSalary() {
        return salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getAcademicQualification() {
        return academicQualifications;
    }

    public int getPerformanceIndex() {
        return performanceIndex;
    }

    public boolean getIsCertified() {
        return isCertified;
    }

    // creating a method to setSalary based on the given condition
    public void setSalary(double newSalary, int newPerformanceIndex) {
        if (newPerformanceIndex > 5 && super.getWorkingHour() > 20) {
            if (newPerformanceIndex >= 5 && newPerformanceIndex <= 7) {
                this.salary = newSalary + (5 / 100f) * salary;
            } else if (newPerformanceIndex >= 8 && newPerformanceIndex <= 9) {
                this.salary = newSalary + (10 / 100f) * salary;
            } else if (newPerformanceIndex == 10) {
                this.salary = newSalary + (20 / 100f) * salary;
            }
            // setting isCertified as true as suggested in question
            this.isCertified = true;
            System.out.println("The salary is increased successfully");
            System.out.println("The new salary is " + newSalary);
        } else {
            System.out.println("Salary cannot be approved as the condition is not met");
        }
    }

    // creating a method to remove tutor
    public void removeTutor() {
        if (!isCertified) {
            this.salary = 0;
            this.specialization = "";
            this.academicQualifications = "";
            this.performanceIndex = 0;
            this.isCertified = false;

            System.out.println("The tutor has been removed secessfully");
        } else {
            System.out.println("Since the tutor is certified so s/he cannot be removed");
        }
    }

    // creating a display method to display the details
    public void display() {
        super.display();
        if (isCertified) {
            System.out.println("The salary is " + salary);
            System.out.println("The specialization is " + specialization);
            System.out.println("The academic qualification is " + academicQualifications);
            System.out.println("The performance index is " + performanceIndex);
        }
    }
}