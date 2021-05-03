package Business.Abstract;

import Entities.Concrete.Company;

public interface CompanyService {
	void add(Company company);
	void delete(Company company);
	void update(Company company);
}
