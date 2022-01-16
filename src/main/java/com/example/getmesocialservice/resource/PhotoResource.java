package com.example.getmesocialservice.resource;
import com.example.getmesocialservice.Model.Photo;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.getmesocialservice.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/api/photos")
public class PhotoResource {

    @Autowired
    private PhotoService photoservice;

    @PostMapping
    public Photo savephoto(@RequestBody Photo photo){
        return photoservice.savephoto(photo);

    }

    @GetMapping
    public List<Photo> getAllphotos(){
        return photoservice.getAllphotos();
    }
    @PutMapping
    public Photo updatephoto(@RequestBody Photo photo){
        return photoservice.updatephoto(photo);
    }
    @DeleteMapping
    public void deletephoto(@RequestParam(name = "photoId") String photoId){
        photoservice.deleteUser(photoId);
    }

}

