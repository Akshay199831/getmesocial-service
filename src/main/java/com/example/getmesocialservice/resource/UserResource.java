package com.example.getmesocialservice.resource;
import com.example.getmesocialservice.Model.FirebaseUser;
import com.example.getmesocialservice.exception.RestrictedInfoException;
import com.example.getmesocialservice.service.FirebaseService;
import com.google.firebase.auth.FirebaseAuthException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.getmesocialservice.Model.User;
import com.example.getmesocialservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/users")
public class UserResource {

    @Autowired
    private UserService userService;


    @Autowired
    private FirebaseService firebaseService;

    @PostMapping
    public User saveUser(@RequestBody @Valid User user, @RequestHeader(name = "idToken") String idToken) throws IOException, FirebaseAuthException {
        FirebaseUser firebaseUser = firebaseService.authenticatin(idToken);
        if(firebaseUser != null){
            return userService.saveUser(user);
        }
        return null;

    }

    @GetMapping("/find")
    public List<User> getByAddress(@RequestParam(name = "address") String address) throws RestrictedInfoException {
        if(address.equalsIgnoreCase("area51")){
            throw new RestrictedInfoException();
        }
      return userService.getByAddress(address);
    }


    @GetMapping("/find-by-id")
    public User getById(@RequestParam("userId") String userId){
        return userService.getById(userId);
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
