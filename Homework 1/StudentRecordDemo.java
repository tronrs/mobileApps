import java.util.Scanner;

public class StudentRecordDemo
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		StudentRecord studentA = new StudentRecord(8, 9, 7, 86, 91);

		System.out.println("Enter the student's score on the first quiz (0 - 10): ");
		int quiz1 = keyboard.nextInt();

		System.out.println("Enter the student's score on the second quiz (0 - 10): ");
		int quiz2 = keyboard.nextInt();

		System.out.println("Enter the student's score on the third quiz (0 - 10): ");
		int quiz3 = keyboard.nextInt();

		System.out.println("Enter the student's score on the midterm (0 - 100): ");
		int midterm = keyboard.nextInt();

		System.out.println("Enter the student's score on the final (0 - 100): " );
		int finalExam = keyboard.nextInt();

		StudentRecord studentB =
			new StudentRecord(quiz1, quiz2, quiz3, midterm, finalExam);

		System.out.println("Student A's record: " + studentA);
		System.out.println("Student B's record: " + studentB);

		if (studentA.equals(studentB))
			System.out.println("Student A has a same record as Student B");
		else
			System.out.println("Student A has a different record than Student B");
		
	}
} // StudentRecordDemo
