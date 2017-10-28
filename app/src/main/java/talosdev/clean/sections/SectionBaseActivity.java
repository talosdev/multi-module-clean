package talosdev.clean.sections;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import talosdev.clean.R;

public abstract class SectionBaseActivity extends AppCompatActivity {

    @BindView(R.id.section_title)
    protected TextView titleTextView;

    protected void onSwipeDown() {
        onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResource());

        ButterKnife.bind(this);


        titleTextView.setOnTouchListener(new View.OnTouchListener() {
            public static final float EPSILON = 50.0f;
            public float y0;
            public float y1;
            public float y;

            @Override
            public boolean onTouch(final View v, final MotionEvent event) {
                switch (event.getActionMasked()) {
                    case MotionEvent.ACTION_DOWN:
                        y0 = event.getY();
                        return true;
                    case MotionEvent.ACTION_UP:
                        y = event.getY();
                        if (y - y0 > EPSILON) {
                            onSwipeDown();
                            return true;
                        }
                    case MotionEvent.ACTION_MOVE:
                        y = event.getY();
                        if (y - y0 > EPSILON) {
                            y1 = y;
                        }
                        return true;
                    case MotionEvent.ACTION_CANCEL:
                        if (y1 > 0) {
                            onSwipeDown();
                            return true;
                        }
                }
                return false;
            }
        });

    }

    protected abstract int getLayoutResource();
}
