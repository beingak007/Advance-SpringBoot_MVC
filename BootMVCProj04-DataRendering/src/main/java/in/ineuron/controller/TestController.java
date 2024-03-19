package in.ineuron.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import in.ineuron.model.Employee;

@Controller
public class TestController {

	@GetMapping
	public String showHome() {
		return "home";
	}

	@GetMapping("/report")
	public String showReport(Map<String, Object> model) {

		model.put("name", "kohli");
		model.put("age", 49);
		model.put("address", "RCB");

		String[] countryNames = new String[] { "IND", "USA", "Russia", "UK" };
		model.put("countryNames", countryNames);

		List<String> subjetList = List.of("java", "jee", "spring", "springboot", "hibernate");
		model.put("subjectList", subjetList);

		Set<Long> mobileSet = Set.of(9999777888L, 6665554443L, 888777654L);
		model.put("mobileSet", mobileSet);

		Map<String, Number> idsMap = Map.of("aadhaar", 456783, "voterId", 543456L, "panNo", 4534524L);
		model.put("idsMap", idsMap);

		List<Employee> empList = List.of(new Employee(10, "sachin", "batsman", 23456.0),
				new Employee(7, "dhoni", "keeper", 453456.0), new Employee(18, "kohli", "captain", 3456756.0));
		model.put("empList", empList);

		Employee employee = new Employee(45, "rohith", "batsman", 434567.0);
		model.put("employee", employee);

		return "show_report";
	}
}
