package com.example.profilephotoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    //link to facebook profile photo
    String imageUrl = "https://scontent.flos6-1.fna.fbcdn.net/v/t1.0-9/p960x960/35472397_1903164213040712_7460475299730292736_o.jpg?_nc_cat=107&_nc_eui2=AeEjXMCpR6708yXXukYXDGUdraosImapHB2K3Gar0oRzLYtG7fMIqELv4pCvkqercYjIQha-4frrLbfNBRNNAN2HVAIIdLr_uCwtSrrZeQ99XA&_nc_ohc=vnbvc5YecIEAX9MPosI&_nc_ht=scontent.flos6-1.fna&_nc_tp=1002&oh=a5c12f9b7dfc195a103817a08ba1e241&oe=5ECB0DF4";

    //declaration of variable to the ImageView that will display photo
    ImageView photoImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //this line connects activity_main.xml to this Java class

        photoImageView = findViewById(R.id.profile_pics); //save ref to ImageView to the variable created earlier
        Picasso.get().load(imageUrl).into(photoImageView); //implementation of Picasso
    }
}
