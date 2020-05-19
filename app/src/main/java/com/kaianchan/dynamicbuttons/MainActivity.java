package com.kaianchan.dynamicbuttons;
// https://www.youtube.com/watch?v=4MFzuP1F-xQ&frags=wn
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridLayout gridLayout;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] btn_name = new String[]{
                "btn00", "btn01", "btn02",
                "btn10", "btn11", "btn12",
                "btn20", "btn21", "btn22",
                "btn30", "btn31", "btn32",
        };

        gridLayout = findViewById(R.id.gridLayout);

        dynamicButtons();
    }

    public void dynamicButtons() {
        for (int i = 0; i < 12; i++) {
            b1 = new Button(MainActivity.this);
            b1.setId(i);
            b1.setText(String.valueOf(i));
            b1.setTag(i);
            gridLayout.addView(b1);
//            b1.setOnClickListener(MainActivity.this);
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    gridButtonClick(v);
                }
            });
        }
    }

    public void gridButtonClick(View v) {
        Toast.makeText(getApplicationContext(), "ButtonClick" + v.getId(), Toast.LENGTH_SHORT).show();

        // Lock Size
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {

            }
        }
        // Does not scale image
//            b1.setBackgroundResource(R.drawable.all);

        // Scale image to button

        /*
        if (str.equals("0")) {
            Toast.makeText(getApplicationContext(), "Click Button1", Toast.LENGTH_SHORT).show();
        } else if (str.equals("1")) {
            Toast.makeText(getApplicationContext(), "Click Button2", Toast.LENGTH_SHORT).show();
        } else if (str.equals("2")) {
            Toast.makeText(getApplicationContext(), "Click Button3", Toast.LENGTH_SHORT).show();
        } else if (str.equals("3")) {
            Toast.makeText(getApplicationContext(), "Click Button4", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Click Button5", Toast.LENGTH_SHORT).show();
        }
        */
    }
}
