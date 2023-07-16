package com.aleister.authBasic.controller;

import com.aleister.authBasic.dto.entity.PersonEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class LoginController {
    @PostMapping("user")
    public PersonEntity login(@RequestParam("user") String username, @RequestParam("password") String pwd) {

       // String token = getJWTToken(username);
        PersonEntity user = new PersonEntity();
        user.setUsername(username);
        //user.setToken(token);
        return user;
     //TODO VALIDAR USER
    }

}
