package pe.cibertec.trabajofinalcibertec.data.entity.mapper;

import java.util.ArrayList;
import java.util.List;

import pe.cibertec.trabajofinalcibertec.data.entity.TasksEntity;
import pe.cibertec.trabajofinalcibertec.data.entity.UsersEntity;
import pe.cibertec.trabajofinalcibertec.domain.model.Tasks;
import pe.cibertec.trabajofinalcibertec.domain.model.Users;

/**
 * Created by USUARIO on 3/06/2017.
 */

public class TasksEntityDataMapper {

    public TasksEntityDataMapper() {
    }

    public Tasks transform(TasksEntity usersEntity) {
        Tasks tasks = new Tasks();
        tasks.setObjectId(usersEntity.getObjectId());
        tasks.setTitle(usersEntity.getTitle());
        tasks.setRemember(usersEntity.isRemember());
        tasks.setDateTime(usersEntity.getDateTime());
        return tasks;
    }


    public List<Tasks> transform(List<TasksEntity> tasksEntityList) {
        List<Tasks> tasksList = new ArrayList<>();
        for (TasksEntity tasksEntity : tasksEntityList) {
            tasksList.add(transform(tasksEntity));
        }
        return tasksList;
    }
}
