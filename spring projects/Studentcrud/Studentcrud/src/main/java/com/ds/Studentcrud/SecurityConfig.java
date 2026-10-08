package com.ds.Studentcrud;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SecurityConfig {

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    UserDetailsService userDetailsService(UserRepository repo){

        return username -> {

            User user =
                    repo.findByUsername(username)
                    .orElseThrow(() ->
                      new UsernameNotFoundException("User Not Found"));

            return org.springframework.security.core.userdetails.User
                    .withUsername(user.getUsername())
                    .password(user.getPassword())
                    .roles("USER")
                    .build();

        };
    }

    @Bean
    AuthenticationManager authenticationManager(
            AuthenticationConfiguration config) throws Exception {

        return config.getAuthenticationManager();

    }

    @Bean
    SecurityFilterChain security(HttpSecurity http)throws Exception{

        http
        .csrf(csrf->csrf.disable())

        .authorizeHttpRequests(auth->auth

            .requestMatchers("/register").permitAll()
            .requestMatchers("/student/fetchdetails").permitAll()

            .anyRequest().authenticated()

        )

        .formLogin(Customizer.withDefaults());

        return http.build();

    }

}
