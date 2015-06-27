package math.runner.edu.funmathstory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class Content2Detail3Activity extends Activity implements View.OnClickListener {
    View content1;

    int imageViewIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_2_detail_3);

        content1 = findViewById(R.id.content_2_3_1);

        Button homeBtn = (Button) findViewById(R.id.button);
        Button btn1 = (Button) findViewById(R.id.button1);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);
        Button btn4 = (Button) findViewById(R.id.button4);


        final ImageView imageView2_2_3 = (ImageView) findViewById(R.id.imageView2_2_3);
        imageView2_2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewIndex++;
                switch (imageViewIndex) {
                    case 1: imageView2_2_3.setImageResource(R.drawable.c2_2_4_1);
                        break;
                    case 2: imageView2_2_3.setImageResource(R.drawable.c2_2_4_2);
                        break;
                    case 3: imageView2_2_3.setImageResource(R.drawable.c2_2_4_3);
                        break;
                    default:
                        imageViewIndex = 0;
                }
            }
        });

        homeBtn.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        content1.setOnClickListener(this);

    }

    @Override
    protected void onResume() {
        super.onResume();
        imageViewIndex = 0;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.button1:
                startActivity(new Intent(this, Content2Activity.class));
                break;
            case R.id.button2:
                startActivity(new Intent(this, Content2Detail1Activity.class));
                break;
            case R.id.button3:
                startActivity(new Intent(this, Content2Detail3Activity.class));
                break;
            case R.id.button4:
                startActivity(new Intent(this, Content2Detail3Activity.class));

        }
    }
}
