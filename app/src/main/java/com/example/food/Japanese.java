package com.example.food;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Japanese extends AppCompatActivity {
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
                int count = random.nextInt(4)+1;
                switch(count){
                    case 1 :
                        imageView.setImageResource(R.drawable.j_pic1);
                        txtResult.setText("초밥");
                        break;
                    case 2 :
                        imageView.setImageResource(R.drawable.j_pic2);
                        txtResult.setText("돈가스");
                        break;
                    case 3 :
                        imageView.setImageResource(R.drawable.j_pic3);
                        txtResult.setText("모밀");
                        break;
                    case 4 :
                        imageView.setImageResource(R.drawable.j_pic4);
                        txtResult.setText("카레");
                        break;
                }
            }
        });
    }
}
