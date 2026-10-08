package com.example.SpringSecurityJwtDemo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/*import com.example.securityjwt.dto.LoginRequest;
import com.example.securityjwt.dto.RegisterRequest;
import com.example.securityjwt.entity.User;
import com.example.securityjwt.repository.UserRepository;
import com.example.securityjwt.security.JwtUtil;*/

@RestController
public class AuthController {

    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest request) {

        if (repository.findByUsername(request.getUsername()).isPresent()) {
            return "Username already exists";
        }

        User user = new User();

        user.setUsername(request.getUsername());

        user.setPassword(passwordEncoder.encode(request.getPassword()));

        repository.save(user);

        return "User Registered Successfully";
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {

        User user = repository.findByUsername(request.getUsername())
                .orElse(null);

        if (user == null) {
            return "Invalid Username";
        }

        if (!passwordEncoder.matches(request.getPassword(),
                user.getPassword())) {
            return "Invalid Password";
        }

        return jwtUtil.generateToken(user.getUsername());
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Spring Security JWT";
    }
    
    @GetMapping("/hello")
    public String sayHello()
    {
    	return "hey hello";
    }
    
    
    
}