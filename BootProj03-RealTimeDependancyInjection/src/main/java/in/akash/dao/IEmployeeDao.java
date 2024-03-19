package in.akash.dao;

import java.util.List;

import in.akash.bo.EmployeeBO;

public interface IEmployeeDao {
	
	String save(EmployeeBO bo);

	List<EmployeeBO> findAllEmployees();

	EmployeeBO findById(Integer eid);

	String updateById(Integer eid);

	String deleteById(Integer eid);

}
