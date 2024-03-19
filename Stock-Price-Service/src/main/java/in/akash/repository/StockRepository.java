package in.akash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.akash.entity.StockPrice;

public interface StockRepository extends JpaRepository<StockPrice, Integer> {

	public StockPrice findByCompanyName(String companyName);

}
