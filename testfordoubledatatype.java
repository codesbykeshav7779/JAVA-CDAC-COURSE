import java.util.Scanner;
public class testfordoubledatatype {

	public static void main(String[] args) {
		
    Scanner sc =new 
    		Scanner(System.in);
     
    System.out.println("Enter the first number:");
          if (sc.hasNextDouble() && !sc.hasNextInt())   {
        	  double num1=sc.nextDouble();
        	  System.out.println("Enter the second number:");
        	  if (sc.hasNextDouble() && !sc.hasNextInt())   {
            	  double num2=sc.nextDouble();
            	  System.out.println("sum of two numbers is :"+num1 +num2);
            	  System.out.println("avg of two numbers is :"+(num1 +num2)/2);
              }
          }
          else {
        	  System.out.println("enter the valid double number");
          }
         
          
          
         
	}

}
