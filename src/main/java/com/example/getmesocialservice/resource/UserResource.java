package com.example.getmesocialservice.resource;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.getmesocialservice.Model.User;
import com.example.getmesocialservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @PostMapping
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);

    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @PutMapping
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }
    @DeleteMapping
    public void deleteUser(@RequestParam(name = "userId") String userId){
        userService.deleteUser(userId);
    }

}
