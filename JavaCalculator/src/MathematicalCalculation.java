

import java.util.Scanner;

public class MathematicalCalculation {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		MathematicalCalculation mathCalc = new MathematicalCalculation();
		mathCalc.runProcedure();
	}
	
	public void runProcedure() {
		System.out.println("...Welcome to calculators..");
		System.out.println(" Press 1 for Addition \n Press 2 for Subtraction \n Press 3 for Multiplication \n Press 4 for Division");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		choiceSelection(choice);
		
	}
	
	public void choiceSelection(int choice) {
		switch (choice) {
		case 1:System.out.println("You have selected Additon");
			   add();
			break;
		case 2:System.out.println("You have selected Subtraction");
				sub();
		break;
		case 3:System.out.println("You have selected Multiplication");
				multiply();
		break;
		case 4:System.out.println("You have selected Division");
				divide();
		break;

		default:System.err.println("Your input is invalid");
				isContinue();
				break;
		}
		
	}
	public void isContinue() {
		System.out.println("Do you want to continue \n Press yes to continue ");
		String toContinue = sc.next();
		if(toContinue.equalsIgnoreCase("yes")) {
			runProcedure();
		}else {
			System.out.println("Thanks for using calculators");
			System.exit(0);
		}
	}
	public void add() {
		System.out.println("Enter the 1st number");
		int num1 = sc.nextInt();
		System.out.println("Enter the 2nd number");
		int num2 = sc.nextInt();
		int sum = num1+num2;
		answer(sum);
	}
	public void sub() {
		System.out.println("Enter the 1st number");
		int num1 = sc.nextInt();
		System.out.println("Enter the 2nd number");
		int num2 = sc.nextInt();
		if(num1>num2) {
			int sub = num1-num2;
			answer(sub);	
		}else {
			System.err.println("Your 1st number should be greater than 2nd number");
			isContinue();
		}
		
	}
	
	public void multiply() {
		System.out.println("Enter the 1st number");
		int num1 = sc.nextInt();
		System.out.println("Enter the 2nd number");
		int num2 = sc.nextInt();
		int mul = num1*num2;
		answer(mul);
	}
	
	public void divide() {
		System.out.println("Enter the 1st number");
		int num1 = sc.nextInt();
		System.out.println("Enter the 2nd number");
		int num2 = sc.nextInt();
		int div = num1/num2;
		answer(div);
	}
	
	public void answer(int answer) {
		System.out.println("Your answer is:"+answer);
		isContinue();
	}
	

}
