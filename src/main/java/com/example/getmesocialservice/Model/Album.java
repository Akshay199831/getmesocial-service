package com.example.getmesocialservice.Model;

import org.springframework.data.annotation.Id;

public class Album {
    @Id
    private String id;
    private String name;
    private String description;
    private String coverPicUrl;

    public Album(String name, String description, String coverPicUrl) {
        this.name = name;
        this.description = description;
        this.coverPicUrl = coverPicUrl;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoverPicUrl() {
        return coverPicUrl;
    }

    public void setCoverPicUrl(String coverPicUrl) {
        this.coverPicUrl = coverPicUrl;
    }
}
