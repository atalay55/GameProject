package DataAccess.Concrete.MemoryDataBase;

import DataAccess.Abstract.MemoryDataBaseCustomerdal;
import Entities.Abstract.Customer;

public class MemoryGamerDal implements MemoryDataBaseCustomerdal  {

	@Override
	public void add(Customer customer) {
		System.out.println(customer+"  "+"eklendi");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer+"  "+"silindi");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer+"  "+"guncellendi");
		
	}
	

}
