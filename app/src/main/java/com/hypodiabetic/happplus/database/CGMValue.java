package com.hypodiabetic.happplus.database;

import java.util.Date;

import io.realm.RealmObject;

/**
 * Created by Tim on 25/12/2016.
 * Simple CGM Value Object used for local storage of values
 */

public class CGMValue extends RealmObject{

    public Integer getSgv() {
        return sgv;
    }

    public void setSgv(Integer sgv) {
        this.sgv = sgv;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    private Integer sgv;
    private String source;
    private Date timestamp;
}
