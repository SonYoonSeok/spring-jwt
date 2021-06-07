package son.jwt.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import son.jwt.Repository.UserRepository;

@RequiredArgsConstructor
@Service
public class AuthService {

    private final UserRepository userRepository;
}
