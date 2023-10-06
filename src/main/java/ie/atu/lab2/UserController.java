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
    public String getUser(@PathVariable String name, @PathVariable String email)
    {
        return "name: " + name + "email: " + email;
    }

    /*
       http://localhost:8080/registerUserBody
       POST
       Content-Type: application/json

       {
        "name": "nathan",
        "email": "G00379837@atuie"
       }
     */
    @PostMapping("/registerUserBody")
    @ResponseStatus(HttpStatus.CREATED)
    public String register(@RequestBody User user)
    {
        return userService.registerUser(user.getName(), user.getEmail());
    }
}
