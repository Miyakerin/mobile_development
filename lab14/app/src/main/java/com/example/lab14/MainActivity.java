package com.example.lab14;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button checkButton;
    private ImageView offlineImage, onlineImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        checkButton = findViewById(R.id.checkButtonId);
        System.out.println("images init");
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void onCheckButtonClick(View view) {
        ConnectivityManager connectivityManager = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        offlineImage = (ImageView) findViewById(R.id.offlineImage);
        onlineImage = (ImageView) findViewById(R.id.onlineImage);

        if (networkInfo != null && networkInfo.isConnected()) {
            offlineImage.setVisibility(View.INVISIBLE);
            onlineImage.setVisibility(View.VISIBLE);
        } else {
            offlineImage.setVisibility(View.VISIBLE);
            onlineImage.setVisibility(View.INVISIBLE);
        }
    }
}