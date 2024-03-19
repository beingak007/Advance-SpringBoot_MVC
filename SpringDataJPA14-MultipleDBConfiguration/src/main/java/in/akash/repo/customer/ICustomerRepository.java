package in.akash.repo.customer;

import org.springframework.data.jpa.repository.JpaRepository;

import in.akash.config.model.customer.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

}
