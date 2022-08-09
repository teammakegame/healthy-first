package com.lhtrung.healthyfirst.dao.crud;

public interface ListDao extends Dao{
    Object getData(Object keywords);
    Object updateData(Object params, Object data);
    Object deleteData(Object params);
}
