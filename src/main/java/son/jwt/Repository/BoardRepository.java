package son.jwt.Repository;

import org.springframework.data.repository.CrudRepository;
import son.jwt.Entity.Board;

public interface BoardRepository extends CrudRepository<Board, Integer> {

}
