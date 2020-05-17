package belluste.chitarra;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {

    private SoundPool sounds;
    private int sSE, sSA, sSD, sSG, sSB, sSe6;

    @SuppressLint("ClickableViewAccessibility")
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

        ImageView SE = findViewById(R.id.SE);
        ImageView SA = findViewById(R.id.SA);
        ImageView SD = findViewById(R.id.SD);
        ImageView SG = findViewById(R.id.SG);
        ImageView SB = findViewById(R.id.SB);
        ImageView se6 = findViewById(R.id.Se6);

        SE.setOnTouchListener(this);
        SA.setOnTouchListener(this);
        SD.setOnTouchListener(this);
        SG.setOnTouchListener(this);
        SB.setOnTouchListener(this);
        se6.setOnTouchListener(this);

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            sounds = new SoundPool(6, AudioManager.STREAM_MUSIC, 0);
        } else {
            AudioAttributes attributi = new AudioAttributes.Builder().setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION).setUsage(AudioAttributes.USAGE_GAME).build();
            sounds = new SoundPool.Builder().setAudioAttributes(attributi).setMaxStreams(6).build();
        }

        sSE = sounds.load(getApplicationContext(), R.raw.note6_e, 1);
        sSA = sounds.load(getApplicationContext(), R.raw.note5_a, 1);
        sSD = sounds.load(getApplicationContext(), R.raw.note4_d, 1);
        sSG = sounds.load(getApplicationContext(), R.raw.note3_g, 1);
        sSB = sounds.load(getApplicationContext(), R.raw.note2_b, 1);
        sSe6 = sounds.load(getApplicationContext(), R.raw.note1_e, 1);
    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (v.getId()) {
            case R.id.SE:
                sounds.play(sSE, 1.0f, 1.0f, 1, 0, 1.0f);
                break;
            case R.id.SA:
                sounds.play(sSA, 1.0f, 1.0f, 1, 0, 1.0f);
                break;
            case R.id.SD:
                sounds.play(sSD, 1.0f, 1.0f, 1, 0, 1.0f);
                break;
            case R.id.SG:
                sounds.play(sSG, 1.0f, 1.0f, 1, 0, 1.0f);
                break;
            case R.id.SB:
                sounds.play(sSB, 1.0f, 1.0f, 1, 0, 1.0f);
                break;
            case R.id.Se6:
                sounds.play(sSe6, 1.0f, 1.0f, 1, 0, 1.0f);
                break;
        }

        return false;
    }
}
