package com.userinfo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userinfo.models.User;

@RestController
@RequestMapping("/UserInfoService")
public class UserController {
	@RequestMapping("/{userId}")
	public User getUserById(@PathVariable("userId") int userId) {
		List<User> userList = new ArrayList<User>();
		userList.add(new User(1,"Govind","govind@gmail.com","782",1));
		userList.add(new User(2,"Richa","richa@gmail.com","754",2));
		userList.add(new User(3,"Navnath","navanth@gmail.com","895",3));
		User user = userList.stream().filter(u -> userId == u.getUserId()).findAny().orElse(null);
		return user;
		}
}
