package in.akash.service;

import in.akash.model.Person;
import in.akash.model.PhoneNumber;

public interface IPersonMgmtService {

	public String savePerson(Person person);

	public String savePhoneNumbers(Iterable<PhoneNumber> numbers);

	public Iterable<Person> fetchByPerson();

	public Iterable<PhoneNumber> fetchByPhoneNumber();

	public String deleteByPerson(int personId);

	public String deleteAllPhoneNumbersOfAPerson(int personId);
}
