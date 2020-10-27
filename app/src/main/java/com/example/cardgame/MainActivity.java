package com.example.cardgame;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.cardgame.models.Card;


import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    public ImageView testImage;
    private int i;
    public Card myCard;
    public ArrayList<Card> myCards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myCard = new Card();
        myCards = new ArrayList<>();
        this.i =0;

        //Error : Always Instante lqlawwwwii any claas u wanna use
        testImage = (ImageView) findViewById(R.id.imageViewTest);
        testImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           //testImage.setImageBitmap(myCard.getBitmap(getResources(), R.mipmap.card_back_foreground));
                chooseTypeCards("logos");
            }
        });
    }

    public ArrayList<String> cards (String path, int Item){
        try{
            String[] tabImages = getAssets().list(path);
            ArrayList<String> listImages = new ArrayList<String>(Arrays.asList(tabImages));
            //for (int i=0; i<listImages.size();i++){
                InputStream inputstream=getBaseContext().getAssets().open(path+"/"
                        +listImages.get(Item));
                Toast.makeText(getBaseContext(), ""+listImages.get(Item), Toast.LENGTH_LONG).show();
                Drawable drawable = Drawable.createFromStream(inputstream, null);
                testImage.setImageDrawable(drawable);
          //  }
            return listImages;

        }catch (Exception ex){
        }

    return null;
    }

public void chooseTypeCards(String type){
     cards(type, i);
    i = i+1;
}

}