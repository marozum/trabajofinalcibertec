package pe.cibertec.trabajofinalcibertec.presentation.view.fragment;

import butterknife.BindView;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import java.util.List;

import butterknife.Unbinder;
import pe.cibertec.trabajofinalcibertec.R;
import pe.cibertec.trabajofinalcibertec.presentation.TasksView;
import pe.cibertec.trabajofinalcibertec.presentation.adapter.TaskAdapter;
import pe.cibertec.trabajofinalcibertec.presentation.model.TaskModel;
import pe.cibertec.trabajofinalcibertec.presentation.util.Constants;

public class TaskListFragment extends Fragment
        implements TaskAdapter.OnItemClickListener,
                    TasksView{
    @BindView(R.id.list_tareas)
    RecyclerView list_tareas;

    @BindView(R.id.progress_tasks)
    ProgressBar progress_tasks;

    private Unbinder unbinder;
    private String token;
    private OnTaskEventListener mListener;

    public TaskListFragment() {
        // Required empty public constructor
    }

    public static TaskListFragment newInstance(String token) {
        TaskListFragment fragment = new TaskListFragment();
        Bundle args = new Bundle();
        args.putString(Constants.NAME_USER_TOKEN_PARAM, token);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            token = getArguments().getString(Constants.NAME_USER_TOKEN_PARAM);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_task_list, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnTaskEventListener) {
            mListener = (OnTaskEventListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onItemClick(TaskModel tarea) {

    }

    @Override
    public void showLoading() {
        progress_tasks.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        progress_tasks.setVisibility(View.GONE);
    }

    @Override
    public void showError(String errorMessage) {
        Snackbar.make(list_tareas, errorMessage, Snackbar.LENGTH_INDEFINITE)
                .setAction("Retry", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        getTasks();
                    }
                }).show();
    }

    @Override
    public Context context() {
        return getContext();
    }

    @Override
    public void getTasks() {

    }

    @Override
    public void renderTasks(List<TaskModel> taskModelList) {

    }


    public interface OnTaskEventListener {
        void onTaskEvent(Uri uri);
    }
}
