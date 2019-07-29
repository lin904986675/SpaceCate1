package com.example.spacecate;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;

public class HomeActivity extends Activity{
    RadioButton btn1;
    Banner banner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.space_main);

        Button btn2=findViewById(R.id.food);
        Button btn3=findViewById(R.id.snack);
        Button btn4=findViewById(R.id.western);
        Button btn5=findViewById(R.id.west);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });

        btn1=findViewById(R.id.home_Search);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,SeachActivity.class);
                startActivity(intent);
            }
        });



        //轮播图
        banner = findViewById(R.id.banner);

        ArrayList<Integer> imgs = new ArrayList<>();
        imgs.add(R.drawable.t1);
        imgs.add(R.drawable.t2);
        imgs.add(R.drawable.t3);

        ArrayList<String> title = new ArrayList<>();
        title.add("中庸");
        title.add("大学");
        title.add("在人间");

        banner.setImages(imgs);
        banner.setImageLoader(new ImageLoadBanner());
        banner.setBannerTitles(title);
        banner.setDelayTime(2000);
        banner.isAutoPlay(true);
        banner.setIndicatorGravity(BannerConfig.CENTER);
        banner.setBannerAnimation(Transformer.Accordion);
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE);
        banner.start();
    }
}
class ImageLoadBanner extends ImageLoader {

    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        imageView.setImageResource(Integer.parseInt(path.toString()));
    }

    }
