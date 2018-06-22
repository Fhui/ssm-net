package com.harry.entity;

public class Orders {

    private String title;
    private Integer number;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "title='" + title + '\'' +
                ", number=" + number +
                '}';
    }
}
