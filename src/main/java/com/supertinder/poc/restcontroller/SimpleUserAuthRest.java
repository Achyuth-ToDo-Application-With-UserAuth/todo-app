package com.supertinder.poc.restcontroller;

import com.supertinder.poc.dto.UserAuthDTO;
import com.supertinder.poc.models.UserAuth;
import com.supertinder.poc.service.UserAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

@RestController
@RequestMapping("/userauth")
public class SimpleUserAuthRest {

    @Autowired
    private UserAuthService userAuthService;

    @PostMapping
    public ResponseEntity<UserAuth> createSimpleUser(@RequestBody UserAuthDTO userAuthDTO){

        UserAuth userAuth = userAuthService.simpleUserAuthCreation(userAuthDTO);

        return new ResponseEntity<>(userAuth, HttpStatus.OK);

    }

}
