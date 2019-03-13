/*
Ryan Citron
7/16/2018
Mobile Applications
Homework 2
*/

import java.util.Scanner;
public class Administrator extends SalariedEmployee{

  private String title;
  private String area;
  private String supervisorName;

  public Administrator(){

    super();
    this.title = "None";
    this.area = "None";
    this.supervisorName = "None";

  }

  public Administrator(String theName, Date theDate, double theSalary,
                String theTitle, String theArea, String theSupervisor){


    super(theName, theDate, theSalary);
    this.title = theTitle;
    this.area = theArea;
    this.supervisorName = theSupervisor;

  }
  public Administrator(Administrator originalObject )
  {
       super(originalObject);
       this.title = originalObject.title;
       this.area = originalObject.area;
       this.supervisorName = originalObject.supervisorName;
  }

  // Getters and setters
  public String getTitle(){ return this.title; }
  public void setTitle(String title){ this.title = title; }
  public String getArea(){ return this.area; }
  public void setArea(String area){ this.area = area; }
  public String getSupervisorsName(){ return this.supervisorName; }
  public void setSupervisorsName(String name){ this.supervisorName = name; }

  // Asks questions and reads in what is inputted to fill in the Administrator
  // information for the Administrator Class.
  public void readAdminInfo(){
    Scanner input = new Scanner(System.in);

    System.out.println("What is your name?");
    String name = input.nextLine();
    this.setName(name);

    System.out.println("What month did you start?");
    String month = input.nextLine();
    System.out.println("What day did you start?");
    int day = input.nextInt();
    System.out.println("What year did you start?");
    int year = input.nextInt();
    Date date = new Date(month, day, year);
    this.setHireDate(date);

    System.out.println("What is your salary?");
    double salary = input.nextDouble();
    this.setSalary(salary);


    System.out.println("What is your title?");
    String title1 = input.nextLine();
    title1 = input.nextLine();  // nextDouble() doesn't consume newline
                                // which is why i have 2 newLines().
    this.setTitle(title1);

    System.out.println("What is your area?");
    this.area = input.nextLine();

    System.out.println("What is your supervisors name?");
    this.supervisorName = input.nextLine();

  }

  public String toString( )
  {
      return  (super.toString() + "\nTitle " + this.title
      + "\nArea " + this.area + "\nSupervisors Name " + this.supervisorName);
  }

  public boolean equals(Object otherObject)
  {
    if (otherObject == null)
        return false;
    else if (getClass( ) != otherObject.getClass( ))
        return false;
    else
    {
        Administrator otherAdministrator =
                               (Administrator)otherObject;
         return (super.equals(otherAdministrator)
               && (this.title == otherAdministrator.title)
               && (this.area == otherAdministrator.area)
               && (this.supervisorName == otherAdministrator.supervisorName));
    }
  }

}
/*
Output from running the demo:
admin1: No name, January 1, 1000
$0.0 per year
Title None
Area None
Supervisors Name None
admin2: Bob, February 3, 1999
$34000.0 per year
Title Vice President
Area Human Resources
Supervisors Name Joe
admin3 copy of admin2: Bob, February 3, 1999
$34000.0 per year
Title Vice President
Area Human Resources
Supervisors Name Joe
Get the title from admin2: Vice President
Get the area from admin2: Human Resources
Get the supervisors name from admin2: Joe
admin2 equal to admin3: true
admin1 equal to admin3: false
What is your name?
Ryan Citron
What month did you start?
December
What day did you start?
15
What year did you start?
2016
What is your salary?
50000
What is your title?
Plc Programmer
What is your area?
Programming PLC's for OEMs
What is your supervisors name?
John
admin1: Ryan Citron, December 15, 2016
$50000.0 per year
Title Plc Programmer
Area Programming PLC's for OEMs
Supervisors Name John
*/
