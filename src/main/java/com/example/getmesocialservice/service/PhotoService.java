package com.example.getmesocialservice.service;

import com.example.getmesocialservice.Model.Photo;
import com.example.getmesocialservice.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoService {

    @Autowired
    private PhotoRepository photoRepository;

    public Photo savephoto(Photo photo) {
        return photoRepository.save(photo);

    }

    public List<Photo> getAllphotos() {
        return photoRepository.findAll();
    }
    public Photo updatephoto(Photo photo) {
        return photoRepository.save(photo);
    }
    public void deleteUser(String photoId) {
        photoRepository.deleteById(photoId);
    }

}

