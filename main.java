
public class main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//find weighted score for each test 1-6
	int score= 75;
			double test1 = score*10;
			System.out.println("Test 1 average: " + test1);
		score = 95;
			double test2 = score*20;
			System.out.println("Test 2 average: " + test2);
		score = 85;
			double test3 = score*25;
			System.out.println("Test 3 average: " + test3);
		score = 55;
			double test4 = score*25;
			System.out.println("Test 4 average: " + test4);
		score = 65;
			double	test5 = score*10;
			System.out.println("Test 5 average: " + test5);
		score = 70;
			double test6 = score*10;
			System.out.println("Test 6 average: " + test6);
			
		//find average of all test scores
			
			double WeightedTestAvg = ((test1 + test2 + test3 + test4 + test5 + test6)/100);
			System.out.println("Weighted Test Average: " + WeightedTestAvg);
			
		//find weighted score for each assignment
			
	int assignment = 55;
			double assignment1 = assignment*5;
		assignment = 65;
			double assignment2 = assignment*10;
		assignment = 65;
			double assignment3 = assignment*15;
		assignment = 60;
			double assignment4 = assignment*25;
		assignment = 55;
			double assignment5 = assignment*25;
		assignment = 50;
			double assignment6 = assignment*20;
			
		//display all assignment scores
			
		System.out.println("Assignment 1 average: " + assignment1);
		System.out.println("Assignment 2 average: " + assignment2);
		System.out.println("Assignment 3 average: " + assignment3);
		System.out.println("Assignment 4 average: " + assignment4);
		System.out.println("Assignment 5 average: " + assignment5);
		System.out.println("Assignment 6 average: " + assignment6);
		
		//find average score for all assignments
		
			double WeightedAsgnmentAvg = ((assignment1 + assignment2 + assignment3 + assignment4 + assignment5 + assignment6)/100);
		System.out.println("Weighted Assignment Average: " + WeightedAsgnmentAvg);
		
		//find master score for assignments and tests
		
			double WeightedTotal = ((WeightedAsgnmentAvg + WeightedTestAvg)/2);
		System.out.println("Weighted Total Score: " + WeightedTotal);
		
					
		
		
			
			
		
					
			
			
			

			
			
	
					
					
	}
	
			
			
			
			

}
