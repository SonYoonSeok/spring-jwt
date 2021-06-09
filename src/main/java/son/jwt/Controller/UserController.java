package son.jwt.Controller;

import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.web.bind.annotation.*;
import son.jwt.Dto.UserDto;
import son.jwt.Service.JwtUserDetailService;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final JwtUserDetailService userService;

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public Response signup(@RequestBody UserDto userDto) {
        Response response = new Response();

        userService.signup(userDto);
        response.setMessage("회원가입 성공");

        return response;
    }
}
