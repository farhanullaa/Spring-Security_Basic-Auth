package com.spring.security.BasicAuth.Controller;

import com.spring.security.BasicAuth.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserDetailController {

    @Autowired
    UserService userService;

    @GetMapping("/details")
    public String createuserDetails()
    {
       return userService.UserNameService();
    }
}
