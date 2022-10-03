import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("enter the last two digits of his/her student ID.");
		Scanner input = new Scanner (System.in);
		int userinput = input.nextInt();
		int digit1 = userinput / 10;
		int digit2 = userinput % 10;
		double product = digit1*digit2;
		double sum = digit1+digit2;
		double average = digit1+digit2/2;
		int max = Math.max(digit1, digit2);
		System.out.println("product "+digit1+ " * "+ digit2+" is: "+ product);
		System.out.println("sum "+digit1+ " + "+ digit2+" is: "+ sum);
		System.out.println("average "+digit1+ " and "+ digit2+" is: "+average );
		System.out.println("maximum is "+ max);


				
				
			}

		

	}


