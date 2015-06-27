package math.runner.edu.funmathstory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Sub4Activity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_4);

        Button btn = (Button) findViewById(R.id.button);
        ImageButton ib2 = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton ib3 = (ImageButton) findViewById(R.id.imageButton3);

        btn.setOnClickListener(this);
        ib2.setOnClickListener(this);
        ib3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.imageButton2:
                startActivity(new Intent(this, Sub5Activity.class));
                break;
            case R.id.imageButton3:
                startActivity(new Intent(this, Sub6Activity.class));
                break;
        }
    }
}
