package DataAccess.Concrete.MemoryDataBase;

import DataAccess.Abstract.MemoryDataBaseGameDal;
import Entities.Abstract.Customer;
import Entities.Concrete.Game;

public class MemoryGameDal implements  MemoryDataBaseGameDal {


	@Override
	public void takeGame(Customer customer) {
		System.out.println("oyun alýndý");
		
	}

	@Override
	public void sellGame(Customer customer) {
		System.out.println("oyun satýldý");
		
	}

	@Override
	public void discountRateAdd(Game game) {
		System.out.println(game.getDiscountRate()+" "+" yeni oran eklendidi");
		
	}

	@Override
	public void discountRateDelete(Game game) {
		System.out.println("indirim silindi");
		
	}

	@Override
	public void discountRateUpdate(Game game) {
		System.out.println("indirim güncellendi");
		
	}

}
