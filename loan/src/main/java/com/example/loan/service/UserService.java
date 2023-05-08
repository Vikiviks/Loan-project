package com.example.loan.service;

import com.example.loan.dto.LoginDTO;
import com.example.loan.dto.UserDTO;
import com.example.loan.response.LoginMesage;

public interface UserService {
       String addUser(UserDTO userDTO);
       LoginMesage loginUser(LoginDTO loginDTO);
}
