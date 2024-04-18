package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class topicsActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_topics2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void grammerButton(View view) {
        startActivity(new Intent(topicsActivity2.this, grammerActivity.class));
    }

    public void toPhraselActivity(View view) {
        startActivity(new Intent(topicsActivity2.this, phrasel_activity.class));

    }

    public void toYoutubeChannel(View view) {
        String url = "https://www.youtube.com/watch?v=pQwWrlLplog&list=PL4z9gdpRQP4wBwC3HLjJ1Tqp_sEkcBgbo";
        Intent in=new Intent(Intent.ACTION_VIEW);
        in.setData(Uri.parse(url));
        startActivity(in);
    }

    public void translaterWebsite(View view) {
        String url = "https://translate.google.com";
        Intent in=new Intent(Intent.ACTION_VIEW);
        in.setData(Uri.parse(url));
        startActivity(in);
    }
}