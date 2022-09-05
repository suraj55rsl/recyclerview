package com.example.recyclerviewsuraj.Models;

public class item_1 {
    String name;
    int contributors;
    int followers;


    public item_1(String name, int contributors, int followers) {
        this.name = name;
        this.contributors = contributors;
        this.followers = followers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
