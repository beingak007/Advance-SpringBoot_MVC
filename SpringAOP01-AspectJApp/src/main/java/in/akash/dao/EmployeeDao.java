package in.akash.dao;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {

	public void saveEmployee() {
		System.out.println("Employee Object is saved...");
	}

	public void getEmployee() {
		System.out.println("Employee retrieved from Database");
	}

	public String deleteEmployee() {
		System.out.println("Record got deleted...!");
		return "Employee got deleted...!";
	}

}