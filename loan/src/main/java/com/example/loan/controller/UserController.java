package com.example.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.loan.dto.LoginDTO;
import com.example.loan.dto.UserDTO;
import com.example.loan.model.UserModel;
import com.example.loan.repository.UserRepository;
import com.example.loan.response.LoginMesage;
import com.example.loan.service.UserService;
@CrossOrigin("*")
@RestController
public class UserController {
	 @Autowired
	 UserService us;
	 @Autowired
	 UserRepository ur;
	 @GetMapping("/get")
	 public List<UserModel>getAllDetails(){
		 return ur.findAll();
	 }
     @PostMapping("/usesave")
     public String saveUser(@RequestBody UserDTO userDTO)
     {
    	 String id=us.addUser(userDTO);
    	 return id;
     }
     @PostMapping("/newlogin")
     public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO)
     {
    	 LoginMesage loginMesage=us.loginUser(loginDTO);
    	 return ResponseEntity.ok(loginMesage);
     }
 	
	 

}
