package son.jwt.Controller;

import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import son.jwt.DTO.UserRequest;
import son.jwt.Entity.User;
import son.jwt.Service.UserService;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public Response signup(@RequestBody User user) {
        Response response = new Response();

        try {
            userService.signup(user);
            response.setMessage("회원가입 성공");
        } catch (Exception e) {
            response.setMessage("회원가입 실패");
        }

        return response;
    }
}
