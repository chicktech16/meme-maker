package com.example.hlupico.mememaker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setElevation(0f);

        TextView getstarted = (TextView) findViewById(R.id.getstartedbutton);
        getstarted.setTextColor(getResources().getColor(android.R.color.holo_blue_light));

        ImageButton imageButton = (ImageButton) findViewById(R.id.new_meme_button);
        View.OnClickListener imageClickListener = getImageButtonOnClick();
        imageButton.setOnClickListener(imageClickListener);
    }

    private View.OnClickListener getImageButtonOnClick() {
        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Y ou clicked this button", Toast.LENGTH_SHORT).show();
                //Go to NewActivity
                Intent intent = new Intent(MainActivity.this, NewMemeActivity.class);
                startActivity(intent);

            }
        };

        return clickListener;
    }
}




