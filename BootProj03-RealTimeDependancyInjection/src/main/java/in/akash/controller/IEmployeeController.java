package in.akash.controller;

import java.util.List;

import in.akash.vo.EmployeeVO;

public interface IEmployeeController {

	String save(EmployeeVO vo);

	List<EmployeeVO> findAllEmployees();

	EmployeeVO findById(Integer eid);

	String updateById(Integer eid);

	String deleteById(Integer eid);

}
