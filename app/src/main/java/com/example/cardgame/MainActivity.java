package com.example.cardgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.cardgame.models.Card;

public class MainActivity extends AppCompatActivity {
    public ImageView testImage;
    public Card myCard;
    public Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Error : Always Instante lqlawwwwii any claas u wanna use
        myCard = new Card();
        testImage = (ImageView) findViewById(R.id.imageViewTest);
        testImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Toast.makeText(getBaseContext(), ""+getResources().getResourceName(R.mipmap.card_back_foreground), Toast.LENGTH_LONG).show();

            }
        });
        testImage.setImageBitmap(myCard.getBitmap(getResources(), R.mipmap.card_back_foreground));

    }




}