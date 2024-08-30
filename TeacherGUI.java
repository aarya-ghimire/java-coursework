
/**
 * 23049142 Aarya Ghimire
 * 
 * @version (1.1)
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

public class TeacherGUI {

    // Declaring variable name for Jframe
    private JFrame frame;

    // Declaring variable name for JPanels
    private JPanel lecturerPanel, tutorPanel, gradeAssignmentPanel, setSalaryPanel, removeTutorPanel;

    // Declaring variable name for JLabels
    private JLabel teacherIDLBL, departmentLBL, yearsOfEXPLBL, gradeAssignmentLBL, lecturerLbl, tutorLbl,
            teacherIdLbl, setSalaryLBL, tIDLBL, tNAMELBL, addLBL, wTYPELBL, empSTATUSLBL, wHRSLBL, tIdSalaryLBL,
            newSalaryLBL, teacherNameLbl, performanceIdxLBL, addressLbl, removeTutorLBL, workingTypeLbl, tIdremoveLBL,
            employmentStatusLbl, workingHoursLbl, departmentLbl, yearsOfExperienceLbl, gradedScoreLbl, salaryLbl,
            specializationLbl, academicQualificationLbl, performanceIndexLbl;

    // Declaring variable name for JTextfields
    private JTextField teacherIdTxt, teacherIDTXT, departmentTXT, yearsOfEXPTXT, teacherNameTxt, addressTxt,
            workingTypeTxt, tIdSalaryTXT, tIDTXT, tNAMETXT, addTXT, wTYPETXT, empSTATUSTXT, wHRSTXT, newSalaryTXT,
            employmentStatusTxt, performanceIdxTXT, tIdremoveTXT, workingHoursTxt, departmentTxt, yearsOfExperienceTxt,
            gradedScoreTxt, salaryTxt, specializationTxt, academicQualificationTxt, performanceIndexTxt;

    // Declaring variable name for JButtons
    private JButton addLecturerBtn, addTutorBtn, gradeAssignmentBtn, setSalaryBtn, removeTutorBtn, displayLecturerBtn,
            displayTutorBtn, clearBtn;

    // Creating arraylist of Teacher class to store objects
    ArrayList<Teacher> teacherList = new ArrayList<>();

    public TeacherGUI() {

        // Creating main frame for the project
        frame = new JFrame("TeacherGUI");
        frame.setSize(1220, 620); // Giving ideal height and width for the GUI frame
        frame.setLayout(null); // Setting Layuot as null so that i can adjust them using setBounds() method
        frame.setResizable(false); // Setting resizeable as false which does not allow user to maximize the GUI
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLocationRelativeTo(null);// This will automatically set the GUI to the center of the screen

        // ---------------------------LECTURER PANEL STARTS-------------------------

        // Creating a separate panel for lecturer to add the attributes for Lecturer
        lecturerPanel = new JPanel();
        lecturerPanel.setBounds(10, 20, 300, 450);
        lecturerPanel.setLayout(null);
        frame.add(lecturerPanel);

        // Creating a "Lecturer" label to describe the panel as a Lecturer
        lecturerLbl = new JLabel("Lecturer");
        lecturerLbl.setBounds(100, 10, 100, 20);
        lecturerLbl.setFont(new Font("Arial", Font.BOLD, 18));
        lecturerPanel.add(lecturerLbl);

        // Creating a label for TeacherId and adding it to the Teacher panel
        teacherIdLbl = new JLabel("Teacher Id: ");
        teacherIdLbl.setBounds(40, 50, 100, 20);
        lecturerPanel.add(teacherIdLbl);

        // Creating a textfield for TeacherId and adding it to the Teacher panel
        teacherIdTxt = new JTextField();
        teacherIdTxt.setBounds(170, 50, 100, 20);
        lecturerPanel.add(teacherIdTxt);

        // Creating a label for Teacher Name and adding it to the Teacher panel
        teacherNameLbl = new JLabel("Teacher Name: ");
        teacherNameLbl.setBounds(40, 80, 100, 20);
        lecturerPanel.add(teacherNameLbl);

        // Creating a textfield for Teacher Name and adding it to the Teacher panel
        teacherNameTxt = new JTextField();
        teacherNameTxt.setBounds(170, 80, 100, 20);
        lecturerPanel.add(teacherNameTxt);

        // Creating a label for Address and adding it to the Teacher panel
        addressLbl = new JLabel("Address: ");
        addressLbl.setBounds(40, 110, 100, 20);
        lecturerPanel.add(addressLbl);

        // Creating a textfield for Address and adding it to the Teacher panel
        addressTxt = new JTextField();
        addressTxt.setBounds(170, 110, 100, 20);
        lecturerPanel.add(addressTxt);

        // Creating a label for Working Type and adding it to the Teacher panel
        workingTypeLbl = new JLabel("Working Type: ");
        workingTypeLbl.setBounds(40, 140, 100, 20);
        lecturerPanel.add(workingTypeLbl);

        // Creating a textfield for Working Type and adding it to the Teacher panel
        workingTypeTxt = new JTextField();
        workingTypeTxt.setBounds(170, 140, 100, 20);
        lecturerPanel.add(workingTypeTxt);

        // Creating a label for Employment Status and adding it to the Teacher panel
        employmentStatusLbl = new JLabel("Employment Status: ");
        employmentStatusLbl.setBounds(40, 170, 120, 20);
        lecturerPanel.add(employmentStatusLbl);

        // Creating a textfield for Employment Stauts and adding it to the Teacher
        // panel
        employmentStatusTxt = new JTextField();
        employmentStatusTxt.setBounds(170, 170, 100, 20);
        lecturerPanel.add(employmentStatusTxt);

        // Creating a label for Working Hours and adding it to the Teacher panel
        workingHoursLbl = new JLabel("Working Hours: ");
        workingHoursLbl.setBounds(40, 200, 100, 20);
        lecturerPanel.add(workingHoursLbl);

        // Creating a textfield for Working Hours and adding it to the Teacher panel
        workingHoursTxt = new JTextField();
        workingHoursTxt.setBounds(170, 200, 100, 20);
        lecturerPanel.add(workingHoursTxt);

        // Creating a label for Department and adding it to the lecturer panel
        departmentLbl = new JLabel("Department: ");
        departmentLbl.setBounds(40, 230, 100, 20);
        lecturerPanel.add(departmentLbl);

        // Creating a textfield for Department and adding it to the lecturer panel
        departmentTxt = new JTextField();
        departmentTxt.setBounds(170, 230, 100, 20);
        lecturerPanel.add(departmentTxt);

        // Creating a label for Years Of Experience and adding it to the lecturer panel
        yearsOfExperienceLbl = new JLabel("Years Of Experience: ");
        yearsOfExperienceLbl.setBounds(40, 260, 140, 20);
        lecturerPanel.add(yearsOfExperienceLbl);

        // Creating a textfield for Years Of Experience and adding it to the lecturer
        // panel
        yearsOfExperienceTxt = new JTextField();
        yearsOfExperienceTxt.setBounds(170, 260, 100, 20);
        lecturerPanel.add(yearsOfExperienceTxt);

        // Creating Add Lecturer Button and adding it on Lecturer Panel
        addLecturerBtn = new JButton("Add Lecturer");
        addLecturerBtn.setBounds(80, 290, 160, 25);
        lecturerPanel.add(addLecturerBtn);

        // Creating Display Lecturer button and adding it on Lecturer panel
        displayLecturerBtn = new JButton("Display Lecturer");
        displayLecturerBtn.setBounds(80, 330, 160, 25);
        lecturerPanel.add(displayLecturerBtn);

        // Creating clear button and adding it on Teacher Panel
        clearBtn = new JButton("Clear All Fields");
        clearBtn.setBounds(80, 370, 160, 25);
        lecturerPanel.add(clearBtn);

        // ---------------------------LECTURER PANEL ENDS---------------------------

        // ---------------------------TUTOR PANEL STARTS----------------------------
        // Now i am creating a separate pannel for Tutor to add the attributes of tutor
        tutorPanel = new JPanel();
        tutorPanel.setBounds(315, 20, 300, 450);
        tutorPanel.setLayout(null);
        frame.add(tutorPanel);

        // Creating a "Tutor" label to describe the panel as Tutor
        tutorLbl = new JLabel("Tutor");
        tutorLbl.setBounds(100, 10, 100, 20);
        tutorLbl.setFont(new Font("Arial", Font.BOLD, 18));
        tutorPanel.add(tutorLbl);

        // Creating a label for Teacher Id and adding it to the tutor panel
        tIDLBL = new JLabel("Teacher Id:");
        tIDLBL.setBounds(40, 50, 100, 20);
        tutorPanel.add(tIDLBL);

        // Creating a text field for Teacher Id and adding it to the tutor panel
        tIDTXT = new JTextField();
        tIDTXT.setBounds(180, 50, 100, 20);
        tutorPanel.add(tIDTXT);

        // Creating a label for Teacher Name and adding it to the tutor panel
        tNAMELBL = new JLabel("Teacher Name:");
        tNAMELBL.setBounds(40, 80, 110, 20);
        tutorPanel.add(tNAMELBL);

        // Creating a text field for Teacher Name and adding it to the tutor panel
        tNAMETXT = new JTextField();
        tNAMETXT.setBounds(180, 80, 100, 20);
        tutorPanel.add(tNAMETXT);

        // Creating a label for Address and adding it to the tutor panel
        addLBL = new JLabel("Address:");
        addLBL.setBounds(40, 110, 110, 20);
        tutorPanel.add(addLBL);

        // Creating a text field for Address and adding it to the tutor panel
        addTXT = new JTextField();
        addTXT.setBounds(180, 110, 100, 20);
        tutorPanel.add(addTXT);

        // Creating a label for Working Type and adding it to the tutor panel
        wTYPELBL = new JLabel("Working Type:");
        wTYPELBL.setBounds(40, 140, 110, 20);
        tutorPanel.add(wTYPELBL);

        // Creating a text field for Working Type and adding it to the tutor panel
        wTYPETXT = new JTextField();
        wTYPETXT.setBounds(180, 140, 100, 20);
        tutorPanel.add(wTYPETXT);

        // Creating a label for Employment Status and adding it to the tutor panel
        empSTATUSLBL = new JLabel("Employment Status:");
        empSTATUSLBL.setBounds(40, 170, 120, 20);
        tutorPanel.add(empSTATUSLBL);

        // Creating a text field for Employment Status and adding it to the tutor panel
        empSTATUSTXT = new JTextField();
        empSTATUSTXT.setBounds(180, 170, 100, 20);
        tutorPanel.add(empSTATUSTXT);

        // Creating a label for Working Hours and adding it to the tutor panel
        wHRSLBL = new JLabel("Working Hours:");
        wHRSLBL.setBounds(40, 200, 110, 20);
        tutorPanel.add(wHRSLBL);

        // Creating a text field for Working Hours and adding it to the tutor panel
        wHRSTXT = new JTextField();
        wHRSTXT.setBounds(180, 200, 100, 20);
        tutorPanel.add(wHRSTXT);

        // Creating a label for Salary and adding it to Tutor panel
        salaryLbl = new JLabel("Salary: ");
        salaryLbl.setBounds(40, 230, 100, 20);
        tutorPanel.add(salaryLbl);

        // Creating a textfield for Salary and adding it to Tutor panel
        salaryTxt = new JTextField();
        salaryTxt.setBounds(180, 230, 100, 20);
        tutorPanel.add(salaryTxt);

        // Creating a label for Specialization and adding it to Tutor panel
        specializationLbl = new JLabel("Specialization: ");
        specializationLbl.setBounds(40, 260, 120, 20);
        tutorPanel.add(specializationLbl);

        // Creating a textfield for Specialization and adding it to Tutor panel
        specializationTxt = new JTextField();
        specializationTxt.setBounds(180, 260, 100, 20);
        tutorPanel.add(specializationTxt);

        // Creating a label for Academic Qualification and adding it to Tutor panel
        academicQualificationLbl = new JLabel("Academic Qualification:");
        academicQualificationLbl.setBounds(40, 290, 140, 20);
        tutorPanel.add(academicQualificationLbl);

        // Creating a textfield for Academic QUalification and adding it to Tutor panel
        academicQualificationTxt = new JTextField();
        academicQualificationTxt.setBounds(180, 290, 100, 20);
        tutorPanel.add(academicQualificationTxt);

        // Creating a label for Performance Index and adding it to Tutor panel
        performanceIndexLbl = new JLabel("Performance Index: ");
        performanceIndexLbl.setBounds(40, 320, 120, 20);
        tutorPanel.add(performanceIndexLbl);

        // Creating a textfield for Performance Index and adding it to Tutor panel
        performanceIndexTxt = new JTextField();
        performanceIndexTxt.setBounds(180, 320, 100, 20);
        tutorPanel.add(performanceIndexTxt);

        // Creating Add Tutor Button and adding it on Tutor Panel
        addTutorBtn = new JButton("Add Tutor");
        addTutorBtn.setBounds(80, 350, 140, 25);
        tutorPanel.add(addTutorBtn);

        // Creating Display Tutor button and adding it on Tutor Panel
        displayTutorBtn = new JButton("Display Tutor");
        displayTutorBtn.setBounds(80, 390, 140, 25);
        tutorPanel.add(displayTutorBtn);
        // ---------------------------TUTOR PANEL ENDS------------------------------

        // -------------------------GRADE ASSIGNMENT PANEL STARTS-------------------
        // Creating a separate panel to Grade the Assignment
        gradeAssignmentPanel = new JPanel();
        gradeAssignmentPanel.setBounds(620, 265, 575, 205);
        gradeAssignmentPanel.setLayout(null);
        frame.add(gradeAssignmentPanel);

        // Creating a "Grade Assignment" label to describe the panel
        gradeAssignmentLBL = new JLabel("Grade Assignment");
        gradeAssignmentLBL.setBounds(190, 10, 170, 20);
        gradeAssignmentLBL.setFont(new Font("Arial", Font.BOLD, 18));
        gradeAssignmentPanel.add(gradeAssignmentLBL);

        // Creating a label for Teacher Id and adding it to Grade Assignment panel
        teacherIDLBL = new JLabel("Teacher Id:");
        teacherIDLBL.setBounds(60, 50, 100, 20);
        gradeAssignmentPanel.add(teacherIDLBL);

        // Creating a textfield for Teacher Id and adding it to Grade Assignment panel
        teacherIDTXT = new JTextField();
        teacherIDTXT.setBounds(190, 50, 100, 20);
        gradeAssignmentPanel.add(teacherIDTXT);

        // Creating a label for Department and adding it to Grade Assignment panel
        departmentLBL = new JLabel("Department:");
        departmentLBL.setBounds(60, 80, 100, 20);
        gradeAssignmentPanel.add(departmentLBL);

        // Creating a textfield for Department and adding it to Grade Assignment panel
        departmentTXT = new JTextField();
        departmentTXT.setBounds(190, 80, 100, 20);
        gradeAssignmentPanel.add(departmentTXT);

        // Creating a label for Years of experience and adding it to Grade Assignment
        // panel
        yearsOfEXPLBL = new JLabel("Years of Experience:");
        yearsOfEXPLBL.setBounds(60, 110, 140, 20);
        gradeAssignmentPanel.add(yearsOfEXPLBL);

        // Creating a textfield for Years of experience and adding it to Grade
        // Assignment
        // panel
        yearsOfEXPTXT = new JTextField();
        yearsOfEXPTXT.setBounds(190, 110, 100, 20);
        gradeAssignmentPanel.add(yearsOfEXPTXT);

        // Creating a label for Graded Score and adding it to the Grade Assignment panel
        gradedScoreLbl = new JLabel("Graded Score: ");
        gradedScoreLbl.setBounds(60, 140, 100, 20);
        gradeAssignmentPanel.add(gradedScoreLbl);

        // Creating textfield for Graded Score and adding it to the Grade Assignment
        // panel
        gradedScoreTxt = new JTextField();
        gradedScoreTxt.setBounds(190, 140, 100, 20);
        gradeAssignmentPanel.add(gradedScoreTxt);

        // Creating Grade assignment Button and adding it on Grade Assignment Panel
        gradeAssignmentBtn = new JButton("Grade Assignment");
        gradeAssignmentBtn.setBounds(340, 80, 140, 25);
        gradeAssignmentPanel.add(gradeAssignmentBtn);
        // -------------------------GRADE ASSIGNMENT PANEL ENDS---------------------

        // ---------------------------SET SALARY PANEL STARTS-----------------------
        // Creating a separate panel to Set the Salary
        setSalaryPanel = new JPanel();
        setSalaryPanel.setBounds(895, 20, 300, 240);
        setSalaryPanel.setLayout(null);
        frame.add(setSalaryPanel);

        // Creating a "Set Salary" label to describe the panel
        setSalaryLBL = new JLabel("Set Salary");
        setSalaryLBL.setBounds(100, 10, 100, 20);
        setSalaryLBL.setFont(new Font("Arial", Font.BOLD, 18));
        setSalaryPanel.add(setSalaryLBL);

        // Creating a label for Teacher Id and adding it to Set Salary panel
        tIdSalaryLBL = new JLabel("Teacher ID:");
        tIdSalaryLBL.setBounds(40, 50, 100, 20);
        setSalaryPanel.add(tIdSalaryLBL);

        // Creating a textfield for Teacher Id and adding it to Set Salary panel
        tIdSalaryTXT = new JTextField();
        tIdSalaryTXT.setBounds(170, 50, 100, 20);
        setSalaryPanel.add(tIdSalaryTXT);

        // Creating a label for New Salary and adding it to Set Salary panel
        newSalaryLBL = new JLabel("New Salary:");
        newSalaryLBL.setBounds(40, 80, 100, 20);
        setSalaryPanel.add(newSalaryLBL);

        // Creating a textfield for New Salary and adding it to Set Salary panel
        newSalaryTXT = new JTextField();
        newSalaryTXT.setBounds(170, 80, 100, 20);
        setSalaryPanel.add(newSalaryTXT);

        // Creating a label for Performance Index and adding it to Set Salary panel
        performanceIdxLBL = new JLabel("Performance Index:");
        performanceIdxLBL.setBounds(40, 110, 120, 20);
        setSalaryPanel.add(performanceIdxLBL);

        // Creating a textfield for Performance Index and adding it to Set Salary panel
        performanceIdxTXT = new JTextField();
        performanceIdxTXT.setBounds(170, 110, 100, 20);
        setSalaryPanel.add(performanceIdxTXT);

        // Creating Set Salary Button and adding it on Set Salary Panel
        setSalaryBtn = new JButton("Set Salary");
        setSalaryBtn.setBounds(80, 150, 140, 25);
        setSalaryPanel.add(setSalaryBtn);
        // ---------------------------SET SALARY PANEL ENDS-------------------------

        // --------------------------REMOVE TUTOR PANEL STARTS----------------------
        // Creating a separate panel to Remove Tutor
        removeTutorPanel = new JPanel();
        removeTutorPanel.setBounds(620, 20, 270, 240);
        removeTutorPanel.setLayout(null);
        frame.add(removeTutorPanel);

        // Creating a "Remove Tutor" label to describe the panel
        removeTutorLBL = new JLabel("Remove Tutor");
        removeTutorLBL.setBounds(90, 10, 150, 20);
        removeTutorLBL.setFont(new Font("Arial", Font.BOLD, 18));
        removeTutorPanel.add(removeTutorLBL);

        // Creating a label for Teacher Id and adding it to Remove Tutor panel
        tIdremoveLBL = new JLabel("Teacher ID:");
        tIdremoveLBL.setBounds(40, 50, 100, 20);
        removeTutorPanel.add(tIdremoveLBL);

        // Creating a textfield for Teacher Id and adding it to Remove Tutor panel
        tIdremoveTXT = new JTextField();
        tIdremoveTXT.setBounds(110, 50, 100, 20);
        removeTutorPanel.add(tIdremoveTXT);

        // Creating remove tutor button and adding it on Remove Tutor panel
        removeTutorBtn = new JButton("Remove Tutor");
        removeTutorBtn.setBounds(80, 100, 120, 25);
        removeTutorPanel.add(removeTutorBtn);
        // ---------------------------REMOVE TUTOR PANEL ENDS-----------------------

        // Adding action listeners to button starts from here

        // Adding action listener to Add Lecturer button which will call and implement
        // the code of addLecturer method when it is pressed
        addLecturerBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                addLecturer();
            }
        });

        // Adding action listener to Add Tutor button which will call and implement the
        // code of addTutor method when it is pressed
        addTutorBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                addTutor();
            }
        });

        // Adding action listener to Grade Assignment button which will call and
        // implement the code of gradeAssignment method when it is pressed
        gradeAssignmentBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                gradeAssignment();
            }
        });

        // Adding action listener to Set Salary button which will call and implement the
        // code of setSalary method when it is pressed
        setSalaryBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                setSalary();
            }
        });

        // Adding action listener to Remove Tutor button which will call and implement
        // the code of removeTutor method when it is pressed
        removeTutorBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                removeTutor();
            }
        });

        // Adding action listener to Display Lecturer button which will call and
        // implement the code of displayGUI method when it is pressed
        displayLecturerBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                displayLecturerGUI();
            }
        });

        // Adding action listener to Display Tutor button which will call and implement
        // the code of displayGUI method when it is pressed
        displayTutorBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                displayTutorGUI();
            }
        });

        // Adding action listener to Clear button which will call and implement the
        // code of clear method when it is pressed
        clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                clear();
            }
        });

        // Setting setVisible as true which is false by default as this method will make
        // sure that the frame is visible
        frame.setVisible(true);

    }

    // Declaring a private method to Add Lecturer which will be called when Add
    // Lecturer button is pressed which will create a new object of
    // Lecturer type which is added to an array list of Teacher class
    private void addLecturer() {
        String id = teacherIdTxt.getText().trim();
        String name = teacherNameTxt.getText().trim();
        String address = addressTxt.getText().trim();
        String workingType = workingTypeTxt.getText().trim();
        String employmentStatus = employmentStatusTxt.getText().trim();
        String department = departmentTxt.getText().trim();
        String workingHour = workingHoursTxt.getText().trim();
        String yearsOfExperience = yearsOfExperienceTxt.getText().trim();

        if (id.isEmpty() || name.isEmpty() || address.isEmpty() || workingType.isEmpty()
                || employmentStatus.isEmpty() || department.isEmpty() || workingHour.isEmpty()
                || yearsOfExperience.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Make sure to fill all the required fields!", "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            int teacherId = Integer.parseInt(id);
            int yearsOfExp = Integer.parseInt(yearsOfExperience);
            int workingHours = Integer.parseInt(workingHour);

            // Checking specific condition required to Add Lecturer
            if (idExist(teacherId)) {
                JOptionPane.showMessageDialog(frame,
                        "Teacher with the same ID already exists. Make sure to enter unique Id!", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Checking specific condition required to Add Lecturer
            else if (teacherId < 1) {
                JOptionPane.showMessageDialog(frame, "Teacher ID can't be less than 1!", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

            // Checking specific condition required to Add Lecturer
            else if (workingHours < 1) {
                JOptionPane.showMessageDialog(frame, "Working hours can't be less than 1!", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

            // Checking specific condition required to Add Lecturer
            else if (yearsOfExp < 1) {
                JOptionPane.showMessageDialog(frame, "Years of experience can't be less than 1!", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

            else {
                Teacher t1 = new Lecturer(teacherId, name, address, workingType, employmentStatus, workingHours,
                        department, yearsOfExp);
                teacherList.add(t1);

                // Declaring a variable to display the details in dialog box
                String details = "Lecturer Details:\n" +
                        "Lecturer ID: " + teacherId + "\n" +
                        "Name: " + name + "\n" +
                        "Address: " + address + "\n" +
                        "Working Type: " + workingType + "\n" +
                        "Employment Status: " + employmentStatus + "\n" +
                        "Department: " + department + "\n" +
                        "Working Hours: " + workingHours + "\n" +
                        "Years of Experience: " + yearsOfExp;
                JOptionPane.showMessageDialog(frame, "Lecturer added Successfully!\n\n" + details, "Success",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Make sure to enter value of correct type", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    // Declaring a private method to Add Tutor which will be called when Add
    // Tutor button is pressed which will create a new object of
    // Tutor type which is added to an array list of Teacher class
    private void addTutor() {
        String id = tIDTXT.getText().trim();
        String name = tNAMETXT.getText().trim();
        String address = addTXT.getText().trim();
        String workingType = wTYPETXT.getText().trim();
        String employmentStatus = empSTATUSTXT.getText().trim();
        String workingHour = wHRSTXT.getText().trim();
        String salary = salaryTxt.getText().trim();
        String specialization = specializationTxt.getText().trim();
        String academicQualification = academicQualificationTxt.getText().trim();
        String performanceIndex = performanceIndexTxt.getText().trim();

        // Displaying a message if any fields among them is empty
        if (id.isEmpty() || name.isEmpty() || address.isEmpty() || workingType.isEmpty()
                || employmentStatus.isEmpty()
                || salary.isEmpty() || specialization.isEmpty() || performanceIndex.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Make sure to fill all the required fields!", "Warning",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            int teacherId = Integer.parseInt(id);
            double salaryDouble = Double.parseDouble(salary);
            int workingHours = Integer.parseInt(workingHour);
            int performanceIdx = Integer.parseInt(performanceIndex);

            // Checking specific condition required to Add Tutor
            if (idExist(teacherId)) {
                JOptionPane.showMessageDialog(frame,
                        "Teacher with the same ID already exists. Make sure to enter a unique Id!", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Checking specific condition required to Add Tutor
            else if (teacherId < 1) {
                JOptionPane.showMessageDialog(frame, "Teacher ID can't be less than 1!", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

            // Checking specific condition required to Add Tutor
            else if (workingHours < 1) {
                JOptionPane.showMessageDialog(frame, "Working hours can't be less than 1!", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

            // Checking specific condition required to Add Tutor
            else if (salaryDouble < 1) {
                JOptionPane.showMessageDialog(frame, "Salary can't be less than 1!", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

            // Checking specific condition required to Add Tutor
            else if (performanceIdx < 1) {
                JOptionPane.showMessageDialog(frame, "Performance index can't be less than 1!", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

            else {

                Teacher t2 = new Tutor(teacherId, name, address, workingType, employmentStatus, workingHours,
                        salaryDouble, specialization, academicQualification, performanceIdx);
                teacherList.add(t2);

                // Declaring a variable to display the details in dialog box
                String details = "Tutor Details:\n" +
                        "Tutor ID: " + teacherId + "\n" +
                        "Name: " + name + "\n" +
                        "Address: " + address + "\n" +
                        "Working Type: " + workingType + "\n" +
                        "Employment Status: " + employmentStatus + "\n" +
                        "Working Hours: " + workingHours + "\n" +
                        "Salary: " + salaryDouble + "\n" +
                        "Specialization: " + specialization + "\n" +
                        "Academic Qualification: " + academicQualification + "\n" +
                        "Performance Index: " + performanceIdx;

                // Displaying the message in a dialog box
                JOptionPane.showMessageDialog(frame, "Tutor added Successfully!\n\n" + details, "Success",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Make sure to enter a value of correct type for numeric fields!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    // Declaring a private method to Grade Assignment which will be called when
    // Grade Assignment button is pressed which will grade the assignment if valid
    // Teacher Id is entered along with Graded Score, Department and Years of
    // Experience
    private void gradeAssignment() {
        // Display a confirmation dialog
        int choice = JOptionPane.showConfirmDialog(frame, "Are you sure you want to grade the assignment?",
                "Confirmation", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            try {
                int id = Integer.parseInt(teacherIDTXT.getText());
                String department = departmentTXT.getText().trim();
                int gradedScoreInt = Integer.parseInt(gradedScoreTxt.getText());
                int yearsOfExperienceInt = Integer.parseInt(yearsOfEXPTXT.getText());

                for (Teacher t1 : teacherList) {
                    if (t1.getTeacherId() == id) {
                        if (t1 instanceof Lecturer) {
                            Lecturer l1 = (Lecturer) t1;

                            // Displaying the information based on the conditions are met or not
                            if (yearsOfExperienceInt >= 5 && l1.getDepartment().equals(department)) {
                                l1.gradeAssignment(gradedScoreInt, department, yearsOfExperienceInt);
                                JOptionPane.showMessageDialog(frame,
                                        "Assignments graded successfully. Score is displayed in terminal.",
                                        "Success", JOptionPane.INFORMATION_MESSAGE);
                                return;
                            }

                            // Checking specific condition required to grade assignment
                            else if (!(yearsOfExperienceInt >= 5)) {
                                JOptionPane.showMessageDialog(frame,
                                        "Assignment cannot be graded as the Years of Experience must be greater than 5!",
                                        "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }

                            // Checking specific condition required to grade assignment
                            else if (!(l1.getDepartment().equals(department))) {
                                JOptionPane.showMessageDialog(frame,
                                        "Assignment cannot be graded as the Department must be the same!",
                                        "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                        }
                    }
                }

                // If no matching lecturer is found
                JOptionPane.showMessageDialog(frame, "No lecturer found with the given ID", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(frame, "Make sure to fill all the required fields!", "Warning",
                        JOptionPane.WARNING_MESSAGE);
            }
        } else if (choice == JOptionPane.NO_OPTION) {
            return;
        }
    }

    // Declaring a private method to Set Salary which will be called when
    // Set Salary button is pressed which will set the salary
    // according to condition if valid Teacher Id has been entered
    private void setSalary() {
        // Checking that all the values are entered of correct data types using a
        // try-catch block
        try {
            String idText = tIdSalaryTXT.getText().trim();
            String salaryText = newSalaryTXT.getText().trim();
            String performanceIndexText = performanceIdxTXT.getText().trim();

            // Check if any of the fields are empty
            if (idText.isEmpty() || salaryText.isEmpty() || performanceIndexText.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Make sure to fill all the required fields!", "Warning",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            int id = Integer.parseInt(idText);
            double salary = Double.parseDouble(salaryText);
            int performanceIndex = Integer.parseInt(performanceIndexText);

            for (Teacher t1 : teacherList) {
                if (t1.getTeacherId() == id) {
                    if (t1 instanceof Tutor) {
                        Tutor t2 = (Tutor) t1;

                        // Check if conditions are met before setting salary
                        if (performanceIndex > 5 && t2.getWorkingHour() > 20) {
                            t2.setSalary(salary, performanceIndex);
                            JOptionPane.showMessageDialog(frame, "Salary set successfully!", "Success",
                                    JOptionPane.INFORMATION_MESSAGE);
                            return;
                        }
                        // Checking specific condition required to set salary
                        else if (!(performanceIndex > 5)) {
                            JOptionPane.showMessageDialog(frame,
                                    "Salary cannot be set as the performance index must be greater than 5!",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        // Checking specific condition required to set salary
                        else if (!(t2.getWorkingHour() > 20)) {
                            JOptionPane.showMessageDialog(frame,
                                    "Salary cannot be set as the working hours must be greater than 20!",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                    }
                    break;
                }
            }

            // If no matching tutor is found
            JOptionPane.showMessageDialog(frame, "No tutor found with ID " + id + " is found", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Make sure to enter a value of correct type for numeric fields!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    // Declaring a private method to Remove Tutor which will be called when Remove
    // Tutor button is pressed which will remove thetutor if appropriate Teacher Id
    // has been entered
    private void removeTutor() {
        try {
            int id = Integer.parseInt(tIdremoveTXT.getText());
            for (Teacher t1 : teacherList) {
                if (t1.getTeacherId() == id) {
                    if (t1 instanceof Tutor) {
                        Tutor t2 = (Tutor) t1;

                        if (t2.getIsCertified()) {
                            JOptionPane.showMessageDialog(frame, "Since tutor is certified, So tutor can't be removed",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        t2.removeTutor();
                        teacherList.remove(t1);
                        JOptionPane.showMessageDialog(frame, "Tutor removed successfully!", "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                }
            }
            // If no matching tutor is found
            JOptionPane.showMessageDialog(frame, "No tutor found with the ID " + id + " is found", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(frame, "Make sure to fill all the required fields!", "Warning",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    // Declaring a private method to Display the details of Lecturer which will be
    // called when Display Lecturer button is pressed which will display the
    // information relating to the Lecturer
    private void displayLecturerGUI() {
        try {
            int id = Integer.parseInt(teacherIdTxt.getText());
            boolean lecturerFound = false;
            for (Teacher t : teacherList) {
                if (t instanceof Lecturer && t.getTeacherId() == id) {
                    System.out.println("Lecturer Details:");
                    Lecturer l = (Lecturer) t;
                    l.display();
                    System.out.println("");
                    lecturerFound = true;
                    break;
                }
            }
            if (!lecturerFound) {
                JOptionPane.showMessageDialog(frame, "The Lecturer with Id " + id + " is not found!", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame, "Lecturer details is displayed in terminal!", "Success",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(frame, "Make sure to fill all the required fields!", "Warning",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    // Declaring a private method to Display the details of Tutor which will be
    // called whenDisplay Tutor button is pressed which will display the information
    // relating to the Tutor
    private void displayTutorGUI() {
        try {
            int id = Integer.parseInt(tIDTXT.getText());
            boolean tutorFound = false;
            for (Teacher t : teacherList) {
                if (t instanceof Tutor && t.getTeacherId() == id) {
                    System.out.println("Tutor Details:");
                    Tutor tu = (Tutor) t;
                    tu.display();
                    System.out.println("");
                    tutorFound = true;
                    break;
                }
            }
            if (!tutorFound) {
                JOptionPane.showMessageDialog(frame, "The Tutor with Id " + id + " is not found!", "Warning",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame, "Tutor details is displayed in terminal!", "Success",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(frame, "Make sure to fill all the required fields!", "Warning",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    // Declaring a private method to Clear the details entered in textfields
    // whichwill be called when Clear button is pressed which will clear all the
    // input values in the textfield
    private void clear() {
        teacherIdTxt.setText("");
        teacherIDTXT.setText("");
        departmentTXT.setText("");
        yearsOfEXPTXT.setText("");
        teacherNameTxt.setText("");
        addressTxt.setText("");
        workingTypeTxt.setText("");
        tIdSalaryTXT.setText("");
        tIDTXT.setText("");
        tNAMETXT.setText("");
        addTXT.setText("");
        wTYPETXT.setText("");
        empSTATUSTXT.setText("");
        wHRSTXT.setText("");
        newSalaryTXT.setText("");
        employmentStatusTxt.setText("");
        performanceIdxTXT.setText("");
        tIdremoveTXT.setText("");
        workingHoursTxt.setText("");
        departmentTxt.setText("");
        yearsOfExperienceTxt.setText("");
        gradedScoreTxt.setText("");
        salaryTxt.setText("");
        specializationTxt.setText("");
        academicQualificationTxt.setText("");
        performanceIndexTxt.setText("");
    }

    // Creating a method to check if id entered already exists or not
    private boolean idExist(int teacher_ID) {
        for (Teacher idChecking : teacherList) {
            if (idChecking.getTeacherId() == teacher_ID) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        new TeacherGUI();
    }
}
