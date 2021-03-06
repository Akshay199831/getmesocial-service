package com.example.getmesocialservice.Model;

import com.example.getmesocialservice.validation.ValidCreator;
import com.example.getmesocialservice.validation.ValidName;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotEmpty;

public class Comment {
    @Id
    private String id;
    private String PhotoId;
    @Length(min = 5)
    private String message;
    @NotEmpty @ValidCreator
    private String createdBy;
    private String dateCreated;

    public Comment(String PhotoId, String message, String createdBy, String dateCreated) {
        this.PhotoId = PhotoId;
        this.message = message;
        this.createdBy = createdBy;
        this.dateCreated = dateCreated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhotoId() {
        return PhotoId;
    }

    public void setPhotoId(String PhotoId) {
        this.PhotoId = PhotoId;
    }

    public String getmessage() {
        return message;
    }

    public void setmessage(String message) {
        this.message = message;
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
