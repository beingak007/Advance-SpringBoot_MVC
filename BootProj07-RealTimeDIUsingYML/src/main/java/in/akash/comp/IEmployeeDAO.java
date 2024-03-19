package in.akash.comp;

import java.util.List;

import in.akash.dto.Employee;

public interface IEmployeeDAO {
	public List<Employee> findAllEmployees() throws Exception;
}
