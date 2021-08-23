package com.example.ideasethu;

public class ModelClass {
    static Integer id;
    String name;
    String email;
    public ModelClass(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public ModelClass(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public static Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
