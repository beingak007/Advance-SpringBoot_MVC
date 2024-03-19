package in.akash.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.akash.config.model.customer.Customer;
import in.akash.config.model.product.Product;
import in.akash.repo.customer.ICustomerRepository;
import in.akash.repo.product.IProductRepository;

@RestController
@RequestMapping("/api")
public class MultipleDataRestController {

	@Autowired
	private IProductRepository productRepo;

	@Autowired
	private ICustomerRepository customerRepo;

	@GetMapping("/products")
	public List<Product> findAllProducts() {
		return productRepo.findAll();

	}

	@GetMapping("/customers")
	public List<Customer> findAllCustomers() {
		return customerRepo.findAll();

	}
}
