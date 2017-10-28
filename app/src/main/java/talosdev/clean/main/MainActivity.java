package talosdev.clean.main;

import android.app.ActivityOptions;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import talosdev.clean.R;
import talosdev.clean.browse.BrowseActivity;
import talosdev.clean.search.SearchActivity;

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
        ActivityOptions options = ActivityOptions
                .makeSceneTransitionAnimation(this, browseTextView,
                        getString(R.string.browse_title_transition));

        startActivity(BrowseActivity.newIntent(this),
                options.toBundle());

    }


    @OnClick(R.id.search)
    public void onSearchClick() {
        ActivityOptions options = ActivityOptions
                .makeSceneTransitionAnimation(this, searchTextView,
                        getString(R.string.search_title_transition));

        startActivity(SearchActivity.newIntent(this),
                options.toBundle());
    }
}
