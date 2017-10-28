package talosdev.clean.browse;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import talosdev.clean.R;

public class BrowseActivity extends AppCompatActivity {


    public static Intent newIntent(Context context) {
        Intent i = new Intent(context, BrowseActivity.class);

        return i;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.browse_activity);
    }
}
