package in.akash.dao;

import java.util.List;

import in.akash.bo.EmployeeBO;

public interface IEmployeeDao {
	public  List<EmployeeBO>  getEmpsByDesg(String cond)throws Exception;
}
