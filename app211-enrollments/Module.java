
/**
* This class allows users to create a module object and contains
* methods that allows them to set the credit value and
* print module information.
* 
* @author   Kyle Whynn
* @version  1.0
*/
public class Module
{
    // Code for module
    private String code;
    // Title for module
    private String title;
    // Set value for credit value
    private int creditvalue = 0;
    
    /**
    * Input for module code and title.
    */
       public Module(String Code,String Title)
    {
       this.code = code;
       this.title = title;
       
    }
    
    /**
    * Allows user to set credit value.
    */
       public void setCreditValue(int CreditValue)
    {
       this.creditvalue = creditvalue;
    }
    
    /**
    * Print a heading to the terminal above the module information.
    */
       private void printHeading()
    {
       System.out.println(" --------------------------------");
       System.out.println("        App211: Module Details   ");
       System.out.println(" --------------------------------");
       System.out.println();
    }
    
    /**
    * Print module information to terminal.
    */
       public void print()
    {
       printHeading();
       System.out.println(); 
       System.out.println("Code         : " + code);
       System.out.println("Title        : " + title);
       System.out.println("Credit Value : " + creditvalue);
    }

 
}
