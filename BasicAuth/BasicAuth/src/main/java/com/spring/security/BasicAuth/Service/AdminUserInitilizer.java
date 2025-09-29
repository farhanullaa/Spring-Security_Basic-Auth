package com.spring.security.BasicAuth.Service;


import com.spring.security.BasicAuth.Entity.users;
import com.spring.security.BasicAuth.Repository.UserDetailsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class AdminUserInitilizer {

    @Bean
    public CommandLineRunner createComandLine(UserDetailsRepository userNameRepository, PasswordEncoder passwordEncoder) {

        return args -> {
            if (userNameRepository.findByUsername("admin").isEmpty()) {
                users admin = new users();
                admin.setUsername("admin");
                admin.setPassword(passwordEncoder.encode("admin123"));
                admin.setRole("ROLE_ADMIN");

                userNameRepository.save(admin);
                System.out.println("Default admin user created");
            }
        };
    }
}
