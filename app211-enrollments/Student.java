/**
* This class allows users to create a student object and contains
* methods that allows them to enroll a student to a course, print a student's information and
* the course the student is enrolled on.
* 
* @author  Kyle Whynn
* @version 1.0
*/
public class Student
{
    // The student id
    private int id;
    // The student's full name
    private String name;
    // The course the student is enrolled on
    private Course course;
    
    /**
    * Input for student name and ID number.
    */
    public Student(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    /**
    * Enrolls student to a course.
    */
    public void enroll(Course course)
    {
        this.course = course;
    }
    
    /**
    * Print the student's name and ID number to the terminal.
    */
    public void print()
    {
        System.out.println("Student ID: " + id );
        System.out.println("Name      : " + name);
        
    }
    
    /**
    * Print the course the student is enrolled on to the terminal.
    */
    public void printCourse()
    {
        course.print();
    }
}
