package pe.cibertec.trabajofinalcibertec.data.net;

import java.util.List;

import pe.cibertec.trabajofinalcibertec.data.entity.TasksEntity;
import pe.cibertec.trabajofinalcibertec.data.entity.UsersEntity;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by USUARIO on 3/06/2017.
 */

public interface TasksService {

    String BASE_URL = "https://api.backendless.com/AC6D7008-261B-EEDB-FFF2-\n" +
            "CB324366E900/25C3B188-DF06-03F0-FF1E-BD96B0768500/data/";

    @GET("Reminder")
    Call<List<TasksEntity>> getTasksList(@Query("pageSize") int pageSize);

   /* @GET("Reminder/{objectId}")
    Call<TasksEntity> getTask(@Path("objectId") String objectId);
*/
}
