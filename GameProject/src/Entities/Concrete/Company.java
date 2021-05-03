package Entities.Concrete;

import Entities.Abstract.Customer;


public class Company implements Customer {
	private int id;
	private long customerNu;
	private String companyName;

	public Company() {
	};

	public Company(int id, long customerNu) {
		this.id = id;
		this.customerNu = customerNu;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getCustomerNu() {
		return customerNu;
	}

	public void setCustomerNu(long customerNu) {
		this.customerNu = customerNu;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
