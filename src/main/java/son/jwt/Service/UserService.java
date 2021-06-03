package son.jwt.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import son.jwt.DTO.UserRequest;
import son.jwt.Entity.User;
import son.jwt.Repository.UserRepository;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public void signup(UserRequest request) {
        userRepository.save(
                User.builder()
                        .email(request.getEmail())
                        .password(request.getPassword())
                        .name(request.getName())
                        .build());

    }
}
