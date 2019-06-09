package model;

import android.graphics.Bitmap;


public class userdetailsM{

    private String  first_name;
    private String  last_name;
    private String number;
    private Bitmap user_image;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Bitmap getUser_imag() {
        return user_image;
    }

    public void setUser_imag(Bitmap user_imag) {
        this.user_image = user_imag;
    }


};