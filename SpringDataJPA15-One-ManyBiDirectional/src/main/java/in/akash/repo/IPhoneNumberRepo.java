package in.akash.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.akash.model.PhoneNumber;

public interface IPhoneNumberRepo extends JpaRepository<PhoneNumber, Integer> {

}
