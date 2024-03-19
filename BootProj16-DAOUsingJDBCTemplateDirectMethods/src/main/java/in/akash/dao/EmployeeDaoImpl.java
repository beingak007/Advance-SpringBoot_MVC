package in.akash.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements IEmployeeDAO {

	private static final String SQL_SELECT_QUERY = "select count(*) from Employee";
	private static final String SQL_SELECT_QUERY_BY_ID = "select ename from Employee where eid=?";
	private static final String GET_EMPLOYEE_BY_NO = "select eid, ename, eage, eaddress, desg, salary from Employee where eid=?";
	private static final String GET_EMPLOYEE_BY_DESG = "select eid, ename, eage, eaddress, desg, salary from Employee where desg in(?, ?) order by salary";
	private static final String SQL_INSERT_QUERY = "insert into Employee(`ename`, `eage`, `eaddress`, `desg`, `salary`) values(?, ?, ?, ?, ?)";
	private static final String ADD_BONUS_EMP_BY_DESG = "update Employee set salary=salary+? where desg=?";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int getEmpsCount() {
		return jdbcTemplate.queryForObject(SQL_SELECT_QUERY, Integer.class);
	}

	@Override
	public String getEmployeeNameByNo(int eno) {
		return jdbcTemplate.queryForObject(SQL_SELECT_QUERY_BY_ID, String.class, eno);
	}

	@Override
	public Map<String, Object> getEmployeeDetailsByNo(int eno) {
		Map<String, Object> map = jdbcTemplate.queryForMap(GET_EMPLOYEE_BY_NO, eno);
		return map;
	}

	@Override
	public List<Map<String, Object>> getEmployeeDetailsByDesignation(String desg1, String desg2) {
		List<Map<String, Object>> empRecords = jdbcTemplate.queryForList(GET_EMPLOYEE_BY_DESG, desg1, desg2);
		return empRecords;
	}

	@Override
	public int insertEmp(String ename, int eage, String eaddress, String desg, int salary) {
		return jdbcTemplate.update(SQL_INSERT_QUERY, ename, eage, eaddress, desg, salary);
	}

	@Override
	public int addBonusToEmpByDesg(String desg, int bonus) {
		return jdbcTemplate.update(ADD_BONUS_EMP_BY_DESG, bonus, desg);
	}
}
