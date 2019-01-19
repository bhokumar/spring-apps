package org.robots.apps.mybatisapp.model;

public class City {
    private String name;
    private  int id;

    public City() {
    }

    public City(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
