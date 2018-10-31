package shoubiaozhiling.easicare.com.dianzandonghua;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import shoubiaozhiling.easicare.com.dianzandonghua.adapters.ListAdapter;

public class ListActivity extends AppCompatActivity {

    @BindView(R.id.list_view)
    RecyclerView listView;
    private ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ButterKnife.bind(this);

        adapter = new ListAdapter(this);
        listView.setAdapter(adapter);

    }
}
