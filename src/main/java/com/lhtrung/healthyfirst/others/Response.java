package com.lhtrung.healthyfirst.others;

import com.lhtrung.healthyfirst.model.Area;

import java.util.List;
import java.util.Optional;

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
