package DataAccess.Concrete.MemoryDataBase;

import DataAccess.Abstract.MemoryDataBaseCompanyDal;
import DataAccess.Abstract.MemoryDataBaseCustomerdal;
import Entities.Abstract.Customer;
import Entities.Concrete.Company;

public class MemoryCompanyDal implements MemoryDataBaseCompanyDal{

	@Override
	public void add(Company company) {
		System.out.println("eklendi");
		
	}

	@Override
	public void delete(Company company) {
		System.out.println(company.getCompanyName()+"  "+"silindi");
		
	}

	@Override
	public void update(Company company) {
		System.out.println( company.getCompanyName()+"  " +"guncellendi");
		
	}


}
