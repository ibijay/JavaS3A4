import java.util.Scanner;
import java.util.InputMismatchException;

public class BasicCalc  {

	public static void main(String[] args) throws MyInvalidOperator{
		
		int v1,v2,result;
		String op;
		Scanner input = new Scanner(System.in);
		try{
			System.out.println("Please enter a Values for calculation");
			v1 = input.nextInt();
			v2 = input.nextInt();
			System.out.println("Please enter an Operator for calculation");
			op = input.next();
			
			switch(op){
			case "+":
				result=v1+v2;
				System.out.println("Result of :"+v1+op+v2+"="+result);
				break;
			case "-":
				result=v1-v2;
				System.out.println("Result of :"+v1+op+v2+"="+result);
				break;
			case "*":
				result=v1*v2;
				System.out.println("Result of :"+v1+op+v2+"="+result);
				break;
			case "/":
				result=v1/v2;
				System.out.println("Result of :"+v1+op+v2+"="+result);
				break;
			default:
				throw new MyInvalidOperator("Invliad Operator for Calculation");
			}
			
		}
		catch(ArithmeticException e){
			System.out.println("Please enter a non-zero value for Division");
		}
		catch(InputMismatchException e){
			System.out.println("Please enter Integers only for Calculation");
		}
		
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Something went wrong "+e);
		}
		finally{
			input.close();
		}
		
	}
	
}
