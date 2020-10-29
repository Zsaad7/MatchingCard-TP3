package com.example.cardgame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cardgame.models.Card;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CardActivity extends AppCompatActivity {
    public ImageView ViewCard;
    public TextView NameCard;
    private int i;
    public Card myCard;
    public ArrayList<Card> myCards;
    public String  myPath;
    public ArrayList<String> getSize = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        myCard = new Card();
        myCards = new ArrayList<>();
        this.i =0;

        ViewCard = findViewById(R.id.viewCard);
      //  testBtn = findViewById(R.id.button2);
        NameCard = findViewById(R.id.nameCard);
        ViewCard.setImageBitmap(myCard.getBitmap(getResources(), R.mipmap.card_back_foreground));
        myPath = myCard.loadCards("logos");
        getSize = cards(myPath, i);
        ViewCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chooseTypeCards(myPath);
            Toast.makeText(getBaseContext(), ""+ getSize.size(), Toast.LENGTH_LONG).show();
            }
        });
    }

    public ArrayList<String> cards (String path, int Item){
        try{
                  String[] tabImages = getAssets().list(path);
                  ArrayList<String> listImages = new ArrayList<String>(Arrays.asList(tabImages));
                  InputStream inputstream=getBaseContext().getAssets().open(path+"/"
                    +listImages.get(Item));

                  NameCard.setText(listImages.get(Item));
                  Drawable drawable = Drawable.createFromStream(inputstream, null);
                  ViewCard.setImageDrawable(drawable);
             return listImages;

        }catch (Exception ex){
        }

        return null;
    }
    public void chooseTypeCards(String path){
        cards(path, i);
        i = i+1;
    }
    @Override
    protected void onStart() {
        super.onStart();
        final Random myRandom = new Random();
        //get size of listImage to fix it on random methode next step
         cards(myPath, myRandom.nextInt(getSize.size()));

    }
}