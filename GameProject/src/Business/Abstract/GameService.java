package Business.Abstract;

import Entities.Abstract.Customer;
import Entities.Concrete.Game;

public interface GameService {
	void takeGame(Customer customer);
	void sellGame(Customer customer);
	void discountRateAdd(Game game,double rate);
	void discountRateDelete(Game game );
	void discountRateUpdate( Game game,double rate);
	
}
