/**
 * 
 */
package NGUIBANKPROJECT_Amritesh_Dhruv;

import java.util.Scanner;

/**
 * @author drastogi
 *
 */
public class GoverningBankImpl implements GoverningBank{

	/**
	 * @param args
	 */
	String name; 
	String phone; 
	String id; 
	String addr; 
	int mp; 
	float bal; 
	float parentBal;
	Scanner sc = new Scanner(System.in);

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		System.out.println("Enter username");
		return sc.nextLine();
		
	}

	@Override
	public String getPhoneNumber() {
		// TODO Auto-generated method stub
		System.out.println("Enter phonenumber");
		return sc.nextLine();
		
	}

	@Override
	public String getEmpId() {
		// TODO Auto-generated method stub
		System.out.println("Enter empid");
		return sc.nextLine();
		
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		System.out.println("Enter address");
		return sc.nextLine();
	}

		
	public float getParentBal() {
		System.out.println("Enter parentBal");
		return sc.nextFloat();
	}
	
	public float getBal() {
		System.out.println("Enter Bal");
		return sc.nextFloat();
	} 
	
	@Override
	public void generateLoan() {
		// TODO Auto-generated method stub
		
	}
	

}
