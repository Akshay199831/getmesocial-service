package com.example.getmesocialservice.Model;
import org.springframework.data.annotation.Id;

public class Photo {
    @Id
    private String id;
    private String albumId;
    private String photoUrl;
    private String createdBy;
    private String dateCreated;

    public Photo(String albumId, String photoUrl, String createdBy, String dateCreated) {
        this.albumId = albumId;
        this.photoUrl = photoUrl;
        this.createdBy = createdBy;
        this.dateCreated = dateCreated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getalbumId() {
        return albumId;
    }

    public void setalbumId(String albumId) {
        this.albumId = albumId;
    }

    public String getphotoUrl() {
        return photoUrl;
    }

    public void setphotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getcreatedBy() {
        return createdBy;
    }

    public void setcreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getdateCreated() {
        return dateCreated;
    }

    public void setdateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
}
