package com.example.cardgame.models;


import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.example.cardgame.R;

public class Card {
    public String url_Image;
    public String name_Image;
    public Bitmap bitmap;

    public Card() {
    }

    public Card(String url_Image, String name_Image) {
        this.url_Image = url_Image;
        this.name_Image = name_Image;
    }

    public String getUrl_Image() {
        return url_Image;
    }

    public void setUrl_Image(String url_Image) {
        this.url_Image = url_Image;
    }

    public String getName_Image() {
        return name_Image;
    }

    public void setName_Image(String name_Image) {
        this.name_Image = name_Image;
    }

    public Bitmap getBitmap(Resources resources, int Image_Url) {
        Bitmap myBitmap = BitmapFactory.decodeResource(resources, Image_Url);
        return myBitmap;
    }


}
