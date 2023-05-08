package com.example.loan.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.loan.model.UserModel;
import com.example.loan.dto.LoginDTO;
import com.example.loan.dto.UserDTO;
import com.example.loan.repository.UserRepository;
import com.example.loan.response.LoginMesage;
import com.example.loan.service.UserService;
@Service
public class UserIMPL implements UserService{
     @Autowired
     UserRepository ur;
    
     @Override
     public String addUser(UserDTO userDTO) {
  
         UserModel user = new UserModel(
  
                 userDTO.getId(),
                 userDTO.getEmail(),
                 userDTO.getPassword(),
                 userDTO.getUsername(),
                 userDTO.getMobileNumber(),
                 userDTO.getUserRoll()
  
         );
         ur.save(user);
  
         return user.getUsername();
     }
     @Override
     public LoginMesage  loginUser(LoginDTO loginDTO) {
    	 
         UserModel user1 = ur.findByUsername(loginDTO.getUsername());
         if (user1 != null) {
             String password = loginDTO.getPassword();
     
             if (password.equals(password)) {
                 Optional<UserModel> user = ur.findOneByUsernameAndPassword(loginDTO.getUsername(), password);
                 if (user.isPresent()) {
                     return new LoginMesage("Login Success", true);
                 } else {
                     return new LoginMesage("Login Failed", false);
                 }
             } else {
  
                 return new LoginMesage("password Not Match", false);
             }
         }else {
             return new LoginMesage("Email not exits", false);
         }
  
  
     }
}
