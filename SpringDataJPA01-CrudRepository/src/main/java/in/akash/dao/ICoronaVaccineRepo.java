package in.akash.dao;

import org.springframework.data.repository.CrudRepository;

import in.akash.bo.CoronaVaccine;

public interface ICoronaVaccineRepo extends CrudRepository<CoronaVaccine, Long> {

}
