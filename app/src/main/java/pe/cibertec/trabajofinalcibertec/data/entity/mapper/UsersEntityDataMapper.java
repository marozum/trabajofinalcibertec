package pe.cibertec.trabajofinalcibertec.data.entity.mapper;

import java.util.ArrayList;
import java.util.List;

import pe.cibertec.trabajofinalcibertec.data.entity.UsersEntity;
import pe.cibertec.trabajofinalcibertec.domain.model.Users;

/**
 * Created by USUARIO on 2/06/2017.
 */

public class UsersEntityDataMapper {

    public UsersEntityDataMapper() {
    }

    public Users transform(UsersEntity usersEntity) {
        Users users = new Users();
        users.setObjectId(usersEntity.getObjectId());
        users.setName(usersEntity.getName());
        users.setUserToken(usersEntity.getUserToken());
        users.setEmail(usersEntity.getEmail());
        users.setPassword(usersEntity.getPassword());
        return users;
    }


    public List<Users> transform(List<UsersEntity> usersEntityList) {
        List<Users> usersList = new ArrayList<>();
        for (UsersEntity newsEntity : usersEntityList) {
            usersList.add(transform(newsEntity));
        }
        return usersList;
    }
}
