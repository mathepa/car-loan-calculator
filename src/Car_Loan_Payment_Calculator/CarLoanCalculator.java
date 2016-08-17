package Car_Loan_Payment_Calculator;

public class CarLoanCalculator {

	public static void main(String[] args) {
		/*
		 * In this project, we will write a program that will
		 * calculate the monthly car payment a user should expect
		 * to make after taking out a car loan.
		 * In our program, we will include the following:
		 * The price of the car amount in dollars amount
		 * An interest rate of the loan in percentage (%)
		 * The length of the loan (in years)
		 * The down payment that the user will make as a decimal 
		 */
		
		// declaring our variables
		double carPrice = 20000.00;// the car costs $20,000
		double interestRate = 0.065; // the interest rate is 6.5% 
		int loanLength = 5; // the car must be paid in 5 years
		double downPayment = 3500.00; // the down payment is $3500
		
		
		if(loanLength <=0 || interestRate <= 0){
			System.out.println("Erro! You must satisfy the minimum requirements in order to buy the car");
		} else if(downPayment >= carPrice) {
			System.out.print("You have enough money to pay the car in full");
		} else {
				double remainingBalance = carPrice - downPayment;
				int months = loanLength * 12;
				double monthlyBalance = remainingBalance / months;
				double accumulatedInterest = (monthlyBalance * interestRate);
				double monthlyPayment = monthlyBalance + accumulatedInterest;
				System.out.println("Your monthly payment is $" +monthlyPayment + " USD");
				
			}
		}

	}


