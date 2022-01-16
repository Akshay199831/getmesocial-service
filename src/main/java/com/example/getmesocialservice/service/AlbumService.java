package com.example.getmesocialservice.service;

import com.example.getmesocialservice.Model.Album;
import com.example.getmesocialservice.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {
    @Autowired
    private AlbumRepository albumRepository;

    public Album saveAlbum(Album album) {

        return albumRepository.save(album);
    }

    public List<Album> getAllAlbums() {
        return albumRepository.findAll();
    }
    public Album updateAlbum(Album album) {
        return albumRepository.save(album);
    }
    public void deleteAlbum(String albumId) {
        albumRepository.deleteById(albumId);
    }
/*
    public Album getAlbum(){
        return albumRepository.getAlbum();
    }

    public List<Album> getAllAlbums() {
        return albumRepository.getAllAlbums();
    }

    public Album getAlbumById(int albumId) {
        return albumRepository.getAlbumById(albumId);
    }

    public Album updateAlbum(int albumId, Album album) {
        return albumRepository.updateAlbum(albumId, album);
    }

    public Album deleteAlbum(int albumId) {
        return albumRepository.deleteAlbum(albumId);
    }

 */
}
