package Business.Concrete;

import Business.Abstract.GameService;
import DataAccess.Abstract.MemoryDataBaseGameDal;
import Entities.Abstract.Customer;
import Entities.Concrete.Game;

public class GameManager implements GameService{
	
	MemoryDataBaseGameDal gameDal;
	SaleManager saleManager;

	public GameManager(MemoryDataBaseGameDal gameDal,SaleManager saleManager) {
		super();
		this.gameDal = gameDal;
		this.saleManager=saleManager;
	}

	@Override
	public void takeGame(Customer customer) {
		if(saleManager.isItTaked()) {
			gameDal.takeGame(customer);
		}else {
			System.out.println("iþlem basarýsýz");
		}
		
	}

	@Override
	public void sellGame(Customer customer) {
		
		if(saleManager.isItSaled()) {
			gameDal.sellGame(customer);
		}else {
			System.out.println("iþlem basarýsýz");
		}
		
	}

	@Override
	public void discountRateAdd(Game game,double rate) {
		 game.setDiscountRate(rate);
		
	}

	@Override
	public void discountRateDelete(Game game) {
			game.setDiscountRate(0);
		
	}


	@Override
	public void discountRateUpdate(Game game,double rate) {
		 game.setDiscountRate(rate);
		
	}

	


}
