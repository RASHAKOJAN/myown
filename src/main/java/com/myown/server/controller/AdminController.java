package com.myown.server.controller;

import com.myown.server.model.User;
import com.myown.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    private UserService userService;


    @PutMapping("/api/admin/user-update")
    public ResponseEntity<?> updateUser(@RequestBody User user) {

        User existUser = userService.findByUsername(user.getUsername());

        if (existUser != null && !existUser.getId().equals(user.getId())) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(userService.updateUser(user), HttpStatus.CREATED);

    }


    @PostMapping("/api/admin/user-delete")
    public ResponseEntity<?> deleteUser(@RequestBody User user) {

        if (userService.findByUsername(user.getUsername()) != null) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }

        userService.deleteUser(user.getId());
        return new ResponseEntity<>(HttpStatus.OK);

    }
}
