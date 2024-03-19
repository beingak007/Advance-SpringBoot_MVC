package in.akash.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.akash.model.Person;

public interface IPersonRepo extends JpaRepository<Person, Integer> {

}
