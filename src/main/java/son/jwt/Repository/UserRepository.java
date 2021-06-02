package son.jwt.Repository;

import org.springframework.data.repository.CrudRepository;
import son.jwt.Entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
}
