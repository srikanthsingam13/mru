package com.beta.EmployeeCrud;



import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {

    private final UserRepository repo;
    private final PasswordEncoder encoder;

    public UserController(UserRepository repo,
                          PasswordEncoder encoder) {

        this.repo = repo;
        this.encoder = encoder;
    }

    @PostMapping("/register")
    public String register(@RequestBody User user){

        user.setPassword(
                encoder.encode(user.getPassword()));

        repo.save(user);

        return "Registration Successful";
    }

    @GetMapping("/hello")
    public String hello(){

        return "Welcome User";

    }
    
	/*
	 * @GetMapping("/welcome") public String welcome() { return
	 * "hello user ur authenticated....."; }
	 */

}
