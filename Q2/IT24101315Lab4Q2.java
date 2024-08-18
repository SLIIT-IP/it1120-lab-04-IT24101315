import java.util.Scanner;

public class IT24101315Lab4Q2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);	

		System.out.print("Please enter exam marks (out of 100) :");
		double exm = input.nextDouble();
		if(exm>=0 && exm<=100)
		{
			System.out.print("Please enter lab submission marks (out of 100) :");
			double lbm = input.nextDouble();
			if(lbm>=0 && lbm<=100)
			{
				System.out.print("Please enter the percentage given for the exam :");
				double exmp = input.nextDouble();

				System.out.print("Please enter the percentage given for the lab submission :");
				double lbmp = input.nextDouble();
				if(exmp + lbmp ==100)
				{
					double ex = exm*exmp/100;
					double lb = lbm*lbmp/100;
					double fm = ex+lb;

					System.out.println("Final Exam Mark is : "+ fm);

				
				}else{
					System.out.println("The percentage must add up to 100.Terminating program.");
				}
			}else{
				System.out.println("Invalid input for lab submission marks.Terminating program.");
			}
			
		}else{
			System.out.println("Invalid input for exam marks.Terminating program.");
		}
	}
}