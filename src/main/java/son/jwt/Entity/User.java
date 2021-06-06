package son.jwt.Entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.*;
import son.jwt.Role.UserRole;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Getter
@Entity
@Table(name = "User")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;

    @Column(name = "email")
    @Email(message = "올바른 이메일 주소를 입력해주세요.")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private UserRole userRole = UserRole.ROLE_NOT_PERMITTED;

    @Builder
    public User(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }
}
