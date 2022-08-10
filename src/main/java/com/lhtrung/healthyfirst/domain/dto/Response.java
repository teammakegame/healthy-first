package com.lhtrung.healthyfirst.domain.dto;

import com.lhtrung.healthyfirst.domain.model.Area;

import java.util.List;

public class Response {
    private List<Area> data;

    public List<Area> getData() {
        return data;
    }

    public void setData(List<Area> data) {
        this.data = data;
    }

    public void addData(Area data) { this.data.add(data);}
}
