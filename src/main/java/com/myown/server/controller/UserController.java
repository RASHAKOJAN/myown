package com.myown.server.controller;


import com.myown.server.model.Role;
import com.myown.server.model.User;
import com.myown.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/api/user/register")
    public ResponseEntity<?> register(@RequestBody User user) {

        if (userService.findByUsername(user.getUsername()) != null) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }

        user.setRole(Role.USER);
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);

    }

    @GetMapping("/api/user/login")
    public ResponseEntity<?> getUser(Principal principal) {
        if (principal == null || principal.getName() == null) {
            return ResponseEntity.ok(principal);
        }

        return new ResponseEntity<>(userService.findByUsername(principal.getName()), HttpStatus.OK);

    }


}
