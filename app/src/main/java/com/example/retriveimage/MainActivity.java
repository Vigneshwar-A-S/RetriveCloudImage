package com.example.retriveimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.image);


        //this is the firebase storage image link
        String url = "https://firebasestorage.googleapis.com/v0/b/retrive-image-6392e.appspot.com/o/boom.png?alt=media&token=278bd440-1535-42f0-a08b-f909689b5d42";
        
       Glide.with(getApplicationContext()).load(url).into(imageView);




    }
}
