package in.akash.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.akash.model.Tourist;

public interface ITouristRepo extends JpaRepository<Tourist, Integer> {

}