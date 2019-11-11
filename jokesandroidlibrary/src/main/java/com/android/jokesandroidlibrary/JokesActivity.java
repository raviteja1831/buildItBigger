package com.android.jokesandroidlibrary;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class JokesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);

        if(savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(
                    R.id.jokesContainer, new JokesActivityFragment()).commit();

        }
    }

}
