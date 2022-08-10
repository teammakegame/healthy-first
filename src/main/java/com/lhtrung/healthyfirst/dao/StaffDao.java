//package com.lhtrung.healthyfirst.dao;
//
//import com.lhtrung.healthyfirst.dao.crud.Dao;
//import com.lhtrung.healthyfirst.domain.model.Area;
//import com.lhtrung.healthyfirst.domain.model.user.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
//import org.springframework.jdbc.core.namedparam.SqlParameterSource;
//import org.springframework.jdbc.core.simple.SimpleJdbcCall;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.Map;
//
//@Component
//public class UserDao implements Dao {
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    @Override
//    public Object getDataById(String id) {
//        jdbcTemplate.setResultsMapCaseInsensitive(true);
//        SimpleJdbcCall OK = new SimpleJdbcCall(jdbcTemplate).withCatalogName("BASIC_CRUD").withProcedureName("Get_Area_By_Code").returningResultSet("Area", BeanPropertyRowMapper.newInstance(Area.class));
//        SqlParameterSource inParams = new MapSqlParameterSource().addValue("code", areaCode);
//        Map<String, Object> outParams = OK.execute(inParams);
//        ArrayList<Area> area = (ArrayList<Area>) outParams.get("Area");
//        return area.get(0);
//    }
//
//    @Override
//    public Object createData(Object data) {
//        return data;
//    }
//
//    @Override
//    public Object updateDataById(String id, Object data) {
//        return data;
//    }
//
//    @Override
//    public Object deleteDataById(String id){
//        return new Object();
//    }
//}
