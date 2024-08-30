/**
 * 23049142 Aarya Ghimire
 * 
 * @version (1.1)
 */
public class Teacher {
    // declaring the attributes with access modifier as private given in question
    private int teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHours;

    // creating a constructor which accepts five parameters
    public Teacher(int teacherId, String teacherName, String address, String workingType, String employmentStatus) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
    }

    // creating accessor method of these attributes as specified by the question
    public int getTeacherId() {
        return teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getAddress() {
        return address;
    }

    public String getWorkingType() {
        return workingType;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public int getWorkingHour() {
        return workingHours;
    }

    // creating a mutator method to set the value of these attributes
    public void setWorkingHour(int newWorkingHour) {
        this.workingHours = newWorkingHour;
    }

    public void setEmploymentStatus(String newEmploymentStatus) {
        this.employmentStatus = newEmploymentStatus;
    }

    public void setWorkingType(String newWorkingType) {
        this.workingType = newWorkingType;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    public void setTeacherName(String newTeacherName) {
        this.teacherName = newTeacherName;
    }

    public void setTeacherId(int newTeacherId) {
        this.teacherId = newTeacherId;
    }

    // creating a method to display the information as suggested in question
    public void display() {
        System.out.println("The teacher ID is " + teacherId);
        System.out.println("The teacher name is " + teacherName);
        System.out.println("The teacher address is " + address);
        System.out.println("The teacher working type is " + workingType);
        System.out.println("The teacher employment status is " + employmentStatus);

        /*
         * by question if working hours is not assigned, we have to display a suitable
         * message
         * so i am defining a condition that if working hour is assigned by the user we
         * will display the input
         * but if working hour is not assigned we will display a suitable message
         */
        if (workingHours > 0) {
            System.out.println("The working hour is " + workingHours);
        } else {
            System.out.println("The working hour is not assigned");
        }
    }
}