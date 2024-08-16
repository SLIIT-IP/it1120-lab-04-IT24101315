import java.util.Scanner;

public class IT24101315Lab4Q1 {
    public static void main(String[] args) 
    {
      Scanner mall = new Scanner(System.in);
        System.out.print("Enter a number");

        int number =mall.nextInt();

        if(number==0){
            System.out.println("The number is zero");
    
        }else if(number>0){
            System.out.println("The number is : positive");

        }else{
            System.out.println("The number is : Negative");
        }

    }    
}
