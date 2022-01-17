package com.example.getmesocialservice.Model;

import com.example.getmesocialservice.validation.ValidName;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class User {

    @Id
    private String id;
    @NotEmpty @ValidName
    private String name;
    @Length(max = 100) @NotEmpty
    private String address;
    @Min(value = 1) @Max(value = 100)
    private int age;
    @Email @NotEmpty
    private String email;
    @NotEmpty
    private String profilePicUrl;

    public User(String name, String address, int age,String email, String profilePicUrl) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.email = email;
        this.profilePicUrl = profilePicUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }
}
