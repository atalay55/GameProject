import java.sql.Date;

import Adaptor.Mernis.MernisCheckManager;
import Business.Concrete.GameManager;
import Business.Concrete.GamerManager;
import Business.Concrete.SaleManager;
import DataAccess.Abstract.MemoryDataBaseCustomerdal;
import DataAccess.Concrete.MemoryDataBase.MemoryGameDal;
import DataAccess.Concrete.MemoryDataBase.MemoryGamerDal;
import Entities.Abstract.Customer;
import Entities.Concrete.Company;
import Entities.Concrete.Gamer;

public class Main {

	public static void main(String[] args) {
	
		Gamer gamer = new Gamer();
		
		gamer.setId(1);
		gamer.setName("fatih");
		gamer.setTcknu("1546813568");
		gamer.setLastName("");
		gamer.setBirthOfDate(new Date(2000));
		gamer.setCustomerNu(1568642);
		
		
		
		Company company = new Company();
		company.setId(2);
		company.setCustomerNu(154689);
		company.setCompanyName("atalay");
	
		GamerManager gamerManager = new GamerManager(new MemoryGamerDal(),new MernisCheckManager());
		gamerManager.add(gamer);
		gamerManager.delete(gamer);
		GameManager gameManager= new GameManager(new MemoryGameDal(),new SaleManager());
		gameManager.sellGame(company);
		
		

	
	}

}