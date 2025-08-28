package com.example.baitap8;

public class ChoNgoi {
    private boolean status;

    public ChoNgoi() {
        this.status = false; 
    }

    public ChoNgoi(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ChoNgoi [status=" + status + ", isStatus()=" + isStatus() + "]";
    }
    

    
}
