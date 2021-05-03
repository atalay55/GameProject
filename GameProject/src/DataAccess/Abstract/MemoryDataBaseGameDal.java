package DataAccess.Abstract;

import Entities.Abstract.Customer;
import Entities.Concrete.Game;

public interface MemoryDataBaseGameDal {

	void takeGame(Customer customer);
	void sellGame(Customer customer);
	void discountRateAdd(Game game);
	void discountRateDelete(Game game);
	void discountRateUpdate(Game game);
}
