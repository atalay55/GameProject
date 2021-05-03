package DataAccess.Abstract;

import Entities.Abstract.Customer;

public interface MemoryDataBaseCustomerdal {

	void add(Customer customer);
	void delete(Customer customer);
	void update(Customer customer);
}
