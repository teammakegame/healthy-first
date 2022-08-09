package com.lhtrung.healthyfirst.dao.crud;

public interface Dao {
    Object getDataById(String id);
    Object createData(Object data);
    Object updateDataById(String id, Object data);
    Object deleteDataById(String id);
    Object ok();
}
