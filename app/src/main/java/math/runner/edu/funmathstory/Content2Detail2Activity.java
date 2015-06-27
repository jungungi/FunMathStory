package math.runner.edu.funmathstory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class Content2Detail2Activity extends Activity implements View.OnClickListener {
    View content1;
    View content3;

    int imageViewIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_2_detail_2);

        content1 = findViewById(R.id.content_2_2_1);
        content3 = findViewById(R.id.content_2_2_3);

        Button homeBtn = (Button) findViewById(R.id.button);
        Button btn1 = (Button) findViewById(R.id.button1);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);
        Button btn4 = (Button) findViewById(R.id.button4);

        TextView textView1 = (TextView) findViewById(R.id.text1_1);
        TextView textView2 = (TextView) findViewById(R.id.text1_2);
        TextView textView3 = (TextView) findViewById(R.id.text1_3);
        TextView textView4 = (TextView) findViewById(R.id.text1_4);
        TextView textView5 = (TextView) findViewById(R.id.text2_1);

        final ImageView imageView2_2_3 = (ImageView) findViewById(R.id.imageView2_2_3);
        imageView2_2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewIndex++;
                switch (imageViewIndex) {
                    case 1: imageView2_2_3.setImageResource(R.drawable.c2_2_3_1);
                        break;
                    case 2: imageView2_2_3.setImageResource(R.drawable.c2_2_3_2);
                        break;
                    case 3: imageView2_2_3.setImageResource(R.drawable.c2_2_3_3);
                        break;
                    case 4: imageView2_2_3.setImageResource(R.drawable.c2_2_3_4);
                        break;
                    case 5: imageView2_2_3.setImageResource(R.drawable.c2_2_3_5);
                        break;
                    case 6: imageView2_2_3.setImageResource(R.drawable.c2_2_3_6);
                        break;
                    default:
                        imageViewIndex = 1;
                        content1.setVisibility(View.VISIBLE);
                        content3.setVisibility(View.GONE);
                }
            }
        });

        homeBtn.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        content1.setOnClickListener(this);

        textView1.setText(Html.fromHtml("1. a<sup>2</sup> +- ab + b<sup>2</sup> = (a +- b)<sup>2</sup>"));
        textView2.setText(Html.fromHtml("2. a<sup>2</sup>-b<sup>2</sup> = (a+b)(a-b)"));
        textView3.setText(Html.fromHtml("3. x<sup>2</sup>(a+b)x + ab = (x + a)(x + b)"));
        textView4.setText(Html.fromHtml("4. acx<sup>2</sup> + (ad + bc)x + bd = (ax + b)(cx + d)"));
        textView5.setText(Html.fromHtml("5. 완전제곱식"));
    }

    @Override
    protected void onResume() {
        super.onResume();
        content1.setVisibility(View.VISIBLE);
        content3.setVisibility(View.GONE);
        imageViewIndex = 1;
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
                startActivity(new Intent(this, Content2Detail2Activity.class));
                break;
            case R.id.button4:
                startActivity(new Intent(this, Content2Detail3Activity.class));
                break;
            case R.id.content_2_2_1:
                content1.setVisibility(View.GONE);
                content3.setVisibility(View.VISIBLE);
                break;

        }
    }
}
