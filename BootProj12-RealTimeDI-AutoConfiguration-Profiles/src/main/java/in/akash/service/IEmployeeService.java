package in.akash.service;

import java.util.List;

import in.akash.dto.EmployeeDTO;

public interface IEmployeeService {
	public List<EmployeeDTO>  fetchEmpsByDesgs(String desgs[])throws Exception;
}
