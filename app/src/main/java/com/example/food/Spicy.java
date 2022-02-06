package com.example.food;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Spicy extends AppCompatActivity {
    Button btn_click;
    Random random = new Random();
    ImageView imageView;
    TextView txtResult;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korean);

        imageView = findViewById(R.id.imageView);
        btn_click = (Button) findViewById(R.id.click);
        txtResult = findViewById(R.id.food_name);
        btn_click.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int count = random.nextInt(3)+1;
                switch(count){
                    case 1 :
                        imageView.setImageResource(R.drawable.sp_pic1);
                        txtResult.setText("냉면");
                        break;
                    case 2 :
                        imageView.setImageResource(R.drawable.sp_pic2);
                        txtResult.setText("콩나물국밥");
                        break;
                    case 3 :
                        imageView.setImageResource(R.drawable.sp_pic3);
                        txtResult.setText("선지해장국");
                        break;
                }
            }
        });
    }
}
