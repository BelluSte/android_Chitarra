package belluste.chitarra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {

    private ImageView SE, SA, SD, SG, SB, Se6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View mainView = getWindow().getDecorView();
        mainView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE |
                View.SYSTEM_UI_FLAG_FULLSCREEN |
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION |
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE);

        SE = findViewById(R.id.SE);
        SA = findViewById(R.id.SA);
        SD = findViewById(R.id.SD);
        SG = findViewById(R.id.SG);
        SB = findViewById(R.id.SB);
        Se6 = findViewById(R.id.Se6);

        SE.setOnTouchListener(this);
        SA.setOnTouchListener(this);
        SD.setOnTouchListener(this);
        SG.setOnTouchListener(this);
        SB.setOnTouchListener(this);
        Se6.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (v.getId()) {
            case R.id.SE:

            case R.id.SA:

            case R.id.SD:

            case R.id.SG:

            case R.id.SB:

            case R.id.Se6:

        }

        return false;
    }
}
