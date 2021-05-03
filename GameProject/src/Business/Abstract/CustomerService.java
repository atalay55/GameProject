package Business.Abstract;

import Entities.Abstract.Customer;

public interface CustomerService {
	void add(Customer customer);
	void delete(Customer customer);
	void update(Customer customer);
}
