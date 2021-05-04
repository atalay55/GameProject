package DataAccess.Abstract;

import Entities.Concrete.Gamer;

public interface MemoryDataBaseGamerDal {

	void add(Gamer gamer);
	void delete(Gamer gamer);
	void update(Gamer gamer);
}
