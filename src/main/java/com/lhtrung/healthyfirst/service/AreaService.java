package com.lhtrung.healthyfirst.service;

import com.lhtrung.healthyfirst.domain.model.Area;

import java.util.ArrayList;

public interface AreaService {
    ArrayList<Area> getAllAreas(String page, String limit);
    Object getArea(String code);
    Object createArea(Area area);
    Object updateArea(String code, Area area);
    Object deleteArea(String code);

}
