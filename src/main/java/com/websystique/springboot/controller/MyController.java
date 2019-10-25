package com.websystique.springboot.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.websystique.springboot.model.User;
import com.websystique.springboot.service.UserService;

@RestController
@RequestMapping("/med")
public class MyController {
	@Autowired
	UserService userService;

	@RequestMapping(value="/getMeth",method=RequestMethod.GET)
	public ArrayList<User> getMetode() {
		return (ArrayList<User>) userService.findAllUsers();

	}

	@RequestMapping(value="/getMethParam", method=RequestMethod.GET)
	public User getMetodeByParam(@RequestParam("id") long id) {
		return userService.findById(id);

	}
	
	@RequestMapping(value="/getMethParam/{id}",method=RequestMethod.GET)
	public User getMetodeByPathVariable(@PathVariable("id") long id) {
		return userService.findById(id);

	}
	
	@RequestMapping(value="/postMeth", method=RequestMethod.POST)
	public void postMetod(@RequestBody User user){
		userService.saveUser(user);
		
		
	}
	
	@RequestMapping(value="/putMeth/{id}", method=RequestMethod.PUT)
	public void putMetod(@PathVariable long id,@RequestBody User user){
		User userToModify=new User();
		userToModify=userService.findById(id);
		userToModify.setName(user.getName());
		userToModify.setAge(user.getAge());
		userToModify.setSalary(user.getSalary());
		userService.updateUser(userToModify);
	}
	
	@RequestMapping(value="/delMeth/{id}", method=RequestMethod.DELETE)
	public void deleteMetod(long id){
		userService.deleteUserById(userService.findById(id).getId());
		
	}

}
