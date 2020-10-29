package com.example.cardgame.models;



import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.File;
import java.util.ArrayList;

public class Card {
    public String url_Image;
    public String name_Image;
    public Bitmap bitmap;
    public static ArrayList<Card> cards;

    public Card() {
        cards = new ArrayList<>();
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
    public String loadCards(String path){
       File myImages = new File(path);
         String mycards = myImages.getPath();
             return mycards;
    }

}
