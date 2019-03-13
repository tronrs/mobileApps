/*
Ryan Citron
Mobile Applications
7/11/2018
Homework 1
*/


public class StudentRecord
{

	private int quiz1;
	private int quiz2;
	private int quiz3;
	private int midterm;
	private int finalExam;

	private double numericScore;
	private char letterGrade;

	private final int A_GRADE = 90;
	private final int B_GRADE = 80;
	private final int C_GRADE = 70;
	private final int D_GRADE = 60;

	public StudentRecord (int quiz1, int quiz2, int quiz3,
		int midterm, int finalExam)
	{
		this.quiz1 = quiz1;
		this.quiz2 = quiz2;
		this.quiz3 = quiz3;
		this.midterm = midterm;
		this.finalExam = finalExam;
	}


	//*******************************
	// accessor and mutator methods
	// to be completed by students
	//*******************************

	// This method returns the quiz score based on which
	// number is in the parameter.
	public int getQuiz(int n)
	{

		switch(n)
		{

			case 1: return this.quiz1;
			case 2: return this.quiz2;
			default: return this.quiz3;

		}

	}

	// This method sets the quiz score based on which
	// number is in the parameter.
	public void setQuiz(int n, int score)
	{

		switch(n)
		{

			case '1': this.quiz1 = score; break;
			case '2': this.quiz2 = score; break;
			default: this.quiz3 = score; break;

		}

	}

	// This method returns the midterm score.
	public int getMidterm(){return this.midterm;}

	// This method sets the midterm score.
	public void setMidterm(int score){this.midterm = score;}

	// This method returns the final exam score.
	public int getFinalExam(){return this.finalExam;}

	// This method sets the final exam score.
	public void setFinalExam(int score){this.finalExam = score;}

	// This method gets the numeric score.
	public double getNumericScore(){ return this.numericScore;}

	// This method gets the letter grade.
	public char getLetterGrade(){ return this.letterGrade;}

	// This method calculates the numericScore based on
	// the scores of the quizzes and exams.
	public void computeNumericScore()
	{
		//*****************************
		// to be completed by students
		//*****************************

		this.numericScore =
			this.quiz1 * .25 			// Worth 25%
			+ this.quiz2 * .25			// Worth 25%
			+ this.quiz3 * .25			// Worth 25%
			+	this.midterm * .35		// Worth 35%
			+ this.finalExam * .40; // Worth 40%


	}

	// This method calculates the letterGrade based on
	// the numberScore.
	public void computeLetterGrade()
	{
		computeNumericScore();

		//*****************************
		// to be completed by students
		//*****************************
		switch((int) this.numericScore / 10){ // Converts score to single digit
			case 1:
			case 2:
			case 3:
			case 4:
			case 5: this.letterGrade = 'F'; break;  // Score is: 0-59
			case 6: this.letterGrade = 'D'; break;  // 60-69
			case 7: this.letterGrade = 'C'; break;  // 70-79
			case 8: this.letterGrade = 'B'; break;  // 80-89
			default: this.letterGrade = 'A'; break; // 90 - 100

		}
	}

	// This method compares two StudentRecord objects.
	// It will return true only if two objects have
	// same score for each of the quizzes and exams.
	public boolean equals(StudentRecord other)
	{
		//*****************************
		// to be completed by students
		//*****************************
		if (this.quiz1 == other.getQuiz(1)
				&& this.quiz2 == other.getQuiz(2)
				&& this.quiz3 == other.getQuiz(3)
				&& this.midterm == other.getMidterm()
				&& this.finalExam == other.getFinalExam()) return true;
		else return false;
	}

	// This method returns a string representation of
	// the data in the calling object.
	public String toString()
	{
		//*****************************
		// to be completed by students
		//*****************************
		computeLetterGrade();
		return ("Your final grade is: " + this.numericScore + " which is a " +
		this.letterGrade);
	}

}// StudentRecord

/*

Ryans-MacBook-Pro:Homework 1 tronrs$ java StudentRecordDemo
Enter the student's score on the first quiz (0 - 10):
8
Enter the student's score on the second quiz (0 - 10):
9
Enter the student's score on the third quiz (0 - 10):
10
Enter the student's score on the midterm (0 - 100):
80
Enter the student's score on the final (0 - 100):
75
Student A's record: Your final grade is: 72.5 which is a C
Student B's record: Your final grade is: 64.75 which is a D
Student A has a different record than Student B
Ryans-MacBook-Pro:Homework 1 tronrs$ java StudentRecordDemo
Enter the student's score on the first quiz (0 - 10):
8
Enter the student's score on the second quiz (0 - 10):
9
Enter the student's score on the third quiz (0 - 10):
7
Enter the student's score on the midterm (0 - 100):
86
Enter the student's score on the final (0 - 100):
91
Student A's record: Your final grade is: 72.5 which is a C
Student B's record: Your final grade is: 72.5 which is a C
Student A has a same record as Student B

*/
