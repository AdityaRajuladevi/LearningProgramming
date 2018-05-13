package thirtydaystocode;

public class Day12Inheritance {
	public static void main(String args[])
	{
		
	}
}

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	
	
	private int[] testScores;

	Student(String firstName, String lastName, int identification) {
		super(firstName, lastName, identification);
		// TODO Auto-generated constructor stub
	}
	
    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    public Student(String fName, String lName, int id, int[] scores)
    {
        super(fName,lName,id);
        /*
        firstName = fName;
        lastName = lastName;
        super.idNumber = id; */
        this.testScores = scores;
    }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    char calculate()
    {
        int scoreSum = 0;
        char grade=' ';
        for(Integer score: testScores)
            scoreSum+=score;
        int averageScore = scoreSum/testScores.length;
        if ( averageScore >= 90 && averageScore<=100)
            grade='O';
        else if(averageScore >= 80 && averageScore<90)
            grade = 'E';
        else if(averageScore >= 70 && averageScore<80)
            grade = 'A';
        else if(averageScore >= 55 && averageScore<70)
            grade = 'P';
        else if(averageScore >= 40 && averageScore<55)
            grade = 'D';
        else if(averageScore <40)
            grade = 'T';
        return grade;
    }
}