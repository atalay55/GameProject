package Business.Concrete;

import Adaptor.Mernis.MernisCheckManager;
import Business.Abstract.GamerService;
import DataAccess.Abstract.MemoryDataBaseCustomerdal;
import DataAccess.Abstract.MemoryDataBaseGamerDal;
import Entities.Concrete.Gamer;

public class GamerManager implements GamerService{

	MemoryDataBaseGamerDal customerDal;
	MernisCheckManager checkManager;

	public GamerManager(MemoryDataBaseGamerDal customerDal,MernisCheckManager checkManager) {
		super();
		this.customerDal = customerDal;
		this.checkManager=checkManager;
	}

	@Override
	public void add(Gamer gamer) {
		if(checkManager.checkCustomer(gamer)) {
			customerDal.add(gamer);
		}else {
			System.out.println("işlem gerçekleştirlemedi");
		}
		
		
	}

	@Override
	public void delete(Gamer gamer) {
		customerDal.delete(gamer);
		
	}

	@Override
	public void update(Gamer gamer) {
		customerDal.update(gamer);
		
	}

	
	
	

	

	

}