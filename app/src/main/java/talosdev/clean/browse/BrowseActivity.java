package talosdev.clean.browse;

import android.content.Context;
import android.content.Intent;

import talosdev.clean.R;
import talosdev.clean.common.SectionBaseActivity;

public class BrowseActivity extends SectionBaseActivity {


    public static Intent newIntent(Context context) {
        Intent i = new Intent(context, BrowseActivity.class);

        return i;
    }


    @Override
    protected int getLayoutResource() {
        return R.layout.browse_activity;
    }
}
