//package com.lhtrung.healthyfirst.dao;
//
//import com.lhtrung.healthyfirst.dao.crud.Dao;
//import com.lhtrung.healthyfirst.model.Area;
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
//public class AreaDao implements Dao<Area> {
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
////    DriverManagerDataSource dataSource = new DriverManagerDataSource();
////    dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
////    dataSource.setUrl("jdbc:oracle:thin:@//localhost:1521/orcl");
////    dataSource.setUsername("admin");
////    dataSource.setPassword("admin");
//
//    @Override
//    public Area getByCode(String areaCode) {
//        jdbcTemplate.setResultsMapCaseInsensitive(true);
//        SimpleJdbcCall OK = new SimpleJdbcCall(jdbcTemplate).withCatalogName("BASIC_CRUD").withProcedureName("Get_Area_By_Code").returningResultSet("Area", BeanPropertyRowMapper.newInstance(Area.class));
//        SqlParameterSource inParams = new MapSqlParameterSource().addValue("code", areaCode);
//        Map<String, Object> outParams = OK.execute(inParams);
//        ArrayList<Area> area = (ArrayList<Area>) outParams.get("Area");
//        return area.get(0);
//    }
//
//    @Override
//    public ArrayList<Area> getAll(int page, int limit) {
//        jdbcTemplate.setResultsMapCaseInsensitive(true);
//        SimpleJdbcCall OK = new SimpleJdbcCall(jdbcTemplate).withCatalogName("BASIC_CRUD").withProcedureName("Get_All_Areas").returningResultSet("Areas", BeanPropertyRowMapper.newInstance(Area.class));
//        SqlParameterSource inParams = new MapSqlParameterSource().addValue("page_order", page).addValue("limit_order", limit);
//        Map<String, Object> outParams = OK.execute(inParams);
//        ArrayList<Area> area = (ArrayList<Area>) outParams.get("Areas");
//        return area;
//    }
//
//    @Override
//    public Area create(String code, String name, String type) {
//        jdbcTemplate.setResultsMapCaseInsensitive(true);
//        SimpleJdbcCall OK = new SimpleJdbcCall(jdbcTemplate).withCatalogName("BASIC_CRUD").withProcedureName("Create_Area").returningResultSet("Area", BeanPropertyRowMapper.newInstance(Area.class));
//        SqlParameterSource inParams = new MapSqlParameterSource().addValue("code", code).addValue("area_name", name).addValue("area_type", type);
//        Map<String, Object> outParams = OK.execute(inParams);
//        ArrayList<Area> area = (ArrayList<Area>) outParams.get("Area");
//        return area.get(0);
//    }
//
//    @Override
//    public Area updateBy(String code, String type, Boolean is_managed) {
//        jdbcTemplate.setResultsMapCaseInsensitive(true);
//        SimpleJdbcCall OK = new SimpleJdbcCall(jdbcTemplate).withCatalogName("BASIC_CRUD").withProcedureName("Update_Area_By_Code").returningResultSet("Area", BeanPropertyRowMapper.newInstance(Area.class));
//        SqlParameterSource inParams = new MapSqlParameterSource().addValue("code", code).addValue("type_of_area", type).addValue("status", is_managed ? 1 : 2);
//        Map<String, Object> outParams = OK.execute(inParams);
//        ArrayList<Area> area = (ArrayList<Area>) outParams.get("Area");
//        return area.get(0);
//    }
//
//    public Area deleteBy(String code) {
//        jdbcTemplate.setResultsMapCaseInsensitive(true);
//        SimpleJdbcCall OK = new SimpleJdbcCall(jdbcTemplate).withCatalogName("BASIC_CRUD").withProcedureName("Delete_Area_By_Code").returningResultSet("Area", BeanPropertyRowMapper.newInstance(Area.class));
//        SqlParameterSource inParams = new MapSqlParameterSource().addValue("code", code);
//        Map<String, Object> outParams = OK.execute(inParams);
//        ArrayList<Area> area = (ArrayList<Area>) outParams.get("Area");
//        return area.get(0);
//    }
//}
