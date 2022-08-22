package com.supertinder.poc.service;


import com.supertinder.poc.dao.UserAuthDao;
import com.supertinder.poc.dto.UserAuthDTO;
import com.supertinder.poc.models.UserAuth;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAuthService {

    @Autowired
    private UserAuthDao userAuthDao;



    public UserAuth simpleUserAuthCreation(UserAuthDTO userAuthDTO){

        UserAuth userAuth = new UserAuth();
        userAuth.setUserName(userAuth.getUserName());
        userAuth.setPassword(userAuth.getPassword());

        return userAuthDao.save(userAuth);

    }


}
