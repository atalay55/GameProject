package Adaptor.Mernis;

import Entities.Concrete.Gamer;

public class MernisCheckManager {
	
	public boolean checkCustomer(Gamer gamer) {
		if(gamer.getName().isEmpty()||gamer.getTcknu().isEmpty()|| gamer.getLastName().isEmpty()) {
			return false;
		}else {
			return true;
		}
		
	}

}
