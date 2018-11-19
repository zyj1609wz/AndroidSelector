package com.yanjun.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout mLLImage;
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = findViewById(R.id.image1);

        mLLImage = findViewById(R.id.ll_image);


        //方式1
        mLLImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mLLImage.setSelected(!mLLImage.isSelected());
            }
        });

        //方式2
//        mImageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                mImageView.setSelected(!mImageView.isSelected());
//            }
//        });
    }
}
