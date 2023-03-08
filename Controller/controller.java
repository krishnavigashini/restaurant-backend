//package com.codewitharjun.fullstackbackend.controller;
//
//import com.codewitharjun.fullstackbackend.exception.UserNotFoundException;
//import com.codewitharjun.fullstackbackend.model.User;
//import com.codewitharjun.fullstackbackend.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@CrossOrigin("http://localhost:3000")
//public class UserController {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @PostMapping("/user")
//    User newUser(@RequestBody User newUser) {
//        return userRepository.save(newUser);
//    }
//
//    @GetMapping("/users")
//    List<User> getAllUsers() {
//        return userRepository.findAll();
//    }
//
//    @GetMapping("/user/{id}")
//    User getUserById(@PathVariable Long id) {
//        return userRepository.findById(id)
//                .orElseThrow(() -> new UserNotFoundException(id));
//    }
//
//    @PutMapping("/user/{id}")
//    User updateUser(@RequestBody User newUser, @PathVariable Long id) {
//        return userRepository.findById(id)
//                .map(user -> {
//                    user.setUsername(newUser.getUsername());
//                    user.setName(newUser.getName());
//                    user.setEmail(newUser.getEmail());
//                    return userRepository.save(user);
//                }).orElseThrow(() -> new UserNotFoundException(id));
//    }
//
//    @DeleteMapping("/user/{id}")
//    String deleteUser(@PathVariable Long id){
//        if(!userRepository.existsById(id)){
//            throw new UserNotFoundException(id);
//        }
//        userRepository.deleteById(id);
//        return  "User with id "+id+" has been deleted success.";
//    }
//
//
//
//}

package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.model;
import com.example.demo.Service.service;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class controller {

@Autowired
service s;

@GetMapping("/get")
public List<model> showDetails() {
return s.getDetails();
}

@GetMapping("/get/{id}")
private model getBooks(@PathVariable ("id") int id)
{
	return s.getBookById(id);
}
@PostMapping("/post")
public String addDetails(@RequestBody model m) {
s.add(m);
return "Added Menu Details " + m.getId();
}
@PutMapping("/put")
public model updateInfo(@RequestBody model st1)
{
return s.updatedetails(st1);
}
@DeleteMapping("/delete/{Mid}")
public String deleteInfo(@PathVariable("Mid") int Mid)
{
s.deleteDetails(Mid);
return "Deleted details";
}

//sorting
@GetMapping("/show/{field}")
public List<model> getWithSort(@PathVariable String field) {
return s.getSorted(field);
}

 //pagination
@GetMapping("/show/{offset}/{pageSize}")
public List<model> productsWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
return s.getWithPagination(offset, pageSize);
}
}
