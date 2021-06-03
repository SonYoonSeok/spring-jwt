package son.jwt.Repository;

import org.springframework.data.repository.CrudRepository;
import son.jwt.Entity.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {

    Optional<User> findByEmail(String email);
}
