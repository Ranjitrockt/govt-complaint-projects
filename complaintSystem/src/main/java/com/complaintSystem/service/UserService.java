package com.complaintSystem.service;

import com.complaintSystem.dto.UserDto;
import com.complaintSystem.entity.User;

public interface UserService {
       User ragisterUser(UserDto dto );

  User   loginUserByEmail(String email, String password);

    User  loginUserByMobile(String mobile, String password);


     User getUserById(Long Id);
}
