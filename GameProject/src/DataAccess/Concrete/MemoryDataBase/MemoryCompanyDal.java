package DataAccess.Concrete.MemoryDataBase;

import DataAccess.Abstract.MemoryDataBaseCustomerdal;
import Entities.Abstract.Customer;

public class MemoryCompanyDal implements MemoryDataBaseCustomerdal {

	@Override
	public void add(Customer customer) {
		System.out.println("eklendi");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("silindi");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("güncellendi");
		
	}

}
