package ie.atu.lab2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController
{
    private final UserService userService;

    @Autowired
    public UserController(UserService userService)
    {
        this.userService = userService;
    }

    //http://localhost:8080/user/nathan/g00379837@atuie
    @GetMapping("user/{name}/{email}")
    public void getUser(@PathVariable String name, @PathVariable String email)
    {
        userService.setName(name);
        userService.setEmail(email);
    }

    @PostMapping("/registerUserBody")
    @ResponseStatus(HttpStatus.CREATED)
    public String register(@RequestBody UserService userService)
    {
        return userService.registerUser(userService.getName(), userService.getEmail());
    }
}
