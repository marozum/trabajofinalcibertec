package pe.cibertec.trabajofinalcibertec.presentation.view.activity;

import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import pe.cibertec.trabajofinalcibertec.R;
import pe.cibertec.trabajofinalcibertec.presentation.util.Constants;
import pe.cibertec.trabajofinalcibertec.presentation.view.fragment.TaskListFragment;
import butterknife.BindView;

public class TasksMainActivity extends AppCompatActivity
        implements TaskListFragment.OnTaskEventListener,
        View.OnClickListener{
    private String user_troken="";

    @BindView(R.id.btn_new)
    FloatingActionButton btn_new;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks_main);

        if (savedInstanceState == null){
            user_troken = getIntent().getStringExtra(Constants.NAME_USER_TOKEN_PARAM);
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.add(android.R.id.content, TaskListFragment.newInstance(user_troken));
            ft.commit();
        }
        btn_new.setOnClickListener(this);
    }

    @Override
    public void onTaskEvent(Uri uri) {

    }

    @Override
    public void onClick(View v) {

    }
}
