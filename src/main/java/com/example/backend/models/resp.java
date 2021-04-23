package com.example.backend.models;

public class resp {

    private int found ;
    private String msg ;
    
    


    public resp(int found, String msg) {
        this.found = found;
        this.msg = msg;
    }
    
    public int getFound() {
        return found;
    }
    public void setFound(int found) {
        this.found = found;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

    
    
}
