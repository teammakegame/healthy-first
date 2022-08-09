//package com.lhtrung.healthyfirst.service;
//
//import com.lhtrung.healthyfirst.dao.AreaDao;
//import com.lhtrung.healthyfirst.model.Area;
//import com.lhtrung.healthyfirst.others.Response;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//
//@Service
//public class AreaImpl implements AreaService{
//
//    @Autowired
//    private AreaDao areaDao;
//
//    @Override
//    public ArrayList<Area> getAllAreas(String page, String limit) {
//        return areaDao.getAll(Integer.parseInt(page), Integer.parseInt(limit));
//    }
//
//    @Override
//    public Object getArea(String code) {
//        //Response res = new Response();
//        //areaDao.getByCode(code);
//        return areaDao.getByCode(code);
//    }
//
//    @Override
//    public Object createArea(Area area) {
//        return areaDao.create(area.getArea_code(), area.getArea_name(), area.getArea_type());
//    }
//
//    @Override
//    public Object updateArea(String code, Area area) {
//        return areaDao.updateBy(code, area.getArea_type(), area.getIs_managed());
//    }
//
//    @Override
//    public Object deleteArea(String code) {
//        return areaDao.deleteBy(code);
//    }
//}
