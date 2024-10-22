package in.akash.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.akash.dao.EmployeeDao;

@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private EmployeeDao dao;

	@Override //[Control flow of runner]: main----> run() -----> continue with business logic
	public void run(String... args) throws Exception {
		dao.saveEmployee();
		System.out.println();
		dao.getEmployee();
		System.out.println();
		dao.deleteEmployee();
	}

}
