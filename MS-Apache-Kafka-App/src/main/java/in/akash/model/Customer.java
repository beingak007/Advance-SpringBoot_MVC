package in.akash.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author nitin This class holds Model data
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	private Integer customerId;

	private String customerName;

	private String customerEmail;

}
