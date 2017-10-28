package talosdev.clean.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import talosdev.clean.R;
import talosdev.clean.browse.BrowseActivity;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.search_text)
    TextView searchTextView;

    @BindView(R.id.browse_text)
    TextView browseTextView;

    @BindView(R.id.search)
    View searchView;

    @BindView(R.id.browse)
    View browseView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        ButterKnife.bind(this);
    }


    @OnClick(R.id.browse)
    public void onBrowseClick() {
        startActivity(BrowseActivity.newIntent(this));
    }


    @OnClick(R.id.search)
    public void onSearchClick() {

    }
}
