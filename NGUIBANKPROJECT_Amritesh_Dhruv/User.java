/**
 * 
 */
package NGUIBANKPROJECT_Amritesh_Dhruv;

/**
 * @author drastogi
 *
 */
public class User {

	/**
	 * @param args
	 */
	String userName;
	String phoneNumber;
	String empId;
	String address;
	float balance;
	float parentBalance;
	
	User(String name, String phone, String id, String addr, float bal, float parentBal) {
		this.userName =name;
		this.phoneNumber = phone;
		this.address=addr;
		this.balance=bal;
		this.parentBalance=parentBal;
	}
}
