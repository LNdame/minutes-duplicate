package com.example.orion_stark.minutes_duplicate.activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.orion_stark.minutes_duplicate.R;

public class Welcome_Page extends AppCompatActivity {
    TextView title_banner;
    TextView description;
    Button facebook_login_btn;
    Button gmail_login_btn;
    Button email_login_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_page);
        fillProperties();
    }

    private void fillProperties()
    {
        // Declare Widget
        this.title_banner = findViewById(R.id.title_text);
        this.description = findViewById(R.id.description_text);
        this.facebook_login_btn = findViewById(R.id.facebook_login);
        this.gmail_login_btn = findViewById(R.id.google_login);
        this.email_login_btn = findViewById(R.id.email_login);

        // Font Assets
        this.title_banner.setTypeface(Typeface.createFromAsset(getAssets(), "Font_Pack/BreeSerif-Regular.ttf"));
        this.description.setTypeface(Typeface.createFromAsset(getAssets(), "Font_Pack/Poppins-Medium.ttf"));

        // Set eventlstnr on button
        this.facebook_login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
            }
        });
        this.gmail_login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
            }
        });
        this.email_login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Welcome_Page.this, Login_Email.class));
                finish();
            }
        });
    }
}
