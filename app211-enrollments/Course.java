import java.util.*;

/**
 * This class contains information about an undergraduate course
 * at BNU together with a list of student who are enrolled
 *
 * @author  Kyle Whynn
 * @version 1.0 
 */
public class Course
{
    // A code for the course. 
    private String code;
    // The title of the course.
    private String title;
    // The module the student is enrolled on.
    private Module module;
    
    /**
    * Input For course code and title. 
    */
    public Course(String code, String title)
    {
        this.code  = code;
        this.title = title;
    }
      
    /**
    * Links the course to a module.
    */
    public void eroll(Module module)
    {
        this.module = module;
    }

    /**
    * Print a heading to the terminal above the course information.
    */
    private void printHeading()
    {      
        System.out.println("--------------------------------------");
        System.out.println("    App211: Course & Module Details   ");
        System.out.println("--------------------------------------");
        System.out.println();
    }
    
    /**
    * Print the details of the course to the terminal.
    */
    public void print()
    {
        printHeading();
        System.out.println();
        System.out.println("Course Code : " + code);
        System.out.println("Title       : " + title);
        System.out.println();
    }
    
}
