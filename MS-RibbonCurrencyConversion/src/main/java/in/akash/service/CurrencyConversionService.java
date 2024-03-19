package in.akash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.akash.beans.CurrencyCostBean;
import in.akash.beans.CurrencyExchangeBean;
import in.akash.feign.CurrencyExchangeClient;

@Service
public class CurrencyConversionService {

	@Autowired
	private CurrencyExchangeClient ceClient;

	public CurrencyCostBean convertCurrency(String from, String to, Double quantity) {
		CurrencyCostBean bean = new CurrencyCostBean();

		CurrencyExchangeBean currencyExchangeBean = ceClient.invokeCeApi(from, to);

		Double currencyCost = currencyExchangeBean.getCurrencyValue();

		Double currencyTotalAmt = quantity * currencyCost;

		bean.setCurrencyFrom(from);
		bean.setCurrencyTo(to);
		bean.setTotalCurrencyAmt(currencyTotalAmt);
		bean.setPort(currencyExchangeBean.getPort());

		return bean;
	}
}
