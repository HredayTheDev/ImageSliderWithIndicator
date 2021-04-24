package com.softvally.imagesliderwithindicator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ImageSlider imageSlider;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageSlider=findViewById(R.id.image_slider);

        List<SlideModel> models=new ArrayList<>();
        models.add(new SlideModel(R.drawable.motive1));
        models.add(new SlideModel(R.drawable.motive6));
        models.add(new SlideModel(R.drawable.motive3));
        models.add(new SlideModel(R.drawable.motive4));
        models.add(new SlideModel(R.drawable.challenge));
        models.add(new SlideModel(R.drawable.motive6));

       imageSlider.setImageList(models,true);
    }
}