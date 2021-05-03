package Business.Concrete;

import Adaptor.Mernis.MernisCheckManager;
import Business.Abstract.GamerService;
import DataAccess.Abstract.MemoryDataBaseCustomerdal;
import Entities.Concrete.Gamer;

public class GamerManager implements GamerService{

	MemoryDataBaseCustomerdal customerDal;
	MernisCheckManager checkManager;

	public GamerManager(MemoryDataBaseCustomerdal customerDal,MernisCheckManager checkManager) {
		super();
		this.customerDal = customerDal;
		this.checkManager=checkManager;
	}

	@Override
	public void add(Gamer gamer) {
		if(checkManager.checkCustomer(gamer)) {
			customerDal.add(gamer);
		}else {
			System.out.println("iþlem gerçekleþtirlemedi");
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