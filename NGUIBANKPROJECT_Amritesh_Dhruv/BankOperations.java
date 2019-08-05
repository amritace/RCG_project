/**
 * 
 */
package NGUIBANKPROJECT_Amritesh_Dhruv;

import java.util.Scanner;

/**
 * @author drastogi
 *
 */
public class BankOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoverningBankImpl bank = new GoverningBankImpl();
		User person = new User(bank.getUsername(), bank.getPhoneNumber(), bank.getEmpId(), bank.getAddress(), bank.getBal(), bank.getParentBal());
		System.out.println("Enter choice: 1-> housing 2->education 3->personal 4->travel");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		int duration;
		float amount;
		float multiplicationFactor;
		float net;
		
		switch(choice) {
		case 1:
			if(person.balance < 1000000) System.out.println("Not Eligible"); 
			else {
				System.out.println("Enter Duration in years");
				duration= sc.nextInt();
				if(duration < 5){
					System.out.println("Enter amount");
					amount= sc.nextFloat();
						multiplicationFactor= (float) Math.pow((1+(GoverningBank.housingRate/(100))),duration);
						net = amount* multiplicationFactor;
						if(net < 10000000) {
							System.out.println("Net Payable Amount: "+ net);
						} else System.out.println("Not Eligible");
				} else System.out.println("Not Eligible");
			}
			break;
		case 2: 
			if(person.parentBalance < 500000) System.out.println("Not Eligible"); 
			else {
				System.out.println("Enter Duration in years");
				duration= sc.nextInt();
				if(duration < 6){
					System.out.println("Enter amount");
					amount= sc.nextFloat();
						multiplicationFactor= (float) Math.pow((1+(GoverningBank.housingRate/(100))),duration);
						net = amount* multiplicationFactor;
						if(net < 10000000) {
							System.out.println("Net Payable Amount: "+ net);
						} else System.out.println("Not Eligible");
				} else System.out.println("Not Eligible");
			}
			break;
		case 3:
			if(person.balance < 5000000) System.out.println("Not Eligible"); 
			else {
				System.out.println("Enter Duration in years");
				duration= sc.nextInt();
				if(duration < 1){
					System.out.println("Enter amount");
					amount= sc.nextFloat();
						multiplicationFactor= (float) Math.pow((1+(GoverningBank.housingRate/(100))),duration);
						net = amount* multiplicationFactor;
						if(net < 10000000) {
							System.out.println("Net Payable Amount: "+ net);
						} else System.out.println("Not Eligible");
				} else System.out.println("Not Eligible");
			}
			break;
		case 4:
				System.out.println("Enter Duration in years");
				duration= sc.nextInt();
				if(duration < 1){
					System.out.println("Enter amount");
					amount= sc.nextFloat();
						multiplicationFactor= (float) Math.pow((1+(GoverningBank.housingRate/(100))),duration);
						net = amount* multiplicationFactor;
						if(net < 10000000) {
							System.out.println("Net Payable Amount: "+ net);
						} else System.out.println("Not Eligible");
				} else System.out.println("Not Eligible");
			break;
		}
		
		
	}

}
