/*
Ryan Citron
7/16/2018
Mobile Applications
Homework 2
*/

/**
 * Team.java
 *
 * This program helps you keep track of the team members and competition information
 * for your school�s annual entries in computer programming competitions.
 * Each team consists of exactly four team members.
 * Every year your team competes in two competitions. Competition
 * information is stored in the Competition class.
 */

public class Team
{
    	// Name for the team
    	private String teamName;
    	// Names for each team members.
    	private String name1, name2, name3, name4;
    	// Info on each competition
    	private Competition competition1, competition2;

	/**
	* Default constructor;  Initialize variables.
 	*/
 	public Team()
 	{
		teamName = "No Team Name Set";
		name1 = "Name not set.";
		name2 = "Name not set.";
		name3 = "Name not set.";
		name4 = "Name not set.";
		competition1 = null;
		competition2 = null;
	}

   	/**
	* Team constructor;  Initialize variables to passed-in values.
	* The competition objects must be created outside this constructor.
 	*/
 	public Team(String teamName, String name1, String name2, String name3,
 		String name4, Competition competition1, Competition competition2)
 	{
		this.teamName = teamName;
		this.name1 = name1;
		this.name2 = name2;
		this.name3 = name3;
		this.name4 = name4;
		this.competition1 = competition1;
		this.competition2 = competition2;
	}

   	/**
	* Team copy constructor;  Performs a deep copy from the Competition class
	* instead of just copying a reference to the same Competition objects.
 	*/
 	public Team(Team otherTeam)
 	{

	//=============================//
	// to be completed by students //
	//=============================//

    this.teamName = otherTeam.teamName;
    this.name1 = otherTeam.name1;
    this.name2 = otherTeam.name2;
    this.name3 = otherTeam.name3;
    this.name4 = otherTeam.name4;
    this.competition1 = new Competition(
      otherTeam.competition1.getCompetitionName(),
      otherTeam.competition1.getWinner(),
      otherTeam.competition1.getRunnerup(),
      otherTeam.competition1.getYear());
    this.competition2 = new Competition(
      otherTeam.competition2.getCompetitionName(),
      otherTeam.competition2.getWinner(),
      otherTeam.competition2.getRunnerup(),
      otherTeam.competition2.getYear());
	}

   	/**
	* Output all team information to the console.
 	*/
 	public void OutputTeamInfo()
 	{
		System.out.println("Team name :" + teamName);
		System.out.println("Team member 1: " + name1);
		System.out.println("Team member 2: " + name2);
		System.out.println("Team member 3: " + name3);
		System.out.println("Team member 4: " + name4);
		System.out.println("Competitions:");
		if (competition1 != null) {
			System.out.println(competition1.toString());
		}
		if (competition2 != null) {
			System.out.println(competition2.toString());
		}
		System.out.println();
	}

// ======================
// Various accessor and mutator methods
// ======================
    public String getTeamName()
    {
        return teamName;
    }

    public void setTeamName(String teamName)
    {
        this.teamName = teamName;
    }

    public String getName1()
    {
        return name1;
    }

    public void setName1(String name1)
    {
        this.name1 = name1;
    }

    public String getName2()
    {
        return name2;
    }

    public void setName2(String name2)
    {
        this.name2 = name2;
    }

    public String getName3()
    {
        return name3;
    }

    public void setName3(String name3)
    {
        this.name3 = name3;
    }

    public String getName4()
    {
        return name4;
    }

    public void setName4(String name4)
    {
        this.name4 = name4;
    }

    public Competition getCompetition1()
    {
        return competition1;
    }

    public void setCompetition1(Competition competition1)
    {
        this.competition1 = competition1;
    }

    public Competition getCompetition2()
    {
        return competition2;
    }

    public void setCompetition2(Competition competition2)
    {
        this.competition2 = competition2;
    }

  /**
  * This is the main method.
  * It creates a Team object and then tests the copy constructor.
  */
  public static void main(String[] args)
   	{
		Team team1 =
			new Team("The Java Studs", "Bill", "Ted", "Carol", "Alice",
			  new Competition("ACM Programming Contest","The Java Studs",
					  "Team University Java", 2008),
			  new Competition("Antarctic Programming Contest","The Java Studs",
						  "Frigid South", 2010) );
		Team team2 = new Team(team1);	// Copy constructor

		// Change competition information for team2
		team2.getCompetition1().setYear(2011);
		team2.getCompetition1().setWinner("Mmm Java");
		team2.getCompetition1().setRunnerup("Java By Night Java By Day");
		team2.getCompetition2().setYear(2012);

		// Output information for both team1 and team2.
		// Team1's should be unchanged from the original values.
		team1.OutputTeamInfo();
		team2.OutputTeamInfo();
	}
} // Team
/*
Output after running the test:
Team name :The Java Studs
Team member 1: Bill
Team member 2: Ted
Team member 3: Carol
Team member 4: Alice
Competitions:
Competition Name:ACM Programming Contest
Winner: The Java Studs
Runner-Up: Team University Java
Year: 2008
Competition Name:Antarctic Programming Contest
Winner: The Java Studs
Runner-Up: Frigid South
Year: 2010

Team name :The Java Studs
Team member 1: Bill
Team member 2: Ted
Team member 3: Carol
Team member 4: Alice
Competitions:
Competition Name:ACM Programming Contest
Winner: Mmm Java
Runner-Up: Java By Night Java By Day
Year: 2011
Competition Name:Antarctic Programming Contest
Winner: The Java Studs
Runner-Up: Frigid South
Year: 2012
*/
