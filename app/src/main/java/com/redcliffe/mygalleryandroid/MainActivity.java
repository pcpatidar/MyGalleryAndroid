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

    /* ArrayList<String> personImages = new ArrayList<>(Arrays.asList(
            "https://imageserver2.photogra.com/vps/vps.dll?cmd=lt&I=\\\\photonas4\\gallery31$\\3810000\\3810879\\orig\\31BB8F0_20180505_151605_orig.jpg",
            "https://imageserver2.photogra.com/vps/vps.dll?cmd=lt&I=\\\\photonas4\\gallery31$\\3810000\\3810879\\orig\\31BBB54_20180505_151615_orig.jpg",
            "https://imageserver2.photogra.com/vps/vps.dll?cmd=lt&I=\\\\photonas4\\gallery31$\\3810000\\3810879\\orig\\31BBE9E_20180505_151628_orig.jpg",
            "https://imageserver2.photogra.com/vps/vps.dll?cmd=lt&I=\\\\photonas4\\gallery31$\\3810000\\3810879\\orig\\31BC21E_20180505_151643_orig.jpg",
            "https://imageserver2.photogra.com/vps/vps.dll?cmd=lt&I=\\\\photonas4\\gallery31$\\3810000\\3810879\\orig\\31BC558_20180505_151656_orig.jpg",
            "https://imageserver2.photogra.com/vps/vps.dll?cmd=lt&I=\\\\photonas4\\gallery31$\\3810000\\3810879\\orig\\31BC85F_20180505_151708_orig.jpg")); */
    ArrayList<String> personImages = new ArrayList<>(Arrays.asList(
            "https://i.pinimg.com/736x/7a/14/64/7a146463281f6610fcab4a48e71492d7--fancy-cars-cool-cars.jpg",
            "https://i.pinimg.com/564x/32/cd/dc/32cddc2e3d5fc8b41dae8edbebae48ae--google-search-future-car.jpg",
            "https://i.ytimg.com/vi/gp3ZKiwZMvg/hqdefault.jpg",
            "https://i.pinimg.com/736x/27/d5/32/27d532f9037f8dafa44405f516119082--mazda-furai-sportcars.jpg",
            "http://i2.cdn.turner.com/money/dam/assets/140421122255-2014-ny-auto-show-2015-mclaren-650s-1280x720.jpg",
            "http://thenewswheel.com/wp-content/uploads/2017/03/10-Famous-New-Yorkers-with-Incredibly-Cool-Cars-Feature.jpg",
            "http://beverlyhillsmagazine.com/wp-content/uploads/Ferrrari-LaFerrari-1.jpeg",
            "https://i.pinimg.com/736x/51/22/24/512224b7565c4adf4cd66bba6184bf78--most-expensive-expensive-cars.jpg",
            "http://beverlyhillsmagazine.com/wp-content/uploads/Bentley-Aston-Martin-Dream-Cars-Maybach-Doge-Charger-Cool-Cars-Race-Car-Magazine-VIP-Style-cars-Supercars-Beverly-Hills-Magazine-3-e1492551913276.jpg",
            "https://lh6.ggpht.com/78tnPMNVWns7NsmTjO3C9QQz-jRxLIjL1yE8VtJC_Epv24r4AKjW4e14BojEKbcMPCdr%3Dh310",
            "https://s.aolcdn.com/dims-global/dims3/GLOB/legacy_thumbnail/916x515/quality/95/https://s.blogcdn.com/slideshows/images/slides/400/662/5/S4006625/slug/l/01-2017-chevrolet-corvette-gs-fd-1-1.jpg",
            "https://s-media-cache-ak0.pinimg.com/originals/80/69/92/806992aaf90fcb40065a600ae485002a.jpg"));


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