package com.lhtrung.healthyfirst.service;

public interface xmlService {
    Object read(String id);
    Object readAll();
    Object edit(Object obj);
    Object create(Object obj);
    void remove();
}
