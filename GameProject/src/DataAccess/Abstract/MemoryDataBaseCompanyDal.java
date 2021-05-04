package DataAccess.Abstract;

import Entities.Concrete.Company;

public interface MemoryDataBaseCompanyDal {
	void add(Company company);
	void delete(Company company);
	void update(Company company);

}
