package com.ironyard.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ironyard.repo.UserListRepository;
import com.ironyard.repo.UserRepository;
import com.ironyard.springboot.data.User;
import com.ironyard.springboot.data.UserList;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository myRepo;
	@Autowired
	private UserListRepository userListRepo;
	
	/**
	 * Create the specified UserList
	 * @param createThis
	 * @return populated UserList
	 */
	@RequestMapping(value = "/UserList", method = RequestMethod.POST)
	public UserList create(@RequestBody UserList createThis){
		userListRepo.save(createThis);
		return createThis;
	}
	
	
	/**
	 * Create the specified ToDoItem
	 * @param createThis
	 * @return populated ToDoItem
	 */
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public User create(@RequestBody User createThis){
		myRepo.save(createThis);
		return createThis;
	}
	
	/**
	 * Get the specified Item
	 * @param id
	 * @return requested ToDoItem
	 */
	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public User get(@PathVariable Long id){
		// set ID
		return myRepo.findOne(id);
	}
	
	/**
	 * 
	 * @return Collection of all ToDoItems
	 */
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public Iterable<User> get() {
		// set ID
		return myRepo.findAll();
	}
}
