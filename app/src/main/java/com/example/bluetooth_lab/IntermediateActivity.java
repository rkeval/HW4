package com.example.bluetooth_lab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntermediateActivity extends AppCompatActivity {

    private int deviceIndex;
    Button text,image,audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate);

        Bundle extras = this.getIntent().getExtras();
        deviceIndex = extras.getInt("index");

        text = (Button) findViewById(R.id.btnTextMessage);


        image = (Button) findViewById(R.id.btnTextMessage);
        audio = (Button) findViewById(R.id.btnTextMessage);
    }

    public void text_activity(View view)
    {
        Intent intent = new Intent(this, ConnectedActivity.class);
        intent.putExtra("index", deviceIndex);
        this.startActivity(intent);
    }
    public void image_activity(View view)
    {
        Intent intent = new Intent(this, PhotoActivity.class);
        this.startActivity(intent);
    }
    public void audio_activity(View view)
    {
        Intent intent = new Intent(this, AudioActivity.class);
        this.startActivity(intent);
    }
}
