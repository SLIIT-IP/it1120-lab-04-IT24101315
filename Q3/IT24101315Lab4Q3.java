import java.util.Scanner;

public class IT24101315Lab4Q3 {
    public static void main(String[] args) 
    {
      Scanner mall = new Scanner(System.in);
        System.out.print(" Enter a number ");

        int number =mall.nextInt();
	
	String result=(number==0)? "The number is zero. " : 
		      (number >0)? "The number is positive." :
		      "The number is negative. ";

	System.out.println( result);		
        

    }    
}