package son.jwt.Service;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import son.jwt.Entity.User;
import son.jwt.Repository.UserRepository;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public void signup(User user) {
        userRepository.save(User.builder()
                .email(user.getEmail())
                .password(user.getPassword())
                .name(user.getName())
                .build()
        );
    }
}
