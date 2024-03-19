package in.akash.service;

public interface IPurchaseOrder {

	public String purchase(String[] items, double[] prices, String[] toEmails) throws Exception;

}
