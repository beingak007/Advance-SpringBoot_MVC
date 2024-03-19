package in.akash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.akash.entity.StockPrice;
import in.akash.exception.StockNotFoundException;
import in.akash.repository.StockRepository;

@Service
public class StockPriceServiceImpl implements IStockPriceService {

	@Autowired
	private StockRepository repo;

	@Override
	public Double findByCompanyName(String companyName) {

		StockPrice stockPrice = repo.findByCompanyName(companyName);
		if (stockPrice == null) {
			throw new StockNotFoundException("Company not available");
		}
		return stockPrice.getCompanyPrice();
	}

}
