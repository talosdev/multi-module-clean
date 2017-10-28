package talosdev.clean.sections.search;

import android.content.Context;
import android.content.Intent;

import talosdev.clean.R;
import talosdev.clean.sections.SectionBaseActivity;

public class SearchActivity extends SectionBaseActivity {


    public static Intent newIntent(Context context) {
        Intent i = new Intent(context, SearchActivity.class);

        return i;
    }


    @Override
    protected int getLayoutResource() {
        return R.layout.search_activity;
    }
}
