package pe.cibertec.trabajofinalcibertec.data.net;

import java.util.List;

import javax.security.auth.callback.Callback;

import pe.cibertec.trabajofinalcibertec.data.entity.TasksEntity;
import pe.cibertec.trabajofinalcibertec.data.entity.UsersEntity;


/**
 * Created by USUARIO on 2/06/2017.
 */

public interface RestApi {

    void getUsersList(Callback<List<UsersEntity>> callback);

    void loginUsers(UsersEntity usersEntity, Callback<UsersEntity> callback);

    void getTasksList(Callback<List<TasksEntity>> callBack);

    void getTask(Callback<TasksEntity> callBack);

    void insertTask(Callback<TasksEntity> callBack);

    void updateTask(Callback<TasksEntity> callBack);

    void deleteTask(Callback<TasksEntity> callBack);

    interface Callback<T>{
        void onSuccess(T response);

        void onError(Throwable e);
    }
}
