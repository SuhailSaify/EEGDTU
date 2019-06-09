package com.example.eeg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import model.userdetailsM;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //list of user obj
        List<userdetailsM> User= new ArrayList<userdetailsM>();

        //userdetailsM mStudentObject = new userdetailsM();

        SharedPreferences appSharedPrefs = PreferenceManager
                .getDefaultSharedPreferences(this.getApplicationContext());
        SharedPreferences.Editor prefsEditor = appSharedPrefs.edit();



        Gson gson = new Gson();
        String  json = gson.toJson(User);
        prefsEditor.putString("User_key", json);
        prefsEditor.commit();
    }

}
