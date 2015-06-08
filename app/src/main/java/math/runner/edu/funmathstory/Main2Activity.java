package math.runner.edu.funmathstory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Main2Activity extends Activity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);
        Button b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(this);

        ImageButton ib1 = (ImageButton) findViewById(R.id.imageButton);
        ImageButton ib2 = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton ib3 = (ImageButton) findViewById(R.id.imageButton3);
        ib1.setOnClickListener(this);
        ib2.setOnClickListener(this);
        ib3.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.imageButton:
                startActivity(new Intent(this, Sub1Activity.class));
                break;
            case R.id.imageButton2:
                startActivity(new Intent(this, Sub2Activity.class));
                break;
            case R.id.imageButton3:
                startActivity(new Intent(this, Sub3Activity.class));
                break;
        }
    }
}
