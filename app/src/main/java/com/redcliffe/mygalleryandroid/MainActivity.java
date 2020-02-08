package com.redcliffe.mygalleryandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    // ArrayList for person names
    ArrayList<Integer> personNames = new ArrayList<>(Arrays.asList(R.drawable.app_logo, R.drawable.app_logo, R.drawable.app_logo,
            R.drawable.app_logo,R.drawable.app_logo,R.drawable.app_logo));
    ArrayList<String> personImages = new ArrayList<>(Arrays.asList(
            "https://imageserver2.photogra.com/vps/vps.dll?cmd=lt&I=\\\\photonas4\\gallery31$\\3810000\\3810879\\orig\\31BB8F0_20180505_151605_orig.jpg",
            "https://imageserver2.photogra.com/vps/vps.dll?cmd=lt&I=\\\\photonas4\\gallery31$\\3810000\\3810879\\orig\\31BBB54_20180505_151615_orig.jpg",
            "https://imageserver2.photogra.com/vps/vps.dll?cmd=lt&I=\\\\photonas4\\gallery31$\\3810000\\3810879\\orig\\31BBE9E_20180505_151628_orig.jpg",
            "https://imageserver2.photogra.com/vps/vps.dll?cmd=lt&I=\\\\photonas4\\gallery31$\\3810000\\3810879\\orig\\31BC21E_20180505_151643_orig.jpg",
            "https://imageserver2.photogra.com/vps/vps.dll?cmd=lt&I=\\\\photonas4\\gallery31$\\3810000\\3810879\\orig\\31BC558_20180505_151656_orig.jpg",
            "https://imageserver2.photogra.com/vps/vps.dll?cmd=lt&I=\\\\photonas4\\gallery31$\\3810000\\3810879\\orig\\31BC85F_20180505_151708_orig.jpg"));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);

        GalleryAdapter galleryAdapter = new GalleryAdapter(MainActivity.this, personNames, personImages);
        recyclerView.setAdapter(galleryAdapter);
    }
}