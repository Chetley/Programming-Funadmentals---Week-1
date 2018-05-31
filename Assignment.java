
public class Assignment {

	private double grade;
	private double weight;
	private double Final_Score;
//	static double sum = 0;
	

	public Assignment(double grade, double weight)
	{
		this.grade = grade;
		this.weight = weight;
	}
	public double getGrade()
	{
	 return grade;
	}
	public double getWeight()
	{
	 return weight;
	}
	public double getFinal_Score()
	{
		return grade * weight;
	}
	

	}

