package math.runner.edu.funmathstory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;


public class Sub2Activity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_2);

        Button btn = (Button) findViewById(R.id.button);
        ImageButton ib1 = (ImageButton) findViewById(R.id.imageButton);
        ImageButton ib3 = (ImageButton) findViewById(R.id.imageButton3);
        ImageView image2 = (ImageView) findViewById(R.id.imageView);

        btn.setOnClickListener(this);
        ib1.setOnClickListener(this);
        ib3.setOnClickListener(this);
        image2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                startActivity(new Intent(this, Main2Activity.class));
                break;
            case R.id.imageButton:
                startActivity(new Intent(this, Sub1Activity.class));
                break;
            case R.id.imageButton3:
                startActivity(new Intent(this, Sub3Activity.class));
                break;
            case R.id.imageView:
                startActivity(new Intent(this, Content2Activity.class));
                break;
        }
    }
}
