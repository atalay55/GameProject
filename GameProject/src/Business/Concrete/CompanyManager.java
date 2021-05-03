package Business.Concrete;

import Business.Abstract.CustomerService;
import DataAccess.Abstract.MemoryDataBaseCustomerdal;
import Entities.Abstract.Customer;

public class CompanyManager implements CustomerService {

	MemoryDataBaseCustomerdal customerDal;
	public CompanyManager(MemoryDataBaseCustomerdal customerDal) {
		super();
		this.customerDal = customerDal;
	}

	@Override
	public void add(Customer customer) {
		customerDal.add(customer);
		
	}

	@Override
	public void delete(Customer customer) {
		customerDal.delete(customer);
		
	}

	@Override
	public void update(Customer customer) {
		customerDal.update(customer);
		
	}

}
