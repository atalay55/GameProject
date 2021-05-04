package DataAccess.Concrete.MemoryDataBase;
import DataAccess.Abstract.MemoryDataBaseGamerDal;
import Entities.Concrete.Gamer;


public class MemoryGamerDal implements MemoryDataBaseGamerDal  {

	
	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.getName()+"  "+"eklendi");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getName()+"  "+"silindi");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getName()+"  "+"guncellendi");
		
	}
	

}
