package com.example.tryfirebase;

public class DataHolder {

    String name,id, MAJOR;

    public DataHolder()
    {

    }

    public DataHolder(String name,String id, String MAJOR) {
        this.name = name;
        this.id = id;
        this.MAJOR = MAJOR;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMAJOR() {
        return MAJOR;
    }

    public void setMAJOR(String MAJOR) {
        this.MAJOR = MAJOR;
    }
}
