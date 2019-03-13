/**
 * AdministratorDemo.java
 *
 */

public class AdministratorDemo
{

   public static void main(String[] args)
   {
      Administrator admin1 = new Administrator();
      System.out.println("admin1: " + admin1);

      Administrator admin2 = new Administrator("Bob", new Date(2, 3, 1999),
			   34000, "Vice President", "Human Resources", "Joe");
      System.out.println("admin2: " + admin2);

      Administrator admin3 = new Administrator(admin2);
      System.out.println("admin3 copy of admin2: " + admin3);

      System.out.println("Get the title from admin2: " + admin2.getTitle());
      System.out.println("Get the area from admin2: " + admin2.getArea());
      System.out.println("Get the supervisors name from admin2: "
			 + admin2.getSupervisorsName());

      System.out.println("admin2 equal to admin3: " + admin2.equals(admin3));
      System.out.println("admin1 equal to admin3: " + admin1.equals(admin3));

      admin1.readAdminInfo();
      System.out.println("admin1: " + admin1);

   } 
} // AdministratorDemo

