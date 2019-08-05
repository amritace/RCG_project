package NGUIBANKPROJECT_Amritesh_Dhruv;

//interface for loans
public interface GoverningBank {	
	//bank account fields
	
	float housingRate = 6;
	float educationRate = 8;
	float personalRate = 5;
	float travelRate = 1;
	
	String getUsername();
	
	String getPhoneNumber();
	
	String getEmpId();
	
	String getAddress();
	
	void generateLoan();
	
}
