import java.util.ArrayList;
import java.util.Iterator;

public class main_refactor {
	

	public static void main(String[] args) 
	{
		double assignmentfinalgrade;
		double testfinalgrade;
		
		ArrayList<Assignment> assignments11 = new ArrayList<Assignment>();
		assignments11.add(new Assignment(55,.05));
		assignments11.add(new Assignment(65,.10));
		assignments11.add(new Assignment(65,.15));
		assignments11.add(new Assignment(60,.25));
		assignments11.add(new Assignment(55,.25));
		assignments11.add(new Assignment(50,.20));
		Iterator<Assignment> iterator = assignments11.iterator();
		
		assignmentfinalgrade = 0;
		while(iterator.hasNext())
		{
			Assignment a = iterator.next();
			System.out.println("Assignment Grade and Weight: " + a.getGrade() + "  " + a.getWeight());
//			System.out.println("Weight " + a.getWeight());
			assignmentfinalgrade = assignmentfinalgrade + (a.getGrade() * a.getWeight());
			
//			System.out.println("Total Average Assignment Score = " + sum);
//			System.out.println("Final Assignment Grade " + a.getFinal_Score());
		}
		System.out.println("\nTotal Average Assignment Score = " + assignmentfinalgrade);
		System.out.println("------------------------------");
		
		testfinalgrade = 0;
		ArrayList<Assignment> tests1 = new ArrayList<Assignment>();
		tests1.add(new Assignment(75,.10));
		tests1.add(new Assignment(95,.20));
		tests1.add(new Assignment(85,.25));
		tests1.add(new Assignment(55,.25));
		tests1.add(new Assignment(65,.10));
		tests1.add(new Assignment(70,.10));
		Iterator<Assignment> test = tests1.iterator();
		
		while(test.hasNext())
		{
			Assignment b = test.next();
			System.out.println("Test Grade and Weight " + b.getGrade() + "  " + b.getWeight());
//			System.out.println("Weight " + b.getWeight());
			testfinalgrade = testfinalgrade + (b.getGrade() * b.getWeight());
		}	
			System.out.println("\nTotal Average Test Score = " + testfinalgrade);
		
			System.out.println("------------------------------");
			System.out.println("Total Score Overall = " + ((assignmentfinalgrade+testfinalgrade)/2));
		
		
		
		
		
		
		
		
		
		
	}

}
