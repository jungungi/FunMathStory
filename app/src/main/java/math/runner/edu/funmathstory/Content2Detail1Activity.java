package math.runner.edu.funmathstory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class Content2Detail1Activity extends Activity implements View.OnClickListener {
    View content1;
    View content2;
    View content3;
    View content4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_2_detail_1);

        Button homeBtn = (Button) findViewById(R.id.button);
        Button btn1 = (Button) findViewById(R.id.button1);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);
        Button btn4 = (Button) findViewById(R.id.button4);
        ImageButton imageBtn1 = (ImageButton) findViewById(R.id.imageButton1);
        ImageButton imageBtn2 = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton imageBtn3 = (ImageButton) findViewById(R.id.imageButton3);

        homeBtn.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        imageBtn1.setOnClickListener(this);
        imageBtn2.setOnClickListener(this);
        imageBtn3.setOnClickListener(this);

        content1 = findViewById(R.id.content_2_1_1);
        content2 = findViewById(R.id.content_2_1_2);
        content3 = findViewById(R.id.content_2_1_3);
        content4 = findViewById(R.id.content_2_1_4);

        content1.setVisibility(View.VISIBLE);
        content2.setVisibility(View.GONE);
        content3.setVisibility(View.GONE);
        content4.setVisibility(View.GONE);

        content2.setOnClickListener(this);
        content3.setOnClickListener(this);
        content4.setOnClickListener(this);
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
                content1.setVisibility(View.VISIBLE);
                content2.setVisibility(View.GONE);
                content3.setVisibility(View.GONE);
                content4.setVisibility(View.GONE);
                break;
            case R.id.imageButton1:
                content1.setVisibility(View.GONE);
                content2.setVisibility(View.VISIBLE);
                content3.setVisibility(View.GONE);
                content4.setVisibility(View.GONE);
                break;
            case R.id.imageButton2:
                content1.setVisibility(View.GONE);
                content2.setVisibility(View.GONE);
                content3.setVisibility(View.VISIBLE);
                content4.setVisibility(View.GONE);
                break;
            case R.id.imageButton3:
                content1.setVisibility(View.GONE);
                content2.setVisibility(View.GONE);
                content3.setVisibility(View.GONE);
                content4.setVisibility(View.VISIBLE);
                break;
            case R.id.content_2_1_2:
                content1.setVisibility(View.GONE);
                content2.setVisibility(View.GONE);
                content3.setVisibility(View.VISIBLE);
                content4.setVisibility(View.GONE);
                break;
            case R.id.content_2_1_3:
                content1.setVisibility(View.GONE);
                content2.setVisibility(View.GONE);
                content3.setVisibility(View.GONE);
                content4.setVisibility(View.VISIBLE);
                break;
            case R.id.content_2_1_4:
                content1.setVisibility(View.VISIBLE);
                content2.setVisibility(View.GONE);
                content3.setVisibility(View.GONE);
                content4.setVisibility(View.GONE);
                break;

        }
    }
}
