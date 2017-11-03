package wenge.com.drawingboard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import wenge.com.drawingboard.view.DrawView;

public class MainActivity extends AppCompatActivity {

    private DrawView mDrawView;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDrawView = findViewById(R.id.draw_view);
    }

    public void reset(View view) {
        mDrawView.reset();
    }
}
