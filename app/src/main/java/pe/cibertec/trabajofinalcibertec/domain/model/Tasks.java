package pe.cibertec.trabajofinalcibertec.domain.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import pe.cibertec.trabajofinalcibertec.data.entity.TasksEntity;

/**
 * Created by USUARIO on 3/06/2017.
 */

public class Tasks {

    private Object objectId;

    private String title;

    private boolean remember;

    private String dateTime;


    public Object getObjectId() {
        return objectId;
    }

    public void setObjectId(Object objectId) {
        this.objectId = objectId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isRemember() {
        return remember;
    }

    public void setRemember(boolean remember) {
        this.remember = remember;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }


}
