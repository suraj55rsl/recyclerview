package com.example.recyclerviewsuraj.Models;

public class item_2 {
    String name;
    String location;
    int contributors;
    int followers;

    public item_2(String name, String location, int contributors, int followers) {
        this.name = name;
        this.location = location;
        this.contributors = contributors;
        this.followers = followers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getContributors() {
        return contributors;
    }

    public void setContributors(int contributors) {
        this.contributors = contributors;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }
}
