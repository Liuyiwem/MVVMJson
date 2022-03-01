package com.example.mvvmjson.Model;

public class MovieModel {
    private String name;
    private String realname;
    private String team;
    private String firstappearance;
    private String createdby;
    private String publisher;
    private String imageurl;
    private String bio;

    public MovieModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealName() {
        return realname;
    }

    public void setRealName(String realName) {
        this.realname = realName;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getFirstAppearance() {
        return firstappearance;
    }

    public void setFirstAppearance(String firstAppearance) {
        this.firstappearance = firstAppearance;
    }

    public String getCreatedBy() {
        return createdby;
    }

    public void setCreatedBy(String createdBy) {
        this.createdby = createdBy;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getImageUrl() {
        return imageurl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageurl = imageUrl;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public MovieModel(String name, String realName, String team, String firstAppearance, String createdBy, String publisher, String imageUrl, String bio) {
        this.name = name;
        this.realname = realName;
        this.team = team;
        this.firstappearance = firstAppearance;
        this.createdby = createdBy;
        this.publisher = publisher;
        this.imageurl = imageUrl;
        this.bio = bio;
    }
}
