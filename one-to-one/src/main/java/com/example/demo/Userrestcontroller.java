package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Userrestcontroller
{
@Autowired
  private Userrepositry userrepositry;
@GetMapping
  public List<User> getalluser()
  {
	return userrepositry.findAll();
  }
@PostMapping
public User saveuser(@RequestBody User details)
{
	return userrepositry.save(details);
}
@PutMapping("/update") 
public User updateUser(@RequestBody User details) {
    return userrepositry.save(details);
}

@DeleteMapping("/delete")
public String deleteUser(@RequestBody User details) {
   userrepositry.delete(details);
    return "Deleted Successfully"+details;
}
}
